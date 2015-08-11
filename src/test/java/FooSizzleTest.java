import org.junit.*;
import static org.junit.Assert.*;

public class FooSizzleTest {

  @Test
  public void isFooSizzleChangingAllLettersSToZ_true() {
    FooSizzle fooSizzle = new FooSizzle();
    String expectedOutput = "zuzan";
    assertEquals(expectedOutput, fooSizzle.isFooSizzle("susan"));
  }
}
