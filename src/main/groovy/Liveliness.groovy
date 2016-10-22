import static NeighbourCount.THREE
import static NeighbourCount.TWO

enum Liveliness {
    ALIVE{
        def next(NeighbourCount neighbours) {
            (neighbours == TWO || neighbours == THREE) ? this : DEAD
        }
    },
    DEAD{
        def next(NeighbourCount neighbours) {
            neighbours != THREE ? this : ALIVE
        }
    };

    abstract def next(NeighbourCount neighbours);
}
