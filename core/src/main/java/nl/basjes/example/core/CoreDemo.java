package nl.basjes.example.core;

public class CoreDemo {
    public String s;

    public String getValue() {
        return s;
    }

    public CoreDemo(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "CoreDemo{" +
                "s='" + s + '\'' +
                '}';
    }
}