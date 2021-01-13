package singletonPattern.tobe;

public class Printer {

    private static Printer printer = null;

    // 기본 생성자
    private Printer() {}

    public static Printer getPrinter() {
        if(printer == null) {
            printer = new Printer();
        }
        return printer;
    }
    public void print(String target) {
        System.out.println("print value ->" + target);
    }
}
