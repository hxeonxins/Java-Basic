package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFilter {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Jane");
    names.add("Julie"); //names에 하나씩 저장됨, 동적 영역에 저장됨

    List<String> names2 = Arrays.asList("John", "Jane", "Julie"); //정적으로 저장, 수정할 수 없음
    //names2.add("sdfp"); --> error!
    System.out.println(names2);
  }
}
