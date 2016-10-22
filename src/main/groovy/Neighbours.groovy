import static State.DEAD

enum Neighbours {
    ONE{
        State getNextState(State state) {
            DEAD
        }
    }

    def abstract State getNextState(State state)
}
