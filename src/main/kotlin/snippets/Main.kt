fun main(args: Array<String>) {
    println("Hello World! ${args.getOrNull(0)}")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    "baaa".isNice();
}

fun String.isNice(): Boolean {

    var same = false;

    var vowel = 0;
    for ((i,c) in this.withIndex()) {
        if (i != 0 && this[i-1] == c) {
            same = true;
        }
        if (c == 'a') vowel++
        if (c == 'e') vowel++
        if (c == 'u') vowel++
        if (c == 'i') vowel++
        if (c == 'o') vowel++
    }
    var count = 0;

    if (vowel > 2) count++;
    if (same) count++;
    if (!this.contains("bu") &&
        !this.contains("ba") &&
        !this.contains("be")) count++;

    return count >1;

}
