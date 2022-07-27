package Stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Prob4{
    public static void main(String[] args)throws Exception{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
            //String s = bf.readLine(); //String
            int num = Integer.parseInt(bf.readLine()); //bf.close();
            //BufferedWriter bw =null;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
            for (int i=0; i<num;i++){//f start
                //String p = bf.readLine(); //String ->넣어야하는지 말아야하는지 모르겠음 둘다 런타임 에러
                
                String st=bf.readLine();
                String arr[]= st.split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);

               
                bw.write((a+b)+"\n");//출력
                //bw.flush();//남아있는 데이터를 모두 출력시킴 -->왜 flush는 되고 close는 안되는지???
                //bw.close();//스트림을 닫음
                //스트림이 닫히고 왜 for문 돌 때 안열리나요?
            }// f end
            //bf.close();
            bw.flush();
            bw.close();//스트림을 닫음 --> 왜 인식이 안됨?  
    	}
    }
   