- 참고 자료
    - 백기선님 강의
    - freespringlecture님의 [spring-core-tech](https://github.com/freespringlecture/spring-core-tech/blob/chap02-01-ioccontainer/Readme.md)

# 스프링 IoC 컨테이너와 Bean

- IoC(Inversion of Control)이란 우리말로 직역하면 **제어의 역전**이라고 해석할 수 있는, DI(Dependency Injection, 의존성 주입)와 비슷한 뜻을 가지고 있다.
- 어떤 객체가 사용하는 의존성을 직접 만들어서 사용하는 것이 아닌, 생성자 등을 통해 주입받아 사용하는 것을 의미한다.

## 스프링 IoC 컨테이너

- 애플리케이션 컴포넌트의 중앙 저장소
- 빈 설정 소스로부터 빈 정의를 읽어들이고, 빈 구성 및 제공

# 빈

- 스프링 IoC 컨테이너가 관리하는 객체
- 장점
    - 의존성 관리
        - 의존성을 주입하기 위해서는 꼭 빈이 되어야 함
    - 스코프
        - 싱글톤: 하나의 객체를 여러 곳에서 사용하여 메모리 자원 절약
        - 프로토타입: 설정에 따라 매번 다른 객체를 생성한다.
    - 라이프사이클 인터페이스
        - 예: @PostConstruct 등을 이용하여 빈이 사용되는 순간 어떤 작업을 추가하고 싶을 때 사용

## 스프링 IoC 컨테이너를 사용하는 이유

-스프링은 오랜 기간동안 아주 많은 개발자들이 커뮤니티에서 의론한 결과 끝에 만들어진 프레임워크이다.
- 컨테이너: IoC 기능을 담고 있는 빈을 담고 있는 '통'
- 빈(Bean): 컨테이너 안에 있는 객체. 필요에 따라 의존성 주입 등이 가능하다.

## BeanFactory

- 스프링 IoC 컨테이너의 가장 최상위에 있는 인터페이스
- 'getBean()'

## ApplicationContext

- BeanFactory를 상속받음
- 메세지 소스 처리 기능(i18n) 지원 -> 다국어 메세지 지원
- 이벤트 발행 기능
- 리소스 로딩 기능(@ResourceLoader 상속)
