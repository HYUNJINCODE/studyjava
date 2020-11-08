package studyjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test1024 {
    static int n,l;
    static String str="";
    static String solution(int n, int l) {


            for(int i=l; i<=100; i++){
                int t = (i-1)*i/2;
                int x = (n-t)/i;
                int nmg  = (n-t)%i;
                if(x<0)  continue;
                if(nmg==0){
                    int cnt=0;
                    while(cnt < i){
                        str += x + " ";
                        x++;
                        cnt++;
                    }
                    return str;
                }
            }



        return "-1";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        String result = solution(n,l);
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
