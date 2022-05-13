package kotlinForJavaDevs

class NiceString {

    // refactor
    fun String.isNice(): Boolean {
        return listOf(
            setOf("ba", "be", "bu").none { this.contains(it) },
            count { it in "aeiou" } >= 3,
            zipWithNext().any() { it.first == it.second }
        ).count() { it } >= 2
    }


    // first
    fun String.isNice2(): Boolean {

        var same = false;

        var a = false;
        var e = false;
        var u = false;
        var ii = false;
        var o = false;

        for ((i, c) in this.withIndex()) {
            if (i != 0 && this[i - 1] == c) {
                same = true;
            }
            if (c == 'a') a = true;
            if (c == 'e') e = true;
            if (c == 'u') u = true;
            if (c == 'i') ii = true;
            if (c == 'o') o = true;
        }
        var count = 0;
        if (a) count++
        if (e) count++
        if (u) count++
        if (ii) count++
        if (o) count++


        var count2 = 0;
        if (count > 2) count2++;
        if (same) count2++;
        if (!this.contains("bu") &&
            !this.contains("ba") &&
            !this.contains("be")
        ) count2++;

        return count2 > 1;

    }


}