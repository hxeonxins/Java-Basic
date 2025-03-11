package wildcart;

import java.util.Arrays;
import java.util.List;

//List<?>를 사용하여 리스트 요소 개수를 반환하는 메서드를 작성하세요. (힌트: size() 활용)
public class Practice2 {
  public static void main(String[] args) {
    List<Integer> intLists = Arrays.asList(1, 2, 3, 4, 5);
    List<Double> doubleLists = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
    System.out.println("리스트 요소의 개수는: " + getCountList(intLists));
    System.out.println("리스트 요소의 개수는: " + getCountList(doubleLists));

  }

  public static String getCountList(List<?> number) {
    return "작성하기";
  }
}
