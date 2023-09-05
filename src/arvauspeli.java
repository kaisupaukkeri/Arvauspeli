import java.util.Scanner;

public class arvauspeli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Luodaan muuttujat
		String name = "Kaisu";
		String answer = "";
		
		do
		{
			System.out.println("Guess my name: ");
			answer = in.nextLine();
			
			// Muutetaan nimet pieniksi kirjaimiksi, niin arvailu on helpompaa
			name = name.toLowerCase();
			answer = answer.toLowerCase(); 
		
		} while (!name.equals(answer));
		
		

	}

}
