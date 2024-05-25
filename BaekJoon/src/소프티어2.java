import java.io.*;
import java.util.StringTokenizer;

public class 소프티어2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String crypt = st.nextToken();
        String key = st.nextToken();
        int rotate =Integer.parseInt(st.nextToken());
        String message = st.nextToken();
        int [] keys = new int[key.length()];
        int [] messages = new int[message.length()];
        char [] sums = new char[Math.max(keys.length, messages.length)];
        String result = "";

        for(int i=0; i<key.length(); i++){
            int keyNum = key.charAt(i) - 'a';
            keys[i] = keyNum;
        }
        for(int i=0; i<message.length(); i++){
            int messageNum =message.charAt(i) - 'a';
            messages[i] = messageNum;
        }


        if(crypt.equals("encrypt")){
            // 암호화
            for(int i=0; i< sums.length; i++){
                int sum = (keys[i] + messages[i]) %26;
                sums[i] = (char)(sum +'a');
            }
            if(rotate >=0){
                int realRotate = rotate % sums.length;

                for(int i=realRotate; i<sums.length; i++){
                    result += sums[i];
                }
                for(int i=0; i<realRotate; i++){
                    result+=sums[i];
                }

            } else{
                int realRotate = (rotate * -1) % sums.length;
                for(int i=sums.length-1 - realRotate; i<sums.length; i++){
                    result += sums[i];
                }
                for(int i=0; i<sums.length-1; i++){
                    result+=sums[i];
                }

            }

        }else {
            // 복호화
            for(int i=0; i< sums.length; i++){
                int sum = (messages[i] - keys[i]);
                sums[i] = (char)((sum+'a')%26);
            }
            if(rotate >=0){
                int realRotate = rotate % sums.length;

                for(int i=realRotate; i<sums.length; i++){
                    result += sums[i];
                }
                for(int i=0; i<realRotate; i++){
                    result+=sums[i];
                }

            } else{
                int realRotate = (rotate * -1) % sums.length;
                for(int i=sums.length-1 - realRotate; i<sums.length; i++){
                    result += sums[i];
                }
                for(int i=0; i<sums.length-1; i++){
                    result+=sums[i];
                }

            }
        }

        bw.write(result+"");
        bw.flush();

    }
}
