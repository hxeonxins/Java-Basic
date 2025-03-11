package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//lambda 식을 이용하여 숫자 리스트에서 짝수만 필터링하는 코드를 작성하시오.
public class Practice1 {
  public static void main(String[] args) {
    List<Integer> numbers =  Arrays.asList(1,  2, 3, 4, 5);
    List<Integer> evenNumbers = numbers.stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toList());
    System.out.println("Even numbers are: " + evenNumbers);
  }
}
