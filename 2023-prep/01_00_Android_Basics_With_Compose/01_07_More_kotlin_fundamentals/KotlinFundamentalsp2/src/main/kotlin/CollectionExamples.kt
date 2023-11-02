fun main() {
    planetsAsArray()
    planetsAsList()
    planetsAsSet()
    planetsAsMap()
}

fun planetsAsArray(): Unit {
//    defining arrays in Kotlin
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    for (planet: String in solarSystem) {

        println(planet)
    }
}

fun planetsAsList(): Unit {
//    lists in Kotlin
    val planetsAsList = mutableListOf("Mercury", "Venus", "Earth", "Mars")
    planetsAsList.add("Jupiter")
    planetsAsList.remove("Mercury")

}

fun planetsAsSet(): Unit {
    val solarSystem =
        mutableSetOf("Mercury", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
}

fun planetsAsMap(): Unit {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem.size)

    solarSystem["Pluto"] = 5

}