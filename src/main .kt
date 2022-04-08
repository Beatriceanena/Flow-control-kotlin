//Assignment 7
fun main(){
    oddNumbers()
    var name= ( nameLength(arrayOf("beatrice","becky","","jane","brian","washington")))
    println(name)
    robot(7)
    multiples( )
}
//Question 1
fun oddNumbers(){
    for(numbers in 1..100)
        if(numbers%2 !=0){
            println(numbers)
        }
}
//Question 2
fun nameLength(names:Array<String>):Int{
    var name=0
    names.forEach { x->
        if(x.length>5){
            name++
        }
    }
    return name
}
//Question 3
fun robot(age:Int){
    if (age< 6){
        println("milk")
    }
    else if(age <15 && age>6){
        println("fanta orange")
    }
    else{
        println("Cocacola")
    }
}
fun multiples(){
    for (num in 1..100){
        if(num%3==0 && num%5==0) {
            println("FizzBuzz")
        }
        else  if(num%3==0){
            println("Fizz")
        }
        else if(num%5==0 ){
            println("Buzz")
        }
        else{
            println(num)
        }
    }
}

