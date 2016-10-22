import java.util.function.Function

enum State {

    ALIVE({ neighbours ->
        switch (neighbours) {
            case Neighbours.TWO:
            case Neighbours.THREE:
                return ALIVE;
            default:
                return DEAD;
        }
    }),
    DEAD({ neighbours ->
        switch (neighbours) {
            case Neighbours.THREE:
                return ALIVE;
            default:
                return DEAD;
        }
    });

    final Function<Neighbours, State> evolutionFunction;

    State(Function<Neighbours, State> evolutionFunction) {
        this.evolutionFunction = evolutionFunction
    }

    def next(Neighbours neighbours) {
        evolutionFunction.apply(neighbours)
    }

}
