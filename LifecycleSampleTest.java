
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LifecycleSampleTest {
  @BeforeAll
  static void runOnceBeforeAllTests() {

    System.out.println("@BeforeAll executed\n");
  }

  @BeforeEach
  void runBeforeEveryTest() {

    System.out.println("@BeforeEach executed");
  }

  @Test
  void testMethod() {

    System.out.println("@Test method executed");
  }

  @ParameterizedTest
  @ValueSource(ints = { 1, 2 })
  void testParameterizedMethod(int number) {

    System.out.println("@ParameterizedTest executed with number" + number);
  }

  @RepeatedTest(2)
  void repeatedTestExample() {

    System.out.println("@RepeatedTest");
  }

  @AfterEach
  void runAfterEveryTest() {

    System.out.println("@AfterEach executed\n");
  }

  @AfterAll
  static void runOnceAfterAllTests() {

    System.out.println("@AfterAll executed");

  }
}
