package w3;

import java.util.Scanner;

public class ReverseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        String s = sc.nextLine();

        Reverser reverser = new Reverser(s);
        String reversedString = null;
        reversedString = reverser.reverse();

        System.out.println("뒤집힌 문자열: ");
        System.out.println(reversedString);

        String reversedWords = null;
        reversedWords = reverser.reverseWords();

        System.out.println("단어 단위로 뒤집힌 문자열: ");
        System.out.println(reversedWords);

        sc.close();

    }
}
