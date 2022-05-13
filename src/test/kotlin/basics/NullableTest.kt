package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NullableTest {

    @Test
    fun lamnull() {
        //cant, function itself cant be null
        //val f1: () -> Int? = null;

        val f2: () -> Int? = {null}

        val f3: (() -> Int)? = null

        // function nullable but return value not
        //val f3: (() -> Int)? = {null}

    }


    @Test
    fun null1() {
        fun isFoo1(n: Name) = n.value == "foo";
        // n.value must be n?.value
        //fun isFoo2(n: Name?) = n.value == "foo";

        fun isFoo3(n:Name?) = n?.value == "foo"

        // no null allowed
        //isFoo1(null)

        isFoo3(null)
    }

    @Test
    fun funcnull() {
        assertTrue("".isEmptyOrNull())
        assertTrue(null.isEmptyOrNull())
        assertFalse("  ".isEmptyOrNull())
    }


    fun String?.isEmptyOrNull(): Boolean {
        return this == null || this == ""
    }
}

class Name(var value: String) {
}