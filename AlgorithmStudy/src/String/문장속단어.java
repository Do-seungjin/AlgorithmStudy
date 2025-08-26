package String;

import java.util.Scanner;

public class 문장속단어 {
  public String solution(String str) {
    String answer = "";
    int max = Integer.MIN_VALUE;
    String[] arr = str.split(" ");
    for (String a : arr) {
      if (a.length() > max) {
        answer = a;
        max = a.length();
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    문장속단어 T = new 문장속단어();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    System.out.println((T.solution(str)));
    sc.close();
  }
}
