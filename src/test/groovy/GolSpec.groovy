import spock.lang.Specification

import static Neighbours.*
import static Neighbours.ONE
import static State.ALIVE
import static State.DEAD

class GolSpec extends Specification {

    def "alive cell with fewer than 2 neighbours dies"() {
        expect:
        Rules.getNextState(ALIVE, ONE) == DEAD
    }

    def "dead cell with three neighbours awakens"() {
        expect:
        Rules.getNextState(DEAD, THREE) == ALIVE
    }

    def "alive cell with more than three neighbours dies"() {
        expect:
        Rules.getNextState(ALIVE, MANY) == DEAD
    }
}
