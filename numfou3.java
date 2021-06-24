
public class numfou3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 79, 88, 45, 56, 12, 34};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("ÃÖ´ñ°ª :"+max+"ÃÖ¼Ú°ª :"+min);
	}
	

}
