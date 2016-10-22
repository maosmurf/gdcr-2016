import java.util.function.BiFunction
import java.util.function.BiPredicate

import static Neighbours.*
import static State.ALIVE
import static State.DEAD

enum Rule {

    STARVATION({ state, neighbours ->
        state == ALIVE && neighbours == LESS_THAN_TWO
    }, {
        state, neighbours -> DEAD
    }),
    LIVE_ON({ state, neighbours ->
        state == ALIVE && [TWO, THREE].contains(neighbours)
    }, {
        state, neighbours -> ALIVE
    }),
    OVERPOPULATION({ state, neighbours ->
        state == ALIVE && neighbours == MORE_THAN_THREE
    }, {
        state, neighbours -> DEAD
    }),
    RESURRECTION({ state, neighbours ->
        state == DEAD && neighbours == THREE
    }, {
        state, neighbours -> ALIVE
    }),
    DEFAULT({ state, neighbours ->
        true
    }, {
        state, neighbours -> state
    });

    protected BiPredicate<State, Neighbours> applies;
    protected BiFunction<State, Neighbours, State> result;

    Rule(BiPredicate<State, Neighbours> applies, BiFunction<State, Neighbours, State> result) {
        this.applies = applies
        this.result = result
    }

    def apply(State state, Neighbours neighbours) {
        result.apply(state, neighbours)
    }

    def canApply(State state, Neighbours neighbours) {
        applies.test(state, neighbours)
    }

    def static foobar(State state, Neighbours neighbours) {

        def rules = Arrays.asList(STARVATION, LIVE_ON, OVERPOPULATION, RESURRECTION)

        rules.stream().filter({ it.canApply(state, neighbours) }).findFirst().orElse(DEFAULT).apply(state, neighbours)
    }


}
