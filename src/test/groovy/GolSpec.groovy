import spock.lang.Specification

import static Neighbours.ONE
import static State.ALIVE
import static State.DEAD

class GolSpec extends Specification {

    def "cell with fewer than 2 neighbours dies"() {
        expect:
        Rules.getNextState(ALIVE, ONE) == DEAD
    }
}
