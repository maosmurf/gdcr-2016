enum CellState {
    DEAD{
        def nextState(Neighbours) {
            this
        }
    };

    abstract def nextState(neighbours)
}
