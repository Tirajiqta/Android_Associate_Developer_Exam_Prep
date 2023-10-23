fun main(){
    birthDayGreeting()
    val result = secondBirthdayGreeting()
    println(result)
    val secondResult = birthDayGreetingWithNameParam("George")
    println(secondResult)
    val thirdResult = birthDayGreetingWithMultipleParams("George", 5)
    println(thirdResult)
//  the fourth result shows how to pass in named arguments
    val fourthResult = birthDayGreetingWithMultipleParams(age = 4, name = "Aaron")
    println(fourthResult)
    val fifthResult = birthDayGreetingWithDefaultParam(age = 6)
    println(fifthResult)
}
fun birthDayGreeting(){
    println("Happy birthday!")
}
fun secondBirthdayGreeting(): String{
    return "Happy birthday from a function that returns a String!"
}

fun birthDayGreetingWithNameParam(name: String): String{
    return "Happy birthday $name from a function that accepts name as a parameter and returns a String!"
}

fun birthDayGreetingWithMultipleParams(name: String, age: Int): String{
    return "Happy birthday $name, you are now $age years old from a function that accepts multiple parameters"
}

fun birthDayGreetingWithDefaultParam(name: String = "George", age: Int):String{
    return "Happy birthday $name, you are now $age years old from a function with a default parameter"
}

/* NOTES
Declaring (or defining) a function uses the fun keyword and includes code within the curly braces which contains the instructions needed to execute a task.
Calling a function causes all the code contained in that function to execute.

Note: Although you often find them used interchangeably, a parameter and an argument aren't the same thing.
When you define a function, you define the parameters that are to be passed to it when the function is called.
When you call a function, you pass arguments for the parameters.
Parameters are the variables accessible to the function, such as a name variable, while arguments are the actual values that you pass, such as the "Rover" string.
Warning: Unlike in some languages, such as Java, where a function can change the value passed into a parameter, parameters in Kotlin are immutable.
You cannot reassign the value of a parameter from within the function body.
The function name with its inputs (parameters) are collectively known as the function signature.
The function signature consists of everything before the return type

 */
