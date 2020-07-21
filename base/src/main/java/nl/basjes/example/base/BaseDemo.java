package nl.basjes.example.base;

public class BaseDemo {
    public String s;

    public String getValue() {
        return s;
    }

    public BaseDemo(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "BaseDemo{" +
                "s='" + s + '\'' +
                '}';
    }
}