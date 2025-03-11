package async;

import java.util.concurrent.CompletableFuture;

public class AsyncExample {
  public static void main(String[] args) {

    //동기 처리, 순서대로 실행됨
    System.out.println("Long Time Main Thread is playing......");
    System.out.println("Main Thread is playing...");

    CompletableFuture.supplyAsync( ()->{
      try {
        Thread.sleep(2);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

      return "비동기 작업이 오랜시간 끝에 완료되었습니다.";
    }).thenAccept(System.out::println);

    System.out.println("Main Thread is finishing...");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
