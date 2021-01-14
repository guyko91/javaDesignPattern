# 커맨드 패턴
## 1. 커맨드 패턴이란?
* **실행될 기능을 캡슐화**함으로써, 주어진 여러 기능을 실행할 수 있는 **재사용성이 높은** 클래스를 설계하는 패턴.
* *행위(Behavier)패턴* 중 하나
    * *행위패턴 : 객체나 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴, 객체 사이의 결합도를 최소화 하면서 기능별로 객체를 설계하는 것.*
    
![](https://gmlwjd9405.github.io/images/design-pattern-command/command-pattern.png)
* 기능의 실행을 요구하는 호출자(invoke)클래스와 실제 기능을 실행하는 수신자(Receiver) 클래스 사이의 의존성을 제거.
* 역할별 수행 작업
    * Command : 실행될 기능에 대한 인터페이스. 실행될 기능을 execute 메서드로 선언함.
    * ConcreteCommand : 실제로 실행되는 기능을 구현. 즉 Command라는 인터페이스를 구현함.
    * Invoker : 기능의 실행을 요청하는 *호출자* 클래스
    * Receiver : ConcreteCommand에서 execute 메서드를 구현할 때 필요한 클래스. (ConcreteCommand의 기능을 실행하기 위해 사용하는 수신자 클래스)
    
## 2. 예제 (만능 버튼 만들기)
### As - Is
![](https://gmlwjd9405.github.io/images/design-pattern-command/command-example.png)
* on 이라는 메서드를 가진 Lamp 클래스
* lamp를 생성자 파라미터로 받고, pressed라는 인스턴스 메서드를 가진 Button클래스.
####문제점
1) 버튼을 눌렀을 떄, 알람이 울리게 하려면 ? 
    * 새로운 기능으로 변경하기 위해 Button 클래스를 수정해야 하므로, OCP에 위배된다.
    * Button 클래스의 pressed() 전체를 변경해야 한다.
2) 필요한 기능을 추가할떄 마다 Button클래스의 수정이 필요하므로 재사용하기 어렵다.

### To - Be
![](https://gmlwjd9405.github.io/images/design-pattern-command/command-solution.png)
* 구체적인 기능을 직접 구현하는 대신, 실행될 기능을 캡슐화 한다.
    * Button 클래스의 pressed 메서드에서 구체적인 기능 (램프 on, 알람 on)을 직접 구현하지 않고, Button클래스 외부에서 바다 캡슐화 해 pressed메서드에서 호출한다.
    * 이를 통해 Button클래스를 수정하지 않고 기능 추가가 가능하다.
* Button객체는 Command 인터페이스를 멤버 변수로 갖는다.
    * Button객체의 pressed 메서드에서 멤버 변수 Command 인터페이스의 execute를 호출한다.
* 즉, 버튼을 눌렀을떄 발생할 기능을 Button내에서 하지 않고, 외부에서 설정하도록 하여 Button클래스 코드 변경 없이 다양한 기능을 추가할 수 있다.