/**
 * Created by az on 22/10/16.
 */
enum Liveliness {
    ALIVE {
        def next(NeighbourCount neighbours) {
            ALIVE
        }
    }
}
