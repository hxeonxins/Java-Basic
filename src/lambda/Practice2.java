package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List<String> 에서 길이가 5 이상인 문자열만 필터링하는 코드 작성
public class Practice2 {
  public static void main(String[] args) {
    List<String> words =  Arrays.asList("Julie", "John", "Julie", "denail", "spring");
    List<String> evenWords = words.stream()
            .filter(word -> word.length() > 5)
            .collect(Collectors.toList());
    System.out.println(evenWords);
  }
}
