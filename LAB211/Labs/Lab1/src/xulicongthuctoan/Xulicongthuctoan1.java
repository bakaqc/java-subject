/*
 Bài 1: Cho công thức toán học sau: "215+6*(5*(15/5)-4)+2*3". Hiển thị ra kết quả của công thức.
 */
package xulicongthuctoan;

import java.util.Stack;

public class Xulicongthuctoan1 {

    private static double caculateExpression(String str) {
        char[] st = str.replaceAll(" ", "").toCharArray(); 
        Stack<Integer> numbers = new Stack<Integer>();
        Stack<Character> operator = new Stack<Character>();

        for (int i = 0; i < st.length; i++) {
            if (st[i] >= '0' && st[i] <= '9') { 
                StringBuffer strnumber = new StringBuffer();
                while (i < st.length && st[i] >= '0' && st[i] <= '9') {
                    strnumber.append(st[i++]);
                }
                numbers.push(Integer.parseInt(strnumber.toString()));
                i--;
            } else if (st[i] == '(') { 
                operator.push(st[i]);
            } else if (st[i] == ')') { 
                while (operator.peek() != '(') {
                    numbers.push(caculate(operator.pop(), numbers.pop(), numbers.pop()));
                }
                operator.pop();
            } else if (st[i] == '+' || st[i] == '-' || st[i] == '*' || st[i] == '/') {  
                while (!operator.empty() && priority(st[i], operator.peek())) {
                    numbers.push(caculate(operator.pop(), numbers.pop(), numbers.pop()));
                }
                operator.push(st[i]);
            }
        }

        while (!operator.empty())
        {
            numbers.push(caculate(operator.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();  
    }

    
    public static boolean priority(char oper1, char oper2) {
        if (oper2 == '(' || oper2 == ')') {
            return false;
        }
        if ((oper1 == '*' || oper1 == '/') && (oper2 == '+' || oper2 == '-')) {
            return false;
        } else {
            return true;
        }
    }
    
    public static int caculate(char operate, int b, int a) {
        switch (operate) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("The result of expression: " + caculateExpression("215+6*(5*(15/5)-4)+2*3"));
    }
}
