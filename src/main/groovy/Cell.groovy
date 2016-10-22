import static CellState.ALIVE
import static CellState.DEAD

class Cell {
    def aliveNeighbours
    def state

    Cell(aliveNeighbours, state) {
        this.aliveNeighbours = aliveNeighbours
        this.state = state
    }

    CellState getNextState() {
        if (state == ALIVE)
            aliveNeighbours < 2 || aliveNeighbours > 3 ? DEAD : ALIVE
        else
            aliveNeighbours == 3 ? ALIVE : DEAD
    }


    @Override
    public String toString() {
        return "Cell{" +
                "aliveNeighbours=" + aliveNeighbours +
                ", state=" + state +
                '}';
    }
}
