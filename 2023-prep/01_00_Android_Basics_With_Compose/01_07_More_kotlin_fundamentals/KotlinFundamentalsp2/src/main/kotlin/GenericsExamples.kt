//=====START first version
class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
) {
    override fun toString(): String {
        return "question = $questionText answer = $answer difficulty = $difficulty"
    }
}

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String

) {
    override fun toString(): String {
        return "question = $questionText answer = $answer difficulty = $difficulty"
    }
}

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
) {
    override fun toString(): String {
        return "question = $questionText answer = $answer difficulty = $difficulty"
    }
}
//=====END first version

//=====START second version
class GenericQuestion<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
) {
    override fun toString(): String {
        return "question = $questionText answer = $answer difficulty = $difficulty type = ${answer!!::class.simpleName}"
    }
}
//=====END second version

//=====START third version
enum class Difficulty {
    EASY, MEDIUM, DIFFICULT
}

class ImprovedQuestion<T>(val questionText: String, val answer: T, val difficulty: Difficulty) {
    override fun toString(): String {
        return "question = $questionText answer = $answer difficulty = $difficulty type = ${answer!!::class.simpleName}"
    }
}
//=====END third version

//=====START fourth version
data class DataQuestion<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
//=====END fourth version

// Singletons in Kotlin
object Answers{
    var total: Int = 10
    var answered: Int = 3
}

fun main() {
    val first = FillInTheBlankQuestion("How r u?", "gut", "difficult")
    val second = TrueOrFalseQuestion("U gut?", true, "difficult")
    val third = NumericQuestion("U gut?", 1, "difficult")
    val fourth = GenericQuestion<String>("How r u?", "not gut", "difficult")
    val fifth = ImprovedQuestion<String>("How r u?", "very nice", Difficulty.EASY)
    val sixth = DataQuestion<String>("How r u?", "great", Difficulty.MEDIUM)
    println(first.toString())
    println(fourth.toString())
    println(fifth.toString())
    println(sixth)
    println("answered = ${Answers.answered}, total = ${Answers.total}")
}

/* NOTES:
generics:
When you want a property to have differing data types, subclassing is not the answer.
Instead, Kotlin provides something called generic types that allow you to have a single property that can have differing data types, depending on the specific use case.
data classes:
Classes like the ImprovedQuestion class, on the other hand, only contain data.
They don't have any methods that perform an action. These can be defined as a data class.
Defining a class as a data class allows the Kotlin compiler to make certain assumptions, and to automatically implement some methods.
For example, toString() is called behind the scenes by the println() function.
When you use a data class, toString() and other methods are implemented automatically based on the class's properties.
A singleton object can't have a constructor as you can't create instances directly. Instead, all the properties are defined within the curly braces and are given an initial value.
You can define a singleton object inside another class using a companion object.
A companion object allows you to access its properties and methods from inside the class, if the object's properties and methods belong to that class, allowing for more concise syntax.
example: =====
 class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}
companion object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}
=====
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"
fun Quiz.StudentProgress.printProgressBar() {
}
=====
interface ProgressPrintable {
    val progressText: String
}
class Quiz : ProgressPrintable {
    override val progressText: String
}



 */