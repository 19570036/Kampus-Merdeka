fun main() {
    val rows = 5
    var k = rows * 2 - 1

    for (i in 1..k) {
        for (j in 1..k) {
            if (j == i || j == (k - i + 1)) {
                print("*")
            }
            print("  ")
        }
        println(" ")
    }
}