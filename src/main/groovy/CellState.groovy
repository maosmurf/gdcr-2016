enum CellState {
    DEAD{
        def NEIGHBOURS_CHANGING_STATE = [Neighbours.THREE]

        def nextState(neighbours) {
            if(NEIGHBOURS_CHANGING_STATE.contains(neighbours))
                ALIVE
            else
                DEAD
        }
    },
    ALIVE {
        def nextState(neighbours) {
            return null
        }
    };


    abstract def nextState(neighbours)
}
