enum CellState {
    DEAD{
        public def other = ALIVE

        def changingStates() {
            [Neighbours.THREE]
        }
    },
    ALIVE{
        public def other = DEAD

        def changingStates() {
            return null
        }
    };

    abstract def changingStates()

    def nextState(neighbours) {
        return changingStates().contains(neighbours) ? this.other : this
    }

}
