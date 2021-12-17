package labo;

import java.util.Random;
import java.util.Scanner;

public class pendu {

	public static boolean jeu(int err) {
		boolean défaite=false;
	if(err==0) {
		System.out.println("   ____________");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("___|___");
	}
	if(err==1) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("___|___");
	}
	if(err==2) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |           |");
		System.out.println("   |           |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("___|___");
	}
	if(err==3) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |           |");
		System.out.println("   |           |");
		System.out.println("   |          / ");
		System.out.println("   |         / ");
		System.out.println("___|___");
	}
	if(err==4) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |           |");
		System.out.println("   |           |");
		System.out.println("   |          / \\ ");
		System.out.println("   |         /   \\");
		System.out.println("___|___");
	}
	if(err==5) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |          _|");
		System.out.println("   |         / |");
		System.out.println("   |          / \\ ");
		System.out.println("   |         /   \\");
		System.out.println("___|___");
	}
	if(err==6) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        |     |");
		System.out.println("   |         \\_ _/");
		System.out.println("   |          _|_");
		System.out.println("   |         / | \\");
		System.out.println("   |          / \\ ");
		System.out.println("   |         /   \\");
		System.out.println("___|___");
	}
	if(err==7) {
		System.out.println("   ____________");
		System.out.println("   |          _|_");
		System.out.println("   |         /   \\");
		System.out.println("   |        | x  x|");
		System.out.println("   |         \\_._/");
		System.out.println("   |          _|_");
		System.out.println("   |         / | \\");
		System.out.println("   |          / \\ ");
		System.out.println("   |         /   \\");
		System.out.println("___|___");
		défaite=true;
	}
	return défaite;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mot[];
		mot=new String [20];
		String rad="";
		Random r=new Random();
		int i=0;
		int ii=0;
		int err=0;
		char[] mod;
		char[] game;
		char let=' ';
		boolean faute=true;
		boolean défaite=false;
		boolean victoire=false;
		String cont="";
		boolean inue=true;
	while(inue==true) {
		err=0;
		mot[0]="furet";
		mot[1]="jambe";
		mot[2]="ornithologue";
		mot[3]="papaye";
		mot[4]="machaon";
		mot[5]="patate";
		mot[6]="fantaisie";
		mot[7]="mirage";
		mot[8]="soleil";
		mot[9]="constellation";
		mot[10]="foin";
		mot[11]="pistache";
		mot[12]="turquoise";
		mot[13]="finance";
		mot[14]="chemise";
		mot[15]="foudre";
		mot[16]="neutron";
		mot[17]="dragon";
		mot[18]="misogynie";
		mot[19]="curry";
		rad=mot[r.nextInt(20)];
		mod=rad.toCharArray();
		game=new char[mod.length];
		for(i=0; i<game.length; i++) {
			game[i]='-';
		}
		System.out.println("Salem, 1800");
		System.out.println("Le peuple est rassemblé pour votre pendaison");
		System.out.println("On vous propose une chance d'échapper à votre sort");
		System.out.println("Saurez-vous la saisir ?");
		défaite=jeu(err);
		System.out.println(game);
		while(défaite==false & victoire==false) {
			victoire=true;
			System.out.println("Choisissez une lettre");
			let=(new Scanner(System.in)).nextLine().charAt(0);
			for(i=0; i<game.length; i++) {
				if(let==mod[i]) {
					System.out.println("Joli !");
					for(ii=0; ii<mod.length; ii++) {
						if(let==mod[ii]) {
							game[ii]=mod[ii];
							mod[ii]='/';
						}
					}
					défaite=jeu(err);
					System.out.println(game);
					faute=false;
					for(i=0; i<game.length; i++) {
						if(game[i]=='-') {
							victoire=false;
						}
					}
				}
				else faute=true;
			}
			if(faute==true) {
				System.out.println("Dommage");
				System.out.println(let+" = faux");
				err++;
				victoire=false;
				défaite=jeu(err);
				System.out.println(game);
			}
		}
		if(défaite==true){
			System.out.println("Les cris de joie résonnent sur la place centrale tandis que le bourreau met le feu à votre cadavre");
			System.out.println("Vous avez échoué à ce jeu");
		}
		else{
			System.out.println("La foule est déçue de voir son spectacle être annulé");
			System.out.println("Mais vous avez réussi à sauver votre peau, et vous appréciez ce jour comme jamais aucun auparavant");
		}
		System.out.println("Désirez-vous réessayer ?");
		cont=(new Scanner(System.in)).nextLine();
		if(cont.equalsIgnoreCase("non")) {
			inue=false;
		}
		défaite=false;
		victoire=false;
		}
	}

}