import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 영단어_암기는_괴로워 {
    static int M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Word> pq = new PriorityQueue<>();
        ArrayList<String> arr = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            String now = br.readLine();
            if(now.length() >= M){
                arr.add(now);
            }
        }
        ArrayList<String> arr2 = new ArrayList<>(arr);
        for (String s : arr2) {
            if(arr.contains(s)){
                int frequency = Collections.frequency(arr, s);
                arr.removeIf(a -> a.equals(s));
                pq.add(new Word(s, frequency));
            }
        }
        while(!pq.isEmpty()){
            Word poll = pq.poll();
            bw.write(poll.word);
            bw.newLine();
        }
        bw.flush();

    }
}
class Word implements Comparable<Word>{
    String word;
    int count;
    public Word(String word,int count){
        this.word = word;
        this.count = count;
    }
    public int compareTo(Word word){
        if(word.count!= this.count) return word.count - this.count;
        else if (word.word.length()!= this.word.length()) return word.word.length() - this.word.length();
        else {
            for(int i=0; i<word.word.length(); i++)
                if(word.word.charAt(i) != this.word.charAt(i)){
                    return this.word.charAt(i) - word.word.charAt(i);
                }
        }
        return 0;
    }
}
