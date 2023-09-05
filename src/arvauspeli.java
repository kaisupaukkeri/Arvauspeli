import java.util.Scanner;

public class arvauspeli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Luodaan muuttujat
		String name = "Kaisu";
		String answer = "";
		int counter = 0;
		
		do
		{
			System.out.println("Guess my name: ");
			answer = in.nextLine();
			
			// Muutetaan nimet pieniksi kirjaimiksi, niin arvailu on helpompaa
			name = name.toLowerCase();
			answer = answer.toLowerCase(); 
			counter ++;
		
		} while (!name.equals(answer));
		
		
		// Tulostukset oikeasta vastauksesta
		System.out.println("Congratulations! My name is Kaisu.");
		System.out.println("You guessed " + counter + " times.");
		

	}

}
