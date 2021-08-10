import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
 
public class numone44{
     
      static int N = 0;
      static int cnt = 0, l_cnt = 1, w_cnt = 1, i1 = 0, i2 = 0;
      static int len = 0, width = 0;
      static int[] l_arr, w_arr;
      static int[] t_l_arr, t_w_arr;
     
      public static void main(String args[]) throws Exception{
           
            // 1669 : 소시지 공장
            Scanner scan = new Scanner(System.in);
           
            N = scan.nextInt(); // Max 5000
           
            l_arr = new int[N];
            w_arr = new int[N];
            t_l_arr = new int[N];
            t_w_arr = new int[N];
           
            for (int i=0;i<N;i++){
                  i1 = scan.nextInt();
                  i2 = scan.nextInt();
                  t_l_arr[i] = i1 * 10000 + i2;
                  t_w_arr[i] = i2 * 10000 + i1;
            }
           
            scan.close();
           
            // 길이로 정렬
            Arrays.sort(t_l_arr);
           
            for (int i=0;i<N;i++){
                  l_arr[i] = t_l_arr[i] / 10000;
                  w_arr[i] = t_l_arr[i] % 10000;
            }
 
            while (1 > 0){
                 
                  width = 0;
                 
                  for (int i=0; i<N; i++){
           
                              if ((t_l_arr[i] != 1) && (w_arr[i] > width)){
                                         cnt++;
                                         t_l_arr[i] = 1;
                                         width = w_arr[i];
                              }
                             
                  }
                 
                  if (cnt == N){
                              break;
                  }
                  else {
                              l_cnt++;
                  }
                 
            }
           
            // 너비로 정렬
            Arrays.sort(t_w_arr);
           
            for (int i=0;i<N;i++){
                  w_arr[i] = t_w_arr[i] / 10000;
                  l_arr[i] = t_w_arr[i] % 10000;
            }
           
            cnt = 0;
            while (1 > 0){
                 
                  len = 0;
                 
                  for (int i=0; i<N; i++){
                             
                              if ((t_w_arr[i] != 1) && (l_arr[i] > len)){
                                         cnt++;
                                         t_w_arr[i] = 1;
                                         len = l_arr[i];
                              }
                             
                  }
                 
                  if (cnt == N){
                              break;
                  }
                  else {
                              w_cnt++;
                  }
                 
            }
 
            // 결과 출력
            System.out.printf("%d\n",Math.min(l_cnt,w_cnt));
      }
     
}