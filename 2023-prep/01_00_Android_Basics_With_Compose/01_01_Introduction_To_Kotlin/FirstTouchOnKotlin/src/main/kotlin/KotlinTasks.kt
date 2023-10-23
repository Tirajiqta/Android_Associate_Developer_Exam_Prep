fun main(){
//    first task: Can you write a main() function that prints these messages on four separate lines?
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
//    second task: Can you figure out the root cause of the compile errors in this program and fix them?
    println("New chat message from a friend")
//    third task: Can you figure out the root cause of the errors and fix them?
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
// fourth task: Can you figure out the root cause of the errors and fix them?
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults.plus(numberOfKids)
    println("The total party size is: $total")
//  fifth task: Can you figure out the root cause of the errors and fix them?
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//  sixth task: Can you figure out the root cause of the errors and fix them?
    val firstNumber = 10
    val secondNumber = 5
    var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
//  seventh task: Can you figure out the root cause of the errors and fix them?
    result = 0
    val thirdNumber = 8

    result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
//  eight task: Can you figure out the root cause of the errors and fix them?
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

//ninth task: Can you figure out the root cause of the errors and fix them?
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}
fun add(num1: Int, num2: Int): Int{
    return num1 + num2;
}

fun displayAlertMessage(OS: String, emailId: String): String{
    return "There's a new sign-in request on $OS for your Google Account $emailId";
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val burnedForEachStep = 0.04
    return numberOfSteps * burnedForEachStep
}
