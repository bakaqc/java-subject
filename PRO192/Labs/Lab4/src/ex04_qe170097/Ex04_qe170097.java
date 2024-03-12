package ex04_qe170097;

import java.util.Arrays;

public class Ex04_qe170097 {
     public static int sumOfCharacters(String str) {
        int sumOfChars = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sumOfChars++;
            }
        }

        return sumOfChars;
    }

    public static String reserveString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }

        return result;
    }

    public static void thirdCharacter(String str) {
        if (str.length() > 3) {
            System.out.println(str.charAt(2));
        } else {
            System.out.println("N/A");
        }
    }

    public static void substring(String str1, String str2) {
        int position = str1.indexOf(str2);

        if (position == -1) {
            System.out.println("Substring not found in the string");
        } else {
            System.out.println("Substring found at position " + (position + 1) + " in the string");
        }
    }

    public static void analysis(String str) {
        String newStr = str.toLowerCase();

        int numCount = 0;
        int vowelCount = 0;
        int consCount = 0;
        int specialCount = 0;

        for (int i = 0; i < newStr.length(); i++) {
            char c = newStr.charAt(i);

            if (Character.isDigit(c)) {
                numCount++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (Character.isLetter(c)) {
                consCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Number of numeral characters: " + numCount);
        System.out.println("Number of vowel characters: " + vowelCount);
        System.out.println("Number of consonant characters: " + consCount);
        System.out.println("Number of special characters: " + specialCount);
    }

    public static int countOfWords(String str) {
        return str.trim().split("\\s+").length;
    }

    public static void lowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static void upCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static String replace(String str) {
        char[] charArray = str.toCharArray();

        int index = 0;

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] != charArray[index]) {
                charArray[++index] = charArray[i];
            }
        }

        return new String(charArray, 0, index + 1);
    }

    public static String removeUnnescessaryBlanks(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void countPresenceLetters(String str) {
        String newStr = str.toLowerCase();
        int counter[] = new int[26];

        for (int i = 0; i < newStr.length(); i++) {
            char c = newStr.charAt(i);

            if (c >= 'a' && c <= 'z') {
                counter[(int) (c - 'a')]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.println("The occurrence of " + (char) (i + 'a') + " is: " + counter[i]);
            }
        }
    }

    public static String getLastNChars(String str, int n) {
        if (str.length() <= n) {
            return str;
        } else {
            return str.substring(str.length() - n);
        }
    }

    public static String convertTitleCase(String str) {
        boolean nextTitleCase = true;
        String newStr = "";

        for (char c : str.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            newStr += c;
        }

        return newStr.trim();
    }

    public static String formatEnglishName(String str) {
        String newStr = convertTitleCase(str);
        String[] words = newStr.split("\\s+");

        newStr = words[words.length - 1];

        for (int i = 0; i < words.length - 1; i++) {
            newStr += " " + words[i];
        }

        return newStr.trim();
    }

    public static String formatReverse(String str) {
        String newStr = convertTitleCase(str);
        String[] words = newStr.split("\\s+");
        
        newStr = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            newStr += words[i] + " ";
        }
        
        return newStr;
    }

    public static void main(String[] args) {
        analysis("Hello everyone, We are Group 2");
    }
}
