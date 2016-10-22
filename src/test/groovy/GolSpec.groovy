import spock.lang.Specification

class GolSpec extends Specification {

    def "cell with fewer than 2 neighbours dies"() {
        expect:
            getNextState(ALIVE, 1) == DEAD
    }
}
