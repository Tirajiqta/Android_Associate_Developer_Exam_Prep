fun main(args: Array<String>) {
    val trafficLightColor = "Yellow"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else {
        println("Go")
    }

    val x = 3

    when (x) {
        2 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
    }

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }

    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}
/* NOTES:
Kotlin conditionals
Less than: <
Greater than: >
Less than or equal to: <=
Greater than or equal to: >=
Not equal to: !=
when statements are preferred when there are more than two branches to consider.
A when statement accepts a single value through the parameter.
The value is then evaluated against each of the conditions sequentially.
The corresponding body of the first condition that's met is then executed.
Each condition and body are separated by an arrow (->).
Similar to if/else statements, each pair of condition and body is called a branch in when statements.
Also, similar to the if/else statement, you can add an else branch as your final condition in a when statement that works as a catchall branch.
 */