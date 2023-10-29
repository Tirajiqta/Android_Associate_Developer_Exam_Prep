fun main() {

//    first task:
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    taskSeparator()
//    second task
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

    taskSeparator()

    /*
    27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
     */
//    third task

    val fahrenheitToCelsius: (Double) -> Double = { fahrenheit ->
        (fahrenheit * 9) / 5 + 32
    }
    val kevinToCelsius: (Double) -> Double = { kelvin ->
        kelvin - 273.15

    }
    val fToK: (Double) -> Double = { v ->
        (5 * (v - 32)) / 9 + 273.15
    }
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", fahrenheitToCelsius)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kevinToCelsius)
    printFinalTemperature(10.0, "F", "K", fToK)

    taskSeparator()
//    fourth task
    val song = Song()
    song.year = "2023"
    song.title = "Unknown title"
    song.artist = "me"
    song.playCount = 1001
    println("Is song popular = " + song.isPopular())
    song.myToString()

    taskSeparator()
// fifth task
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()

    taskSeparator()
//    sixth task
   val myFoldablePhone = FoldablePhone(true)
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()
    myFoldablePhone.switchOff()
    myFoldablePhone.checkPhoneScreenLight()

    taskSeparator()
//    seventhTask

    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    return if (age <= 12) {
        15
    } else if (age in 13..60) {
        if (isMonday) {
            25
        } else {
            30
        }
    } else if (age in 61..100) {
//
        20
    } else {
        -1
    }
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages < 99) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

class Song {
    var title: String = ""
    var artist: String = ""
    var year: String = ""
    var playCount: Int = 0
    fun isPopular(): String {
        return if (playCount > 1000) {
            "Popular"
        } else {
            "Not so much"
        }
    }

    fun myToString() {
        println("$title, performed by $artist, was released in $year")
    }
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Fill in code
        if (referrer != null) {
            println("Name: $name \nAge: $age \nLikes to $hobby. Has a referrer named ${referrer.name} who likes to $hobby")
        } else{
            println("Name: $name \nAge: $age \nLikes to $hobby. Doesn't have a referrer")
        }
    }
}


open class Phone(var isScreenLightOn: Boolean = false){
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone (isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    // Fill in the code.
    if(bid != null){
        return bid.amount
    }
    return minimumPrice
}
// helper
fun taskSeparator() {
    println("----------------------------------------------------------------------------")
    println()
    println("----------------------------------------------------------------------------")
}