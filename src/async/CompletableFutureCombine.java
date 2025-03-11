package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCombine {
  public static void main(String[] args) {
    CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync( ()->
      10);
    CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync( ()->
      20);

    f1.thenCombine(f2, Integer::sum)//직관적으로 이해 가능한 코드, 추상적임
            .thenAccept(System.out::println); //thenAccept가 출력함
  }
}