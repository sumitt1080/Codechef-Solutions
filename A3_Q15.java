import java.util.Scanner;
public class A3_Q15 {

	public static void main(String[] args) {
		System.out.print("Enter Points x and y : ");
		Scanner n = new Scanner(System.in);
		int x = n.nextInt();
		int y = n.nextInt();
		
		double dist = Math.pow((x*x + y*y),0.5);
		if(dist<=10) {
			System.out.print("The Points are Inside Circle.");
			
		}
		else {
			System.out.print("The Points are Outside Circle.");
		}
		
		
	}

}
