package basics

import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertTrue
import kotlin.test.assertFalse

class Range {

    @Test
    fun ranges() {
        assertTrue("",'0' in '0'..'9')
        assertTrue("",'1' in '0'..'9')
        assertTrue("",'9' in '0'..'9')
        assertFalse('a' in '0'..'9', "")
    }


}