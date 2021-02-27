import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		
		int[] c = new int[7] ;
	    Random rd = new Random();
        System.out.print("隨機出現 : ");
        for(int i=1; i<11; i++){
        	int j = rd.nextInt(6)+1;
	        System.out.print(j + "\t");
	        c[j]++;
	        }
        
        System.out.println();
        System.out.println("出現統計 : ");
        
        for(int i=1; i<7; i++){
        	System.out.println(i + "出現:" + c[i] +"次");
	        }
	}

}
