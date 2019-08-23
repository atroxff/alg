package cn.ff.alg.algbasetest.difficult;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;
/** ?????
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 *
 * 输入数据有多行，每行为一个用户输入的算式，保证算式是合法的，每行最多包含不超过200个字符。
 * 所有参与运算的数值均为整数，若为指数，则为正整数。
 *
 * 思路；
 * 堆栈，将操作数和操作符分别压入两个堆栈，优先级+,-<*,/<`  自顶向下进行操作
 */
public class EasyCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expression = scanner.nextLine();

            // 操作数
            Stack<BigInteger> operandStack = new Stack<>();
            // 操作符
            Stack<Character> operatorStack = new Stack<>();

            for (int i=0;i<expression.length();i++) {
                char ch = expression.charAt(i);

                switch (ch) {
                    case '+':
                    case '-':
                        while (!operatorStack.isEmpty() &&
                                (operatorStack.peek() == '+' ||
                                        operatorStack.peek() == '-' ||
                                        operatorStack.peek() == '*' ||
                                        operatorStack.peek() == '/' ||
                                        operatorStack.peek() == '^')) {
                            calculateOneOperator(operandStack, operatorStack);
                        }
                        operatorStack.push(ch);
                        break;
                    case '*':
                    case '/':
                        while (!operatorStack.isEmpty() &&
                                (operatorStack.peek() == '*' ||
                                        operatorStack.peek() == '/' ||
                                        operatorStack.peek() == '^')) {
                            calculateOneOperator(operandStack, operatorStack);
                        }
                        operatorStack.push(ch);
                        break;
                    case '^':
                        while (!operatorStack.isEmpty() &&
                                operatorStack.peek() == '^') {
                            calculateOneOperator(operandStack, operatorStack);
                        }
                        operatorStack.push(ch);
                        break;
                    case '(':
                        operatorStack.push(ch);
                        break;
                    case ')':
                        while (operatorStack.peek() != '(') {
                            calculateOneOperator(operandStack, operatorStack);
                        }
                        operatorStack.pop();
                        break;
                    // 注意2: 操作数的获取
                    default:
                        String sNumber = String.valueOf(ch);
                        while (i+1 < expression.length() && Character.isDigit(expression.charAt(i+1))) {
                            ++i;
                            sNumber += String.valueOf(expression.charAt(i));
                        }

                        BigInteger number = new BigInteger(sNumber);
                        operandStack.push(number);
                        break;
                }

                //++i;

            }

            while (!operatorStack.isEmpty()) {
                calculateOneOperator(operandStack, operatorStack);
            }

            System.out.println(operandStack.pop());

        }

        scanner.close();
    }

    private static void calculateOneOperator(Stack<BigInteger> operandStack, Stack<Character> operatorStack) {

        char operator = operatorStack.pop();
        BigInteger operand1 = operandStack.pop();
        BigInteger operand2 = operandStack.pop();

        // 注意3: 操作数的顺序
        switch (operator) {
            case '+':
                operandStack.push(operand2.add(operand1));
                break;
            case '-':
                operandStack.push(operand2.subtract(operand1));
                break;
            case '*':
                operandStack.push(operand2.multiply(operand1));
                break;
            case '/':
                operandStack.push(operand2.divide(operand1));
                break;
            case '^':
                int exponent = operand1.intValue();
                operandStack.push(operand2.pow(exponent));
                break;
        }
    }
}