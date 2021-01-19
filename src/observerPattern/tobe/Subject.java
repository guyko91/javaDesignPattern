package observerPattern.tobe;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    // 추상화 된 통보 대상 목록
    private List<Observer> observers = new ArrayList<>();

    // 통보 대상 (Observer) 추가.
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 통보 대상 (Observer) 제거.
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 각 통보 대상(Observer)에 변경을 통보
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }

}
