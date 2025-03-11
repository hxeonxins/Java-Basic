package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//List<String>에서 문자열 길이의 총 합을 구하는 코드를 작성하세요(map, reduce)
public class Practice2 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("abc", "bcd", "cde", "defg", "efgh", "f");
    Optional<Integer> wordLength = words.stream()
            .map(word -> word.length())
            .reduce(Integer::sum);
    System.out.println(wordLength);
  }
}
