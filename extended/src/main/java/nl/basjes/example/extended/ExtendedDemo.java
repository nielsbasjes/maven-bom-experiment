package nl.basjes.example.extended;

public class ExtendedDemo {
    public String s;

    public String getValue() {
        return s;
    }

    public ExtendedDemo(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "ExtendedDemo{" +
                "s='" + s + '\'' +
                '}';
    }
}