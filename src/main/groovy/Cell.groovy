abstract class Cell {

    def Cell next() {
        Rule.next(this.state, this.countNeighbours())
    }

    def abstract countNeighbours()
}
