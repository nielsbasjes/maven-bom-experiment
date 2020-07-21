import nl.basjes.example.user.MyCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyCode {

    @Test
    public void doTest() {
        MyCode myCode = new MyCode("Foo");
        assertEquals("Oeps", myCode.myName, "Foo");
        assertEquals("Oeps", myCode.baseDemo.getValue(), "Foo");
        assertEquals("Oeps", myCode.coreDemo.getValue(), "Foo");
        assertEquals("Oeps", myCode.extendedDemo.getValue(), "Foo");
    }
}