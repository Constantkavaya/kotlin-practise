

fun main() {

    println(items("car")
}
 data class Car(var make:String,var model:String,var color:String) {
     fun listofCars() {
         var volvo = mutableListOf<String>()
         var nissan = mutableListOf<String>()
         var schoolbus = mutableListOf<String>()
         when ("groupofcars") {
             "nissan" -> println(nissan.add("${brand}"))
             "schoolbus" -> println(schoolbus.add("${brand}"))
             else -> println(other.add("${brand}"))
         }
         println (nissan)
         println(schoolbus)

     }
 }
fun items(things:String):String{
    var colect =""
    for (thing in things) {
        if(thing.length){
            colect.add(thing)
        }
    }
    return colect
}
class CurrentAccount(var  acountnumber:Int,var acountname: String, var balance:Int) {
fun  deposit(amount:Double){
    var increment=(balance+amount)
   println(increment)


}
    fun  withdraw(amount: Double){
        var decrement= balance-amount
        println(decrement)
    }
}
fun  details(){

}
