const state = {
    DEAD: "DEAD",
    ALIVE: "ALIVE"
};
const population = {
    UNDER_POPULATION: () => state.DEAD,
    THREE_NEIGHBOURS: () => state.ALIVE,
    OVER_CROWDING: () => state.DEAD,
    TWO_NEIGHBOURS: initialState => initialState
};

const nextState = (initialState, neighbours) => neighbours(initialState);

module.exports = {
    state, population, nextState
};