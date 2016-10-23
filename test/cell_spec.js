const assert = require('assert');
const cell = require('../src/cell');

describe('next cell state', () => {

    [{
        title: "Alive cell dies due to underpopulation",
        initialState: cell.state.ALIVE,
        population: cell.population.UNDER_POPULATION,
        expectedState: cell.state.DEAD
    }, {
        title: "Alive cell with two neighbours lives on",
        initialState: cell.state.ALIVE,
        population: cell.population.TWO_NEIGHBOURS,
        expectedState: cell.state.ALIVE
    }, {
        title: "Alive cell dies due to overcrowding",
        initialState: cell.state.ALIVE,
        population: cell.population.OVER_CROWDING,
        expectedState: cell.state.DEAD
    }, {
        title: "Dead cell becomes alive with three neighbours",
        initialState: cell.state.DEAD,
        population: cell.population.THREE_NEIGHBOURS,
        expectedState: cell.state.ALIVE
    }, {
        title: "Dead cell with two neighbours stayes dead",
        initialState: cell.state.DEAD,
        population: cell.population.TWO_NEIGHBOURS,
        expectedState: cell.state.DEAD
    }].forEach(({title, initialState, population, expectedState}) => {
        it(title, () => {
            assert.equal(cell.nextState(initialState, population), expectedState)
        });
    });
});
