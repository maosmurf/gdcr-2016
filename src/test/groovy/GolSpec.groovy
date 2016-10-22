import spock.lang.Specification

import static Liveliness.ALIVE
import static Liveliness.DEAD
import static NeighbourCount.LESS_THAN_TWO
import static NeighbourCount.THREE
import static NeighbourCount.TWO

class GolSpec extends Specification {

    def "Alive with two neighbours stays alive"() {
        expect:
        ALIVE.next(TWO) == ALIVE
    }

    def "Alive with less than two neighbours dies"() {
        expect:
        ALIVE.next(LESS_THAN_TWO) == DEAD
    }

    def "Dead with three neighbours awakens"() {
        expect:
        DEAD.next(THREE) == ALIVE
    }
}
