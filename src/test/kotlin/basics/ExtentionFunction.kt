package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExtentionFunction {

    fun List<Int>.sum(): Int {
        var count = 0;
        for (i in this) {
            count += i;
        }
        return count;
    }

    @Test
    fun efList() {
        assertEquals(6, listOf(1,2,3).sum())
    }
}