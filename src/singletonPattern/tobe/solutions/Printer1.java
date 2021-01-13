package singletonPattern.tobe.solutions;

public class Printer1 {
    // 정적 변수에 인스턴스를 만들어 바로 초기화 하는 방법
    private static Printer1 printer = new Printer1();
    private Printer1(){};

    // 자기 자신의 인스턴스를 외부에 제공
    public static Printer1 getPrinter() {
        return printer;
    }
    public void print(String str) {
        System.out.println(str);
    }
}
