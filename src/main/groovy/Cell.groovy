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
        aliveNeighbours < 2 || aliveNeighbours > 3 ? DEAD : ALIVE
    }
}
