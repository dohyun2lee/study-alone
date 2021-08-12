import java.util.Scanner;
import java.util.*;
import java.io.FileInputStream;
	
public class meetingroom {
	     
		static int T = 0;
	    static int max = 0;
	    static int e_time = 0;
	    static int i1, i2, i3;      
	    static ArrayList<Integer> h_arrList;
	    static int[] t_arr;
	    static int[] i_arr;
	    static int[] s_arr;
	    static int[] e_arr;
	     
	    public static void main(String args[]) throws Exception{
	           
	            // 1370 ȸ�ǽ� ����
	    	
	        Scanner scan = new Scanner(System.in);
	           
	        T = scan.nextInt(); // Max 500
	           
	        h_arrList = new ArrayList<Integer>();
	      	t_arr = new int[T];
	      	i_arr = new int[T];
	      	s_arr = new int[T];
	      	e_arr = new int[T];
	           
	      	for (int i=0;i<T;i++){
	      		i1 = scan.nextInt();
	      		i2 = scan.nextInt();
	      		i3 = scan.nextInt();
	      		t_arr[i] = i3 * 1000000 + i2 * 1000 + i + 1;
	      	}
	           
	      	Arrays.sort(t_arr);
	           
	        for (int i=0;i<T;i++) {
	        	e_arr[i] = t_arr[i] / 1000000;
	        	s_arr[i] = (t_arr[i] % 1000000) / 1000;
	        	i_arr[i] = (t_arr[i] % 1000000) % 1000;
	        }
	       
	        // ȸ�� ���� �Ǽ� �ʱ�ȭ
	        h_arrList.add(0,0);
	           
	            // ȸ�� ��ȸ
	        searchM(0,-1);
	 
	            // ������
	        System.out.println(h_arrList.get(0));
	        
	        for (int i=1; i<=h_arrList.get(0); i++){  
	        	System.out.printf("%d ",h_arrList.get(i));   
	        }
	           
	    }
	     
	    public static void searchM(int node, int end_time){
	               
	    	for (int i=node; i<T; i++){
	           
	    		if (e_time > s_arr[i]){
	    			continue;
	    		}
	                 
	    		// ȸ�� ���� �Ǽ�
	    		max++;
	    		h_arrList.set(0,max);
	    		h_arrList.add(max,i_arr[i]);
	           
	    		// ���ȣ��
	    		e_time = e_arr[i];
	                 
	    	}
	           
	    }
	     
}
