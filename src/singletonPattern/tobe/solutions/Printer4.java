package singletonPattern.tobe.solutions;

public enum Printer4 {
    INSTANCE;
    public void print(String str) {
        System.out.println(str);
    }
    public static Printer4 getPrinter() {
        return INSTANCE;
    }
}
