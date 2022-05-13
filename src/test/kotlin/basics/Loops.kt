package basics

import kotlin.test.Test
import kotlin.test.assertEquals

class Loops {

    @Test
    fun basicloop() {
        val list = listOf("a", "b", "c");
        var str = "";
        for (s in list) {
            str += s;
        }
        assertEquals("abc", str)
    }

    @Test
    fun basicMaploop() {
        val map = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
        );
        var str = "";
        for ((k,v) in map) {
            str += "[$k,$v]";
        }
        assertEquals("[1,one][2,two][3,three]", str)
    }

    @Test
    fun basicStringloop() {
        var str = "";
        for (ch in "abc") {
            str += "[$ch]";
        }
        assertEquals("[a][b][c]", str)
    }

    @Test
    fun until() {
        var count = 0;
        for (i in 0 until 10) {
            count++
        }
        assertEquals(10, count)
    }
}