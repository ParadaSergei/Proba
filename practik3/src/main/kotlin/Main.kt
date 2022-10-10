import java.lang.Math.sqrt
import java.util.*

fun main() {
    // #1         13..19 => допустим это подрастковый период
    val myAge:Int = 17
    val isTeenager:Boolean= myAge in 13..19
    println(isTeenager)

    /* #2
    question в этом задании =>являются ли оба человека подростками?*/
    val theirAge:Int = 30
    val bothTeenagers:Boolean = theirAge in 13..19
    println(bothTeenagers)

    // #3
    val reader:String = "Sergei"
    val author:String = "Richard Lucas"
    val authorIsReader:Boolean = reader==author
    println(authorIsReader)

    // #4  следует ли reader перед author по алфавиту?
    val readerBeforeAuthor:Boolean = reader < author
    println(readerBeforeAuthor)

    // #5
    val myAge2:Int = 17
    if (myAge2 in 13..19){
        println("teenager") //(У меня не скачен русский алфавит в IntelliJ IDEA !,  поэтому пишу на английском)
    }
    else {
        println("not a teenager")}

    // #6   ===>   Я так это понял
    val answer:Int = myAge2
    if (answer in 13..19){println("teenager")}else{println("not a teenager")}

    // #7   Убрать /* .... */ и
     var counter:Int= 0
    /* while(counter<10) {
    var x = counter
        counter+=1
        println(x)
    }*/

    // #8                               спросить про 8 задание
     //==> есть в #7 задачи
    var roll:Int =0
    do {
        var y:Int = roll
        var x = counter
        counter += 1
        roll = Random().nextInt(6)
        println("Posle $x broskov, roll raven\n" + "$y")
    }
    while (roll==0)


    // #9
    val range:Int=0
    for(range in 1..10)
    {
        println(range*range)
    }

    // #10 Доделать!!!!!
    val rEnges:Int=0
    for(rEnges in 1..10)
    {
       var w = sqrt(rEnges)
    }

    // #11 Доделать!!!!!!!!!!
    var sum = 0
    for (row in 0 until 8){
        if (row %2 == 0) {
        continue
        }
        for (column in 0 until 8){
            sum+=row*column
        }
    }

}
