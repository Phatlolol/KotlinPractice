

fun main(args: Array<String>) {
    var array = IntArray(10); //initialize array with size 10
    for(i in 0..9 ) { // ".." includes the last integer
        //use $ or ${} to insert a variable or expression into a string
        print("Enter Integer ${(i + 1)} for the array: ")
        array[i] = readln().toIntOrNull() ?: 0 //Read an integer, use 0 if input is not an integer
    }

    array.bubbleSort()
    println("Your sorted array is: ${array.joinToString()}")


}

fun IntArray.bubbleSort() { //Can call on any var of type IntArray
    val n = this.size
    for (i in 0 until n - 1) { // "until" doesn't include the last integer
        for (j in 0 until n - i - 1) {
            if (this[j] > this[j + 1]) {
                val temp = this[j]
                this[j] = this[j + 1]
                this[j + 1] = temp
            }
        }
    }
}
