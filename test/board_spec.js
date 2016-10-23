const assert = require('assert');
const cell = require('../src/cell');
const Board = require('../src/board');


describe('the board', function () {
    it("An empty board shouldn't have an living cell at position 0,0", function () {
        const board = new Board();
        assert.equal(board.getStateAt(0,0), cell.state.DEAD);
    });
    it("A board with a single living cell should have a living cell", function () {
        const board = new Board([{x:0, y:0}]);
        assert.equal(board.getStateAt(0,0), cell.state.ALIVE);
    });
});