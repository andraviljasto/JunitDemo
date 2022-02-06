import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstTestCase {
    @Test
    public void firstTestCase() {
   assertEquals (1,1);
}
@Test
public void secondTestCase () {
    assertEquals("Hello", "Hello");
}
@Test
public void thirdTestCase () {
    assertNotEquals (2,3);
}
@Test
public void fourthTestCase () {
    assertNotEquals ("A","B");
}
@Test
public void truthFalse () {
    assertTrue(true);
    assertTrue(5==5);
    assertTrue(3==3);
    assertTrue("abc"=="abc");

    assertFalse(false);
    assertFalse(5==4);
    assertFalse("abc"=="def");
}
@Test
public void NullOrNotNull () {
    assertNull (null);
    assertNotNull (3);
}
}