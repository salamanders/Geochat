package info.benjaminhill.geochat

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun mainActivity_canBeReferenced() {
        // This is a simple test to ensure that the test module has a dependency on the main module.
        // It just references the MainActivity class, without instantiating it.
        val mainActivityClass = MainActivity::class.java
        assert(mainActivityClass != null)
    }
}