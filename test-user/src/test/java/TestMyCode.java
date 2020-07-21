import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyCode {

    @Test
    public void doTest() {
        MyCode myCode = new MyCode("Foo");
        assertEquals("Oeps", myCode.myName, "Foo");
        assertEquals("Oeps", myCode.baseDemo.demo, "Foo");
    }
}