import static State.DEAD

class Rules {
    static State getNextState(State state, Neighbours neighbours) {
        neighbours.getNextState(state)
    }
}
