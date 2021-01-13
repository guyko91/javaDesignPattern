package singletonPattern.tobe;

import singletonPattern.tobe.solutions.Printer4;

public class Client {

    // 정적 메서드로만 이루어진 정적 클래스를 사용하는 예제
    private static final int THREAD_NUM = 5;
    public static void main2(String[] args) {
        UserThread[] user = new UserThread[THREAD_NUM];
        for(int i = 0; i < THREAD_NUM; i++) {
            user[i] = new UserThread(String.valueOf(i+1));
            user[i].run();
        }
    }

    // Enum을 사용하는 예제
    public static void main(String[] args) {
        Printer4 printer = Printer4.getPrinter();
        printer.print("test");
    }
}
