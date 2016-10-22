class Cell {

    def "under-populated alive dies"() {
        given:
            def cell = new Cell(1, ALIVE)
        expect:
            cell.nextState == DEAD
    }

}
