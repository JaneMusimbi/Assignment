fun main(){
    numbers()
    var namz=names(arrayOf("jane","musimbi","speria","alinda") )
    println(namz)
    robot(1)
    multiples()


}
fun numbers(){
    for(number in 1..100){
        if((number%2) != 0){
            println(number)
        }

    }
}
fun names(name:Array<String>):Int{
    var nam=0
    name.forEach { x ->
        if(x.length>5) {
            nam++
        }
    }
    return nam
}
fun robot(guest:Int){
    if(guest<6){
        println("milk")
    }else if(guest<15 && guest>6 ){
        println("fanta orange")
    }else{
        println("Cocacola")
    }

}
fun multiples(){
    for(nums in 1..100){
    if((nums%3)==0 && (nums%5)==0){
        println("FizzBuzz")
    }else if((nums%3)==0){
        println("Fizz")
    }else if((nums%5)==0){
        println("Buzz")
    }else{
        println(nums)
    }
}
     }