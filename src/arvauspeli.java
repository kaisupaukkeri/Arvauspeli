import java.util.Scanner;

public class arvauspeli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Luodaan muuttujat
		String name = "Kaisu";
		String answer = "";
		int counter = 0;
		
		// Muuttujan avulla annetaan pelaajalle mahdollisuus lopettaa peli
		String end = "";
		
		do
		{
			System.out.println("Guess my name or do you want to end (e): ");
			answer = in.nextLine();
			if (answer.equals("e"))
			{
				break;
			}
			
			// Muutetaan nimet pieniksi kirjaimiksi, niin arvailu on helpompaa
			name = name.toLowerCase();
			answer = answer.toLowerCase(); 
			counter ++;
		
		} while (!name.equals(answer));
		
		if (answer.equals(name))
		// Tulostukset oikeasta vastauksesta
		{
			System.out.println("Congratulations! My name is Kaisu.");
			System.out.println("You guessed " + counter + " times.");
		}
		System.out.println("Game end!");

	}

}
