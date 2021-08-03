import java.io.*;

public class numseven38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("Ex.java");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			for(int i=1;(line = br.readLine())!=null;i++) { 
				if(line.indexOf(";")!=-1)	
					 System.out.println(i+":"+line);
			}
                    
			br.close();
		} catch(IOException e) {}
	}
}



