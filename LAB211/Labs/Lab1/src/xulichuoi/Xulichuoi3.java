/*
Bài 3: Cho 1 chuỗi như sau: “Đại học FPT Quy Nhơn”, sau đó tách chuỗi từ chuỗi FPT, cho ra kết quả: “FPT Quy Nhơn”.
 */
package xulichuoi;

public class Xulichuoi3 {

    private static void splitString(String str) {
        if (str.contains("FPT")) {
            String newStr = str.substring(str.indexOf("FPT"));
            System.out.println(newStr);
        } else {
            System.out.println("Not found keyword 'FPT' !!!");
        }
    }

    public static void main(String[] args) {
        splitString("Đại học FPT Quy Nhơn");

    }
}
