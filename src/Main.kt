fun main() {
    val number1 = 1
    /*val number2 = 2
    val number3 = 3
    val number4 = 4
    val number5 = 5
    val number6 = 6
    val number7 = 7
    val number8 = 8
    val number9 = 9
    val number10 = 10*/
    var numString = "x"
    var input = ""

    print("Please enter the number one: ")

    numString = input
    input = readLine()!!

    when (number1) {
        1 -> numString = "1 is Uno"
        /*2 -> numString = "2 is Dos"
        3 -> numString = "3 is Tres"
        4 -> numString = "4 is Cuatro"
        5 -> numString = "5 is Cinco"
        6 -> numString = "6 is Seis"
        7 -> numString = "7 is Siete"
        8 -> numString = "8 is Ocho"
        9 -> numString = "9 is Nueve"
        10 -> numString = "10 is Diez"
        !in 1 ..10  -> numString = "Out of Range"
        else -> numString = "Unknown"*/
    }

    /*when (number2){
        2-> numString = "2 is Dos"
    }

    when (number3){
        3-> numString = "3 is Tres"
    }

    when (number4){
        4-> numString = "4 is Cuatro"
    }

    when (number5){
        5-> numString = "5 is Cinco"
    }

    when (number6){
        6-> numString = "6 is Seis"
    }

    when (number7){
        7-> numString = "7 is Siete"
    }

    when (number8){
        8-> numString = "8 is Ocho"
    }

    when (number9){
        9-> numString = "9 is Nueve"
    }

    when (number10){
        10-> numString = "10 is Diez"
    }*/
    println("The number $numString in Spanish. ")
}