fun main(){
    val count: Int = 2
    println("Getting count value $count using dollar sign")

    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
    val cartTotal = 0
    // cartTotal = 20 // marks as error, val can not be reassigned
    println("Total: $cartTotal")

}

/* NOTES:
Variable, is a container for a single piece of data.
Types in Kotlin:
String, Int, Double, Float, Boolean
Example code: val count: Int = 2
to change int value for example you can use
count++ or count--
 */