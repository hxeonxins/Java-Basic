package wildcard;

import java.util.Arrays;
import java.util.List;

//<? extends Number>를 사용하여 숫자 리스트의 최댓값을 구하는 코드를 작성하세요. (힌트: max()활용)
public class Practice1 {
  public static int getMaxValue(List<? extends Number> number) {
    //최댓값을 구하는 코드 작성
    return 1;
  }

  public static void main(String[] args) {
    List<Integer> strLists = Arrays.asList(1,2,3,4,5);
    List<Double> doubleLists = Arrays.asList(1.3, 2.2, 3.1, 4.2, 5.3);
    System.out.println("Max : " +  getMaxValue(strLists));
  }
}
