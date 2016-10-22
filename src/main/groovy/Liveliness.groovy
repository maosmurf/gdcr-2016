import static NeighbourCount.TWO

enum Liveliness {
    ALIVE{
        def next(NeighbourCount neighbours) {
            neighbours == TWO ? ALIVE : DEAD
        }
    },
    DEAD{
        def next(NeighbourCount neighbours) {
            ALIVE
        }
    };

    abstract def next(NeighbourCount neighbours);
}
