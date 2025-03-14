package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilter {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Jane");
    names.add("Julie"); //names에 하나씩 저장됨, 동적 영역에 저장됨

    List<String> names2 = Arrays.asList("John", "Jane", "Julie"); //정적으로 저장, 수정할 수 없음
//    try {
//      names2.add("sdfp");
//    } catch (UnsupportedOperationException e) {
//      System.out.println("리스트가 정적으로 할당되어서 수정이 불가한 상태입니다." + e.getMessage());
//    }
    List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("J"))
            .collect(Collectors.toList());
    System.out.println(filteredNames);
  }
}
