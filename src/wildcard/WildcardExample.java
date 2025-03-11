package wildcart;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
  public static void printList(List<?> list) { //<?> -> wildcard 문법. 어떤 타입이든 받겠다는 표시이다ㅏ.
    for (Object o : list){
      System.out.println(o);
    }
  }
  public static void main(String[] args) {

    List<String> strLists = Arrays.asList("a", "b", "c");
    List<Integer> intLists = Arrays.asList(1, 2, 3);

    printList(strLists);
    printList(intLists);

  }
}
