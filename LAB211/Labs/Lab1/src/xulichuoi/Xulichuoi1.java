//Bài 1: Đảo ngược các từ trong chuỗi sau: “Welcome to GST.Q7”.
package xulichuoi;

import java.util.Stack;

public class Xulichuoi1 {

    public static void reverseWords(String str) {
        Stack x = new Stack();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            x.push(words[i]);
        }
        while (!x.isEmpty()) {
            System.out.print(x.pop() + " ");
        }
    }

    public static void main(String[] args) {
        reverseWords("Welcome to GST.Q7");
    }
}
