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
#### 문제점
* 출력 방식을 변경하기 위해서는 기존 코드를 수정해야 한다.
* ScoreRecord(통보)클래스와 View(옵저버)클래스의 양방향 의존관계가 성립된다.
### To - Be
#### 해결책
* 공통 기능을 상위 클래스 및 인터페이스로 일반화 하고 이를 활용하여 통봉하는 클래스를 구현해야 한다.
![](https://gmlwjd9405.github.io/images/design-pattern-observer/observer-solution2.png)
  * Observer : 추상화 된 통보 대상
  * DataSheetView, MinMaxView : Observer를 implements 함으로써 구체적인 통보 대상이 됨.
  * Subject : 성적 변경에 관심이 있는 대상 객체들을 관리.
  * ScoreRecord : Subject를 extends 함으로써, 구체적인 통보 대상을 직접 참조하지 않아도 됨.
  * 이렇듯, Observer패턴을 구현하면 ScoreRecord 클래스를 변경하지 않고도 관심 클래스를 관리하는 것이 가능해진다.
