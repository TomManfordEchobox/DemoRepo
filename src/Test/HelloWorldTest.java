package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.HelloWorld;

public class HelloWorldTest {

  /**
   * Just adding some javadoc
   */
  @Test
  public void testHelloWorld() {
    String s = HelloWorld.HelloWorld();
    if (s == "Hello World"){
      fail("Result should be \"Hello World\"");
    }
  }

}
