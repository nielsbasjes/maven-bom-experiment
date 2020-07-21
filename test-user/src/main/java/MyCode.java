public class MyCode {
    public String myName;
    public BaseDemo baseDemo;

    public MyCode(String myName) {
        this.myName = myName;
        baseDemo = new BaseDemo();
        baseDemo.demo = myName;
    }
}