package basics

import basics.Basic1.Color.*
import kotlin.test.Test
import kotlin.test.assertEquals

class Basic1 {

    @Test
    fun testRepeat() {
        var str = "";
        repeat(10) {
            str += "Aha";
        }
        assertEquals("AhaAhaAhaAhaAhaAhaAhaAhaAhaAha", str);
    }

    @JvmOverloads
    fun sum(a: Int = 0, b: Int = 0, c: Int = 0): String {
        return "$a $b $c";
    }

    @Test
    fun testJvmOverloads() {
        assertEquals("1 0 0", sum(1));
        assertEquals("1 2 0", sum(1, 2));
        assertEquals("1 2 3", sum(1, 2, 3));
        assertEquals("0 2 0", sum(b = 2));
        assertEquals("0 0 3", sum(c = 3));
        assertEquals("1 0 3", sum(c = 3, a = 1));
    }

    enum class Color {
        BLUE, RED, GREEN
    }

    @Test
    fun testEnumWhen() {
        val color = GREEN;
        var str = "";
        str = when (color) {
            GREEN -> "green"
            BLUE -> "blue"
            RED -> "red"
        }
        assertEquals("green", str);
    }

    @Test
    fun testEnumWhenSet() {
        val color1 = GREEN;
        val color2 = RED;
        var str = "";
        str = when (setOf(color1, color2)) {
            setOf(GREEN, RED) -> "brown"
            setOf(BLUE, RED) -> "purple"
            setOf(GREEN, GREEN) -> "green"
            else -> "other"
        }
        assertEquals("brown", str);
    }

    @Test
    fun testWhenClasses() {
        val pet = getPet();
        var str = "";
        str = when (pet) {
            is Dog -> "dog"
            is Cat -> "cat"
            else -> "other"
        }
        assertEquals("dog", str);
    }


    fun getPet(): Pet {
        return Dog();
    }

}

open class Pet {}
class Dog : Pet() {}
class Cat : Pet() {}