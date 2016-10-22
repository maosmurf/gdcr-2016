class Cell {
    def Neighbours countNeigbours() {
        def int count = 0
        // loop ...


        switch (count) {
            case 0:
            case 1:
                return Neighbours.LESS_THAN_TWO
            case 2:
                return Neighbours.TWO
            case 3:
                return Neighbours.THREE
            default:
                return Neighbours.MORE_THAN_THREE
        }

    }

}
