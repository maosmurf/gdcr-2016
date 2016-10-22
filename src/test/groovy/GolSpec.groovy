import spock.lang.Specification

import static Liveliness.ALIVE

class GolSpec extends Specification {

    def "Alive with two neighbours stays alive"() {
        expect:
        ALIVE.next(NeighbourCount.TWO) == ALIVE
    }
    def "Alive with less than two neighbours dies"() {
        expect:
        ALIVE.next(NeighbourCount.LESS_THAN_TWO) == DEAD
    }
}
