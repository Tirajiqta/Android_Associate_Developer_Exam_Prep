fun main(){
//    defining arrays in Kotlin
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    for(planet: String in solarSystem){

        println(planet)
    }
}