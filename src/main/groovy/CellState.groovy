enum CellState {
    DEAD{
        def nextState(neighbours) {
            this
        }
    };

    abstract def nextState(neighbours)
}
