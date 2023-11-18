import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    print("Введите через сколько секунд сработает 1 будильник 'tick': ")
    val b_1 = readln().toInt()
    print("Введите через сколько секунд сработает 1 будильник 'click': ")
    val b_2 = readln().toInt()
    print("Введите через сколько секунд сработает 1 будильник 'hrack': ")
    val b_3 = readln().toInt()
    launch {
        for (i in 0.. (maxOf(b_1,b_2,b_3))){
            delay(1000L)
            println()
        }
    }
    launch {
        for (i in 1.. b_1){
            delay(1000L)
            print("tick\t")
        }
        delay(1000L)
        println("=\tBoom")
    }
    launch {
        for (i in 1.. b_2){
            delay(1000L)
            print("click\t")
        }
        delay(1000L)
        println("=\tBoom")
    }
    launch {
        for (i in 1.. b_3){
            delay(1000L)
            print("hrack\t")
        }
        delay(1000L)
        println("=\tBoom")
    }

    println("Будильники начали работу")
}