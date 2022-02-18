fun main() {
    val rows = 5

    for (i in 1 .. rows) {
        if (i == ((rows / 2) + 1)){
            for (j in 1 .. rows) {
                print("* ")
            }
        } else {
            for (j in 1 .. rows / 2) {
                print("  ")
            }
            print("*")
        }
        println("")
    }
}