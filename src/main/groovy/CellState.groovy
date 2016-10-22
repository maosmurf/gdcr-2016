enum CellState {
    DEAD{
        def changingStates() {
            [Neighbours.THREE]
        }
    },
    ALIVE {

        def changingStates() {
            return null
        }
    };

    abstract def changingStates()

    def nextState(neighbours) {
        if (changingStates().contains(neighbours)) ALIVE else this
    }

}
