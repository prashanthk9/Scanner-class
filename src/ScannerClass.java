import java.util.*;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter ur Nme: ");
		
		String name = in.nextLine();
		
		System.out.println("Name is: "+ name);
		
		in.close();

	}

}
