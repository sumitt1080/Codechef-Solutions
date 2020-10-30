import java.util.Scanner;
public class A5_Q6 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int n,a; double s=0,H;
		System.out.print("Enter the value of n : ");
	    n = l.nextInt();
	    for(int i = 1;i<=n ;i++) {
	    	System.out.print("Enter value of a"+i+" : ");
	    	a=l.nextInt();
	    	s+=(1.0/a);
	    	
	    }
	    H = n/s;
	    System.out.println("The Harmonic mean is : "+H);
		

	}

}