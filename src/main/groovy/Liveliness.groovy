import static NeighbourCount.THREE
import static NeighbourCount.TWO

enum Liveliness {
    ALIVE{
        def next(NeighbourCount neighbours) {
            (neighbours == TWO || neighbours == THREE) ? ALIVE : DEAD
        }
    },
    DEAD{
        def next(NeighbourCount neighbours) {
            ALIVE
        }
    };

    abstract def next(NeighbourCount neighbours);
}
