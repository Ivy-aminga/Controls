fun main() {
    oddNos(34)


  println(arr(arrayOf("Klein","Melissa","Happiness")))
    robServe(4)
    robServe(12)
    robServe(20)
    nos(35)



}

//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddNos (digits: Int){
    for (num in 1..100 ){
        if(num %2!=0){
            println(num)
        }
    }
}


//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun arr (names: Array<String>): Int {
    var z = 0
    for (name in names) {
        if (name.length > 5) {
            z++
        }
    }
    return z
}



//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robServe(age: Int){
when(age){
    in 1..6 -> println("milk")
    in 7..14 -> println("Fanta")
    else -> println("Coca Cola")

    }
}




//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun nos(no: Int) {
    for (no1 in 1..100)
        if (no1 % 15 == 0) {
            println("FizzBuzz")
        } else if (no1 % 5 == 0) {
            println("Buzz")
        }else if (no1 % 3 == 0){
            println("Fizz")
        }else{
            println(no1)
        }
}

