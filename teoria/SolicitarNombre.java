import java.util.Scanner;

public class SolicitarNombre {
	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner scanner = new Scanner(System.in);		
		int name = scanner.nextInt();
		System.out.println("Welcome " + name + " to GNU/Linux");
		scanner.close();
	}
} 
