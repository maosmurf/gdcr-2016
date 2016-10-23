const cell = require('./cell');

module.exports = class {
    constructor(cells = []) {
            this.cells = cells;
    }

    getStateAt(x, y) {
        if (this.cells.find(cell => cell.x === x && cell.y === y)) {
            return cell.state.ALIVE
        }
        return cell.state.DEAD
    }
};