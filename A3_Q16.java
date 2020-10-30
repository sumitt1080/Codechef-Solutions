import java.util.Scanner;
public class A3_Q16 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the Marks of the student : ");
		byte marks = n.nextByte();
		int b = marks/10;
		switch(b) {
			case 10:
			case 9:
				System.out.print("O");
					break;
			case 8:
				System.out.print("A");
				break;
			case 7:
				System.out.print("B");
				break;
			case 6:
				System.out.print("C");
				break;
			case 5:
				System.out.print("D");
				break;
			case 4:
				System.out.print("E");
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.print("F");
				break;
			default:
				System.out.print("Invalid Input");
		
		
		
		
		}
	}

}
