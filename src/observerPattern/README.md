# Observer Pattern
## 1. 옵저버 패턴이란 ?
 * 한 객체의 상태 변화에 따라 다른 객체의 상태도 연동되도록 1 : N 객체 의존 관계를 구성하는 패턴.
    * 데이터의 변경이 발생했을 경우, 상대 클래스나 객체에 의존하지 않으면서 **데이터 변경을 통보**하고자 할 때.
 * '행위(Behavioral)패턴'의 하나
   ![](https://gmlwjd9405.github.io/images/design-pattern-observer/observer-pattern.png)
   * 옵저버 패턴은 통보 대상 객체의 관리를 Subject 클래스와 Observer 인터페이스로 일반화 한다.
        * 이를 통해, 데이터 변경을 통보하는 클래스(ConcreteSubject)는 통보 대상 클래스나 객체(ConcreteObserver)에 대한 의존성을 없앨 수 있다.
   * 역할 별 수행 작업.
        * Observer
          * 데이터의 변경을 통보 받는 클래스.
          * Subject에서는 Observer의 update 메서드를 호출함으로써, ConcreteSubject의 데이터 변경을 ConcreteObserver에게 통보한다.
        * Subject
          * ConcreteObserver 객체를 관리하는 요소.
          * Observer 인터페이스를 참조해서 ConcreteObserver를 관리하므로, ConcreteObserver의 변화에 독립적일 수 있다.
        * ConcreteSubject
          * 변경 관리 대상이 되는 데이터가 있는 클래스. (통보하는 클래스)
          * 데이터 변경을 위한 메서드은 setState() 가 있다.
            * setState 메서드에서는 자신의 데이터인 subjectState를 변경하고, Subject의 notifyObservers() 메서드를 호출해서 ConcreteObserver 객체에 변경을 통보한다.
        * ConcreteObserver
          * ConcreteSubject의 변경을 통보받는 클래스.
          * Observer 인터페이스의 update 메서드를 구현함으로써 변경을 통보받는다.
          * 변경된 데이터는 ConcreteSubject의 getState() 메서드를 호출함으로써 변경을 조회한다.
## 2. 예시 (여러 가지 방식으로 성적 출력하기)
### As - Is

### To - Be