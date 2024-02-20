import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a number between 1 and 10:")
    val number = scanner.nextInt()

    val numberInSpanish = when (number) {
        1 -> "Uno"
        2 -> "Dos"
        3 -> "Tres"
        4 -> "Cuatro"
        5 -> "Cinco"
        6 -> "Seis"
        7 -> "Siete"
        8 -> "Ocho"
        9 -> "Nueve"
        10 -> "Diez"
        else -> "Number out of range"
    }

    println("Number in Spanish is $numberInSpanish")
}