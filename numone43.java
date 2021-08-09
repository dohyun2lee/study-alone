import java.util.*;
//정보올림피아드 1828번 냉장고 문제

public class numone43 {

		// TODO Auto-generated method stub
		static int N = 0;
	      static int[] l_arr, h_arr, t_arr;
	      static int count = 0, tcnt = 0;
	      static int low = 0, high = 0;
	     
	      public static void main(String args[]) throws Exception{
	    	  Scanner scan = new Scanner(System.in);
	          
	    	  N = scan.nextInt(); 
	           
	          l_arr = new int[N];
	          h_arr = new int[N];
	          t_arr = new int[N];
	           
	          for (int i=0;i<N;i++){
	        	  l_arr[i] = scan.nextInt();
	              h_arr[i] = scan.nextInt();
	          }
	           
	          scan.close();
	            
	          sortF();
	           
	          for (int i=0;i<N;i++) {
	        	  searchF(i);      
	          }
	           
	          System.out.printf("%d개\n",tcnt);
	            
	    }
	 
	      public static void sortF(){
	            
	    	  int l_tmp = 0, h_tmp = 0;
		            
	    	  for (int i=0;i<N;i++){
	    		  for (int j=i+1;j<N;j++){
	    			  if (h_arr[j] < h_arr[i]){
	    				  l_tmp = l_arr[i];
	    				  h_tmp = h_arr[i];
		                  l_arr[i] = l_arr[j];
		                  h_arr[i] = h_arr[j];
		                  l_arr[j] = l_tmp;
		              	  h_arr[j] = h_tmp;
	    			  }
	    		  }
	    	  }
		                      
	      } 
	      
	      public static void searchF(int node){
	 
	    	  count = 0;
	    	  
	          for (int i=0; i<N; i++){
	        	  if (l_arr[i] <= h_arr[node]){
	        		  count++;
	              }      
	          }
	           
	          if (count > 0){
	        	  tcnt++; 
	          }
	           
	    }
	 
	     
	}