import java.util.Scanner;
import java.io.FileInputStream;
 
public class numone47{
     
      static int N = 0;
      static int[] s_arr, e_arr;
      static int cnt = 0, cnt2 = 0, i1 = 0, i2 = 0;
      static int start_time = 0, end_time = 0;
     
      public static void main(String args[]) throws Exception{
           
            // 2247 µµ¼­°ü
            Scanner scan = new Scanner(System.in);
           
            N = scan.nextInt(); // Max 10000
           
            s_arr = new int[N];
            e_arr = new int[N];
           
            for (int i=0;i<N;i++){
            s_arr[i] = scan.nextInt();
            e_arr[i] = scan.nextInt();     
            }
           
            scan.close();
           
            sortF();
           
            searchF(); 
     
            System.out.printf("%d ",cnt);
            System.out.printf("%d\n",cnt2);
           
      }
 
      public static void sortF(){
        
        int s_tmp = 0, e_tmp = 0;
 

        for (int i=0; i<N-1; i++){
              for (int j=i+1; j<N; j++){
                    if (s_arr[j] < s_arr[i]){
                          s_tmp = s_arr[i];
                          e_tmp = e_arr[i];
                          s_arr[i] = s_arr[j];
                          e_arr[i] = e_arr[j];
                          s_arr[j] = s_tmp;
                          e_arr[j] = e_tmp;
                    }
              }
        }
        
        for (int i=0; i<N-1; i++){
              for (int j=i+1; j<N; j++){
                    if ((s_arr[j] == s_arr[i]) && (e_arr[j] < e_arr[i])){
                          s_tmp = s_arr[i];
                          e_tmp = e_arr[i];
                          s_arr[i] = s_arr[j];
                          e_arr[i] = e_arr[j];
                          s_arr[j] = s_tmp;
                          e_arr[j] = e_tmp;
                    }
              }
        }
        
      }
     
      public static void searchF(){
 
        start_time = s_arr[0];
        end_time = e_arr[0];
        
        for (int i=1; i<N; i++){
              if (s_arr[i] <= end_time){

                    if (end_time < e_arr[i]){
                          end_time = e_arr[i]; 
                    }

                  if ((end_time - start_time) > cnt){
                     cnt = end_time - start_time;
                  }
                 
              }
              
              else {
                    if ((s_arr[i] - end_time) > cnt2){
                          cnt2 = s_arr[i] - end_time;
                    }
                    
                    start_time = s_arr[i];
              end_time = e_arr[i];
              }
              
          }
           
      }
     
}