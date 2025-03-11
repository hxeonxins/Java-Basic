package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List<Integer> 에서 짝수만 필터링 후 제곱한 값의 합을 구하는 코드를 작성하시오(filter, map, reduce)
public class Practice1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    Integer sumNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .reduce(0, Integer::sum);
    System.out.println(sumNumbers);
  }
}
