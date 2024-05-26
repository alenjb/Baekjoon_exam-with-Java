package 스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int now = Integer.parseInt(st.nextToken());
            switch (now){
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.add(num);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        int pop = stack.pop();
                        bw.write(pop+"\n");
                    }else {
                        bw.write("-1\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size()+"\n");
                    break;
                case 4:
                    if(stack.isEmpty()){
                        bw.write("1\n");
                    }else {
                        bw.write("0\n");
                    }
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        int top = stack.peek();
                        bw.write(top+"\n");
                    }else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}
