import static State.ALIVE
import static State.DEAD

enum Neighbours {
    ONE{
        State getNextState(State state) {
            DEAD
        }
    },

    THREE{
        State getNextState(State state) {
            ALIVE
        }
    }

    def abstract State getNextState(State state)
}
