import java.io.*;

public class 달팽이 {
    static long[][] arr; // int 대신 long으로 변경
    static int n;
    static int findNum;
    static int count , x, y, resultX, resultY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        findNum = Integer.parseInt(br.readLine());
        arr = new long[n][n]; // int 대신 long으로 변경
        x = (n-1) / 2;
        y = (n-1) / 2;
        resultY = y+1;
        resultX = x+1;
        count = 1;
        arr[y][x] = count;
        for(int i=1; i<= n; i=i+2){
            if(i == 1) continue;
            calculate(i/2);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(arr[i][j]).append(" "); // 배열의 모든 요소 출력
            }
            sb.append("\n");
        }
        sb.append(resultY + " "+ resultX);
        bw.write(sb.toString());
        bw.flush();
    }

    public static void calculate(int depth){
        // 위로 1 만큼 이동
        y = y-1;
        arr[y][x] = ++count;
        if(count == findNum){
            resultY = y+1;
            resultX = x +1;
        }


        // 오른쪽으로 2 * n -1 만큼 이동
        for(int k=1; k<=2*depth-1; k++){
            x++;
            arr[y][x] = ++count;
            if(count == findNum){
                resultY = y+1;
                resultX = x +1;
            }

        }

        // 아래로 2n 만큼 이동
        for(int k=1; k<=2*depth; k++){
            y++;
            arr[y][x] = ++count;
            if(count == findNum){
                resultY = y+1;
                resultX = x +1;
            }
        }
        // 왼쪽으로 2n 만큼 이동
        for(int k=1; k<=2*depth; k++){
            x--;
            arr[y][x] = ++count;
            if(count == findNum){
                resultY = y+1;
                resultX = x +1;
            }
        }
        // 위로 2n 만큼 이동
        for(int k=1; k<=2*depth; k++){
            y--;
            arr[y][x] = ++count;
            if(count == findNum){
                resultY = y+1;
                resultX = x +1;
            }
        }
    }
}
