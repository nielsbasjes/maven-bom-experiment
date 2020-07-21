package nl.basjes.example.user;

import nl.basjes.example.base.BaseDemo;
import nl.basjes.example.core.CoreDemo;
import nl.basjes.example.extended.ExtendedDemo;

public class MyCode {
    public String   myName;
    public BaseDemo baseDemo;
    public CoreDemo coreDemo;
    public ExtendedDemo extendedDemo;

    public MyCode(String myName) {
        this.myName = myName;
        baseDemo = new BaseDemo(myName);
        coreDemo = new CoreDemo(myName);
        extendedDemo = new ExtendedDemo(myName);
    }
}