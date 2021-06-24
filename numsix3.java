
public class numsix3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {{80, 90, 70},{20, 30, 50},{100, 100, 100},{60, 70, 60},{40, 50, 20}};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("¹øÈ£  ±¹¾î  ¿µ¾î  ¼öÇÐ  ÃÑÁ¡  Æò±Õ");
		System.out.println("--------------------------");
		
		for(int i=0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%d", i+1);
			
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
				System.out.printf("%d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length;
			System.out.printf("%d %f",sum,avg);
		}
		
		System.out.println("--------------------------");
		System.out.printf("ÃÑÁ¡: %d %d %d", korTotal, engTotal, mathTotal);
	}

}
