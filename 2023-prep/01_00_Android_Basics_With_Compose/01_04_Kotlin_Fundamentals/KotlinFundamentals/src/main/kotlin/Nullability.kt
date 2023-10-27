fun main(){
    var favoriteProgrammingLanguage : String?
    favoriteProgrammingLanguage = "Kotlin and Java"
    println(favoriteProgrammingLanguage)
    favoriteProgrammingLanguage = null
    println(favoriteProgrammingLanguage)
//  You can use the ?. safe call operator to access methods or properties of nullable variables.
    println(favoriteProgrammingLanguage?.length)
//    You can also use the !! not-null assertion operator to access methods or properties of nullable variables.
    favoriteProgrammingLanguage = "C++"
    println(favoriteProgrammingLanguage!!.length)
//  The ?: Elvis operator is an operator that you can use together with the ?. safe-call operator.
//  With the ?: Elvis operator, you can add a default value when the ?. safe-call operator returns null.
//  It's similar to an if/else expression, but in a more idiomatic way.
    println(favoriteProgrammingLanguage?.length ?: 0)
}