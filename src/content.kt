import java.time.temporal.TemporalAmount

fun main() {

    println(items(arrayOf("car","chair","table","door","shoes")))
}
 data class Car(var make:String,var model:String,var color:String) {


     fun listofCars() {
         var volvo = mutableListOf<String>()
         var nissan = mutableListOf<String>()
         var schoolbus = mutableListOf<String>()
         when ("groupofcars") {
             "nissan" -> println(nissan.add("${name}"))
             "schoolbus" -> println(schoolbus.add("${name}"))
             else -> println(other.add("${name}"))
         }
         println (nissan)
         println(schoolbus)
     }
 }
fun items(things:Array<String>):MutableList<String> {
    var colect = mutableListOf<String>()
    for (thing in things) {
        if(thing.length>5){
            colect.add(thing)
        }
    }
    return colect
}
class CurrentAccount(var  acountnumber:Int,var acountname: String, var balance:Int) {
fun  deposit(amount:Double){
    var Amount=0
   var balance= Amount
     println(balance++)

}
    fun  withdraw(amount: Double){
var balance=1
        var Amount= balance
        println(Amount--)
    }
}
fun  details(){

}
