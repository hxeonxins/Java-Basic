package stream;

import java.util.Arrays;
import java.util.List;

public class StringReduceExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    //reduce는 리스트의 모든 값을 하나로 합칠 때 사용
    Integer reduce = numbers.stream().reduce(0, Integer::sum);//초기값 0부터 차례대로 더하기 수행

    System.out.println("reduced: " + reduce);
  }
}
