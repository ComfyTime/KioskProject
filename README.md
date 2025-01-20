# 키오스크 과제

## LV1
### 설명
* String 배열을 이용해 여러 햄버거 메뉴를 입력.
* 조건문을 이용해 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성.
* 반복문을 이용해서 0이 입력되면 프로그램을 종료.

### 구성
* Main.java
  * 메뉴 입력/출력에 배열 사용
  * 값 입력에 Scanner 사용
  * Switch 사용하여 선택한 항묵 실행
  * while 사용하여 반복 구현
* MenuItem.java
  * 메인에서 음식 인스턴스를 생성하기 위한 클래스
  * getter에서 String 배열로 음식 정보를 출력하도록 하였음
* Menu.java
  * 과제 구성에 맞추어 미리 만들어둔 더미 파일
* Kiosk.java
  * 과제 구성에 맞추어 미리 만들어둔 더미 파일

## LV2
### 설명
* MenuItem 클래스 생성
* List를 선언하여 MenuItem을 추가 기능 구현
* 과제 목표에 맞추어 String 배열에서 List로 변경 

### 구성
* Main.java
  * List 선언 및 List에 맞추어 sout 수정
* MenuItem.java
  * String 배열 삭제 및 구성 조정
* Menu.java
  * 과제 구성에 맞추어 미리 만들어둔 더미 파일
* Kiosk.java
  * 과제 구성에 맞추어 미리 만들어둔 더미 파일

## LV3
### 설명
* Kiosk 클래스 생성
* MenuItem List를 Kiosk 필드에 생성
* Main의 주문 접수 반복문을 Kiosk로 이동

### 구성
* Main.java
  * 주문 접수를 위한 반목문을 Kiosk로 이동
* MenuItem.java
  * 변동 사항 없음
* Menu.java
  * 과제 구성에 맞추어 미리 만들어둔 더미 파일
* Kiosk.java
  * MenuItem List 필드 구현
  * start 함수를 통해 주문 접수 반복문 사용하도록 구현

## LV4 / LV5
### 설명
* Menu 클래스 생성
* MenuItem List를 Menu에서 관리하도록 수정
* 버거, 음료 등 종류에 따른 카테고리 구현
* 시간 부족으로 에러를 완전히 해결하지 못하였음

### 구성
* Main.java
  * 카테고리 추가에 따른 구성 추가 및 수정
* MenuItem.java
  * 변동 사항 없음
* Menu.java
  * MenuItem List 필드 구현
  * 카테고리 필드 및 생성자 구현
* Kiosk.java
  * MenuItem List를 Menu로 이동
  * start 함수에서 카테고리를 반영하도록 수정
