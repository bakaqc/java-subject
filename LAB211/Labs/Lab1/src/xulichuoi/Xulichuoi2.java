/*
Bài 2: Đếm số nguyên âm, phụ âm trong một chuỗi: “Welcome to GST.Q7”
            Nguyên âm: "a,e,i,o,u"
 */
package xulichuoi;

public class Xulichuoi2 {

//    Đếm số nguyên âm trong một chuỗi
    public static int numberofvowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

//    Đếm số phụ âm trong một chuỗi
    public static int numberofconsonant(String str) {
        int count = 0;
        str = str.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' & ch != 'e' & ch != 'i' & ch != 'o' & ch != 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Welcome to GST.Q7";
        System.out.println("Number of vowels in String: " + numberofvowels(str));
        System.out.println("Number of consonant in String: " + numberofconsonant(str));
    }
}
