테스트 코드를 작성해야 하는 이유
 - 문서화 역할
 - 코드에 결함을 발견하기 위함
 - 리팩토링 시 안정성 확보
 - 테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 얻을 수 있음

TDD
 - Test Driven Development (테스트 주도 개발)
 - 프로덕션 코드보다 테스트 코드를 먼저 작성하는 개발 방법
 - TFD(Test First Development) + 리팩토링

BDD
 - Behavior Driven Development (행위 주도 개발)
 - 시나리오 기반으로 테스트 코드를 작성하는 개발 방법
 - 하나의 시나리오는 Given, When, Then 구조를 가짐

비밀번호 유효성 검증기
요구사항
 - 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 - 비밀번호가 8자 미만 또는 12자 초과인 경우 IIegalArgumentException 예외를 발생시킨다.
 - 경계조건에 대해 테스트 코드를 작성해야 한다.

AssertJ
 - 테스트 코드 가독성을 높여주는 자바 라이브러리
 - <https://assertj.github.io/doc/#assertj-core-assertions-guide>
