import static Liveliness.ALIVE
import static Liveliness.DEAD

enum NeighbourCount {
    LESS_THAN_TWO{
        def next(liveliness) {
            DEAD
        }
    },
    TWO{
        def next(liveliness) {
            liveliness
        }
    },
    THREE{
        def next(liveliness) {
            ALIVE
        }
    },
    MORE_THAN_THREE{
        def next(liveliness) {
            DEAD
        }
    }

    abstract def next(liveliness)
}
