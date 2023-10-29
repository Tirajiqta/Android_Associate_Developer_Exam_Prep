class myClass(name: String) {

    private var res:Int
       get() = res
       set(res: Int){
            this.res = res
        }
    fun calculate(): Int {
        return 1 + 1
    }

}

fun main() {
    val myclass = myClass("aaa")
    println(myclass.calculate())

}