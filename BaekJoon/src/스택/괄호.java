package 스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Character> stack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i< N; i++){
            String check = check(N, br, stack, bw);
            bw.write(check+"\n");
            stack.clear();
        }
        bw.flush();
    }

    private static String check(int N, BufferedReader br, Stack<Character> stack, BufferedWriter bw) throws IOException {
            String line = br.readLine();
            for(int j=0; j<line.length(); j++){
                char now = line.charAt(j);
                if(now == '(') stack.push(now);
                else if(now == ')'){
                    if(stack.isEmpty()){
                        return "NO";
                    }
                    char peek = stack.peek();
                    if(peek == '(') stack.pop();
                    else {
                        return "NO";
                    }
                }
            }
            if(stack.isEmpty()) return "YES";
            else return "NO";
    }
}
