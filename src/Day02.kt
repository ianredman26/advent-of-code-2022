fun main() {
    fun part1(input: List<String>): Int {
        val strategyGuide: MutableMap<String, String> = mutableMapOf()
        val total = 0
        input.map {
            strategyGuide.put(it.first().lowercase(), it.last().lowercase())
        }
        strategyGuide.map { round ->
            when (round.key) {
                "a" -> {
                    total.plus(rock(round.value))
                }

                "b" -> {
                    total.plus(paper(round.value))
                }

                "c" -> {
                    total.plus(scissors(round.value))
                }

                else -> {}
            }
        }
        return total
    }


    val testInput = readInput("Day02_test")
//    check(part1(testInput) == 15)

//    val input = readInput("Day01")
    println(part1(testInput))
//    println(part2(part1(testInput)))
}

// A -> Rock
// X -> Rock 1
// B -> Paper
// Y -> Paper 2
// C -> Scissors
// Z -> Scissors 3
// WIN -> 3
// DRAW -> 1
// LOSS -> 0

fun rock(choice: String): Int {
    return when (choice) {
        "x" -> {
            4
        }

        "y" -> {
            7
        }

        "z" -> {
            3
        }

        else -> {
            0
        }
    }
}

fun paper(choice: String): Int {
    return when (choice) {
        "x" -> {
            1
        }

        "y" -> {
            2
        }

        "z" -> {
            9
        }

        else -> {
            0
        }
    }
}

fun scissors(choice: String): Int {
    return when (choice) {
        "x" -> {
            4
        }

        "y" -> {
            2
        }

        "z" -> {
            4
        }

        else -> {
            0
        }
    }
}
