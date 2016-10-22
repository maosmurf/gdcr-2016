enum Liveliness {
    ALIVE,
    DEAD

    def next(NeighbourCount neighbours) {
        neighbours.next(this)
    }
}
