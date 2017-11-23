import java.util.Scanner;
import java.util.Random;

public class OX {

	public static void main(String[] args) {
		
		System.out.println("Kó³ko i krzy¿yk. Komputer losuje plansze 3-3,\ntwoim zadaniem bêdzie odgadn¹c czy wygra O czy X, \noraz za którym razem trafi siê 3 razy O/X");
		
		Scanner odczyt = new Scanner(System.in);
		Random losuj = new Random();
		String znak = odczyt.next();
		int plansza[][] = new int[3][3];
		int losujxo;
		int licznikx=0;
		int liczniko=0;
		int licznikx1=0;
		int liczniko1=0;
		int licznikx2=0;
		int liczniko2=0;
		int wybranyznak = 0;
		
		String znak1 = "x";
		String znak2 = "o";
		boolean koniec = false;
		boolean koniecpetlix = false;
		boolean koniecpetlio = false;
		
		if (znak.equalsIgnoreCase(znak1)) {
			
			System.out.print("Wybra³eœ znak:");
			System.out.println("X");
			wybranyznak = 1;

		}else if(znak.equalsIgnoreCase(znak2))
		{
			
			System.out.print("Wybra³eœ znak:");
			System.out.println("O");
			wybranyznak = 0;
			
		}else {
			
			System.out.print("Wpisa³eœ z³y znak");
			koniec = true;
			
		}
		
		if(koniec==false) {
			
			System.out.println("Za którym razem trafi siê 3 razy "+ znak.toUpperCase() +"?");
			
			int odczytcyfry = odczyt.nextInt();
			
			while(true) {
				
	
				for(int i=0; i<plansza.length; i++) {
						
					for(int j=0; j<plansza[i].length; j++) {
						
						losujxo = losuj.nextInt(2);
						
						if (losujxo==0) {
						System.out.print("O ");
						}else if (losujxo==1) {
						System.out.print("X ");	
						}
						
						plansza[i][j] = losujxo;
						
						if (wybranyznak == 1) {
							
							if(losujxo==1) {
							licznikx++;
								if (licznikx==3) {	
								koniecpetlix=true;
								}
							}
							
						}else if(wybranyznak == 0) {
							
							if(losujxo==0) {
								licznikx++;
									if (liczniko==3) {	
									koniecpetlio=true;
									}
								}
							
						}
						
						
						
						
						
					}
				licznikx = 0;
				System.out.println();
		
					for(int k=0; k<plansza[i].length; k++) {
						
						if (plansza[k][i]==1) {
						
						licznikx1++;
							
							if(licznikx1==3) {
							koniecpetlix=true;
							}
							
						}
						
						
						
					}
					
					licznikx1 = 0;
				
				}	
				

				
				
				
				
				
				
				
				System.out.println();System.out.println();
				if(koniecpetlix==true) {
				System.out.print("Wygra³ X");
				break;
				}else if(koniecpetlio==true) {
				System.out.print("Wygra³o O");
				break;	
				}
				
				
				
				
				
				
				
				
			
			
				
			}
			
	
			
			
		}
		
		
	
		
	}
	
}
