package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Julie", "John", "Julie", "denail", "spring");
    List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase) //스트링에서 기본 제공하는 메서드
            .collect(Collectors.toList());
    System.out.println(upperCaseNames);
  }
}
