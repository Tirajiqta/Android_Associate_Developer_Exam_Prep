package tasks
enum class DayPart{
    MORNING, AFTERNOON, EVENING
}

data class Event(val title: String,val description: String? = null,val daypart: DayPart,val duration: Int){

}

fun main(){
    println(Event("title",null, DayPart.EVENING, 15))

    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = DayPart.MORNING, duration = 0)
    val event2 = Event(title = "Eat breakfast", daypart = DayPart.MORNING, duration = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = DayPart.AFTERNOON, duration = 30)
    val event4 = Event(title = "Practice Compose", daypart = DayPart.AFTERNOON, duration = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = DayPart.AFTERNOON, duration = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = DayPart.EVENING, duration = 45)
    val eventsAsList = listOf(event1, event2, event3, event4, event5, event6)
//    My solution:
//    var shortCount: Int = 0
//    var longCount: Int = 0
//    for (event: Event in eventsAsList){
//        if (event.duration < 60){
//            ++shortCount
//        }
//        else{
//            ++longCount
//        }
//    }
//    println("You have $shortCount short tasks")
//    Better solution:
    val shortEvents = eventsAsList.filter { it.duration < 60 }
    println("You have ${shortEvents.size} short events")
    val grouped = eventsAsList.groupBy { it.daypart }
    println(grouped)
    println("last index = ${eventsAsList.get(eventsAsList.lastIndex).title}")
}