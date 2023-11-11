# Java 기초

<br>

## 자료구조
<hr>

### Arrays
- 크기 고정
- 검색에 빠르지만 삭제에 느림
- Compact memory usage if size is known


### List
- 순서 있음
- 중복 허용
- Array와 다르게 크기가 가변적임
- 검색에 빠름 - 인덱스로 접근
- 여러 구현체가 있음
  - ArrayList
  - Stack
  - Vector
  - Others
- List는 인터페이스, ArrayList는 구현체
- 아주 많은 경우 List list = new ArrayList(); 구문을 사용함


### ArrayList vs LinkedList
- 모두 List 인터페이스의 구현체
- 

- ArrayList
  - 중복을 허용, 순서를 유지, 인덱스로 원소 관리 -> 배열과 유사
  - 하지만 배열은 크기가 고정
  - ArrayList는 클래스이기 때문에 값을 추가, 삭제하는 메서드 존재
  - ArrayList는 3개의 생성자가 존재
    - 매개변수 없는 생성자
      - 기본 크기는 10
      - 하지만 11개 이상의 데이터가 들어가면? 
        - 내부적으로 Arrays.copyOf() 메서드를 사용하여 더 큰 배열에 기존 배열의 원소를 복사함 -> 연산 필요
        - 초기 용량을 설정해주는 것이 좋음
    - 초기 용량을 매개변수로 받는 생성자
    - Collection 타입을 매개변수로 받는 생성자
  



<br>
<br>
<br>
<br>
