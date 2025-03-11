package wildcart;

import java.util.Arrays;
import java.util.List;

public class BoundedWildcardExample {
  public static double getAverage(List<? extends Number> numbers) { //wildcard의 단점: 모든 타입을 다 알 수 없음 -> 제한을 둬서 number의 자식들(정수,실수)만 받음
    double sum = 0.0;
    for (Number number : numbers) sum += number.doubleValue();
    return sum / numbers.size();
  }

  public static void main(String[] args) {
    List<Integer> intLists = Arrays.asList(1, 2, 3, 4, 5);
    List<Double> doubleLists = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);

    System.out.println("정수 리스트 평균: " + getAverage(intLists));
    System.out.println("실수 리스트 평균: " + getAverage(doubleLists));
  }
}
