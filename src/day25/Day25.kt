package day25

import java.io.File

fun main() {
    val input = File("src/day25", "day25_input.txt").readLines()
    println("Stage 1 answer is ${stageOne(input)}") //
//    println("Stage 2 answer is ${stageTwo(input)}") //
}

fun stageOne(input: List<String>): Int {
    val map = input.map { it.map { it } }.joinToString(separator = "\n")
    println(map)
    return 0
}

fun stageTwo(input: List<String>): Long {
    return 0
}