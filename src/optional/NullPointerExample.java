package optional;

import java.util.Optional;

//NullPointerException 을 Optional로 방지할 수 있음
//스프링에서 데이터베이스 조회 시 Optional을 자주 사용한다. (테이블에 널 값이 있을 수 있기 때문)
public class NullPointerExample {
  public static void main(String[] args) {
    Optional<String> value = getFromServer();
    int length = value.map(String::length).orElse(0); //내장 함수 사용
  }

  public static Optional<String> getFromServer() {
    return Optional.ofNullable("123456");
  }

  //Optional.ofNullable(null)을 사용하여 'null'을 감싸서 반환.
  //map(String::length)로 문자열이 'null'이 아닐 때만 길이를 가져옴
  //orElse(0)을 사용하여 'null'일 경우 기본값 0을 반환
  //결과적으로 NPE 없이 안전한 코드를 만들 수 있음
}