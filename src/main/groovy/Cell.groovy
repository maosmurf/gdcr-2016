import static CellState.ALIVE
import static CellState.DEAD

class Cell {
    def aliveNeighbours
    def CellState state

    Cell(aliveNeighbours, CellState state) {
        this.aliveNeighbours = aliveNeighbours
        this.state = state
    }

    CellState getNextState() {
        switch (state) {
            case ALIVE:
                return aliveNeighbours < 2 || aliveNeighbours > 3 ? DEAD : ALIVE
            case DEAD:
                return aliveNeighbours == 3 ? ALIVE : DEAD
        }
    }

    @Override
    public String toString() {
        return "Cell{" +
                "aliveNeighbours=" + aliveNeighbours +
                ", state=" + state +
                '}';
    }
}
