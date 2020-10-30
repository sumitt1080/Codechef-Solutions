import java.util.Scanner;

public class A3_Q14 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a = (int)(Math.random()*(3));
		System.out.print("scissor (0), rock (1), paper (2) : ");
		int b = n.nextInt();
		String s = null,t = null;
		
		switch(a) {
		case 0:
			s = "Scissor";
			break;
		case 1:
			s = "Rock";
			break;
		case 2:
			s = "Paper";
			break;
		default:
			System.out.print("Invalid Input");
			break;
		}
		
		switch(b) {
		case 0:
			t = "Scissor";
			break;
		case 1:
			t = "Rock";
			break;
		case 2:
			t = "Paper";
			break;
		default:
			System.out.print("Invalid Input");
			break;
		}
	
	
		if(a==0 && b==0 || a==1 && b==1 || a==2 && b==2) {
			System.out.print("The Computer is " + s + ".You are "+ t+" too."+" It's a Draw.");
		}
		else if(a==0 && b==1) {
			System.out.print("The Computer is " + s + ".You are "+ t+"."+" You Won.");
		}
		else if(a==0 && b==2) {
			System.out.print("The Computer is " + s + ".You are "+ t+"."+" You Lost.");
		}
		else if(a==1 && b==0) {
			System.out.print("The Computer is " + s + ".You are "+ t+"."+" You Lost.");
		}
		else if(a==1 && b==2) {
			System.out.print("The Computer is " + s + ".You are "+ t+"."+" You Lost.");
			
		}
		else if(a==2 && b==0) {
			System.out.print("The Computer is " + s + ".You are "+ t+"."+" You Won.");
		}
		else if(a==2 && b==1) {
			System.out.print("The Computer is " + s + ".You are "+ t+"."+" You Won.");
		}
			
	}
	
}