fun main() {
    val input = arrayOf(3, 2, 1 ,3)
    println(birthDayCake(input))
}

fun birthDayCake(arr: Array<Int>): Int = arr.sorted().count{it == arr.max()}