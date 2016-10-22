import java.util.function.Function

import static State.ALIVE
import static State.DEAD

enum Neighbours {
    LESS_THAN_TWO({ DEAD }),
    TWO({ state -> state }),
    THREE({ ALIVE }),
    MORE_THAN_THREE({ DEAD });

    final Function<State, State> evolutionFunction;

    Neighbours(Function<State, State> evolutionFunction) {
        this.evolutionFunction = evolutionFunction
    }

    def next(state) {
        evolutionFunction.apply(state)
    }
}
