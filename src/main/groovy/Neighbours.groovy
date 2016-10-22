import java.util.function.Function

import static State.ALIVE
import static State.DEAD

enum Neighbours {
    ONE({ DEAD }),
    THREE({ALIVE}),
    MORE_THAN_THREE({DEAD});

    final Function<State, State> evolutionFunction;

    Neighbours(Function<State, State> evolutionFunction) {
        this.evolutionFunction = evolutionFunction
    }

    def getNextState(state) {
        evolutionFunction.apply(state)
    }
}
