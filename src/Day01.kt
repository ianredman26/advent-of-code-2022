fun main() {
    fun part1(input: List<String>): List<Pair<Int, Int>> {
        val elves: MutableMap<Int, Int> = mutableMapOf()
        var total = 0
        input.map {
            total = if (it.isEmpty()) {
                elves[elves.size.plus(1)] = total
                0
            } else {
                total.plus(it.toInt())
            }
        }
        return elves.toList().sortedByDescending { (_, value) -> value }
    }

    fun part2(input: List<Pair<Int, Int>>): Int {
        val total = input[0].second.plus(input[1].second).plus(input[3].second)
        return total
    }

    val testInput = readInput("Day01_part1")


    // test if implementation meets criteria from the description, like:

//    check(part1(testInput) == 4)

//    val input = readInput("Day01")
    println(part1(testInput))
    println(part2(part1(testInput)))
}
