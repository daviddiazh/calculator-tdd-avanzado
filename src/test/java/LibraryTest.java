import co.com.tdd.Library;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class LibraryTest {

    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

}
