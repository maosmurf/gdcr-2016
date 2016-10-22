class RuleRepository {

    def availableRules = [
            Rule.OVERPOPULATION, Rule.LIVE_ON, Rule.RESURRECTION, Rule.STARVATION
    ];

    def find(state, neighbours) {
        return rules.stream().filter({ it.canApply(state, neighbours) }).findFirst()
    }
}
