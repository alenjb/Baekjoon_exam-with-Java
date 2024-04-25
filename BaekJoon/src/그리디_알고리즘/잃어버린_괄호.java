package 그리디_알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 잃어버린_괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int now = 0;
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i) == '+' || line.charAt(i) == '-' ){
                operands.add(Integer.parseInt(line.substring(now, i)));
                operator.add(line.charAt(i));
                now = i+1;
            }
        }
        operands.add(Integer.parseInt(line.substring(now, line.length())));

        int result = 0;
        int result1=0;
        // 연산자가 남을 때까지
        while (!operator.isEmpty()){
            char op = operator.pop();
            int right = operands.pop();
            if(op == '+'){
                result1 += right;
            }else if(op == '-'){
                result1  = -(result1 + right);
                result += result1;
                result1 =0;
            }
        }
        if(result1 !=0) result += result1;
        result = operands.pop() + result;
        System.out.println(result);

        }
    }
