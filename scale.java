import java.util.Scanner;
import java.util.*;
import java.io.FileInputStream;
 
public class scale{
     
      static int N = 0;
      static int[] w_arr, arr;
      static int tmp = 0, max = 1, cnt = 0, tcnt = 0;
     
      public static void main(String args[]) throws Exception{
           
            // 2499 저울
            Scanner scan = new Scanner(System.in);
           
            N = scan.nextInt(); // Max 1000
           
            w_arr = new int[N];
            arr = new int[(int) Math.pow(N,2)];
           
            for (int i=0;i<N;i++){
            w_arr[i] = scan.nextInt();     
            }
           
            scan.close();
           
            // 추의 무게를 오름차순으로 정렬
            Arrays.sort(w_arr);
           
            // 측정할 수 무게값 산정
            loop :
            for (int i=0; i<N; i++){
           
            tcnt = cnt;
            for (int j=0; j<=tcnt; j++){
                   tmp = arr[j] + w_arr[i];
                  
                   if (max < tmp){
                         break loop;
                   }
                  
                   if (arr[cnt] < tmp){
                         arr[++cnt] = tmp;
                         max++;
                   }
                  
            }
                        
            }
           
            System.out.printf("%d\n",max);
           
      }
           
}
 