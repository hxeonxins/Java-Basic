package lambda;

@FunctionalInterface
interface Calculator {
  int operate(int a, int b);
}

public class LambdaBasicExample {
  public static void main(String[] args) {
    Calculator add = (a, b) -> a + b;
    Calculator sub = (a, b) -> a * b; //연산이 추가되도 인터페이스에 작성하지 않음

    System.out.println(add.operate(10, 20));
    System.out.println(add.operate(10, 5));
  }
}
