package boucle;

import java.util.Scanner;

public class Sapin {

	public static void main(String[] args) {
		int nb, ligne,cpt;
		do{
			System.out.println("entrez un nb positif supérieur à 2");
			nb=(new Scanner(System.in)).nextInt();
		}while(nb<=2);

		//////////////////////////////////////////////
		// sapin
		/////////////////////////////////////////////
		for (ligne=0;ligne<nb;ligne++){
			for(cpt=(nb-ligne); cpt>=1; cpt--)
				System.out.print(" ");
			for(cpt=1; cpt<=(ligne*2)-1; cpt++)
				System.out.print("*");
			System.out.println("");
		}
		// tronc
		for(cpt=nb-2; cpt>=1; cpt--)
			System.out.print(" ");
		System.out.println("| |");




		/////////////////////////////////////////////////
		// demi sapin
		/////////////////////////////////////////////////
		for (ligne=0;ligne<nb;ligne++){
			for(cpt=0; cpt<=ligne; cpt++)
				System.out.print("*");
			System.out.println("");
		}
		////////////////////////////////////////////////
		// losange
		////////////////////////////////////////////////
		for (ligne=0;ligne<nb;ligne++){
			for(cpt=(nb-ligne); cpt>=1; cpt--)
				System.out.print(" ");
			for(cpt=1; cpt<=(ligne*2)-1; cpt++)
				System.out.print("*");
			System.out.println("");
		}
		for (ligne=nb;ligne>=0;ligne--){
			for(cpt=(nb-ligne); cpt>=1; cpt--)
				System.out.print(" ");
			for(cpt=1; cpt<=(ligne*2)-1; cpt++)
				System.out.print("*");
			System.out.println("");
		}
		//////////////////////////////////////////////
		// sapin creux
		/////////////////////////////////////////////
		for (ligne=0;ligne<nb-1;ligne++){
			for(cpt=(nb-ligne); cpt>=1; cpt--)
				System.out.print(" ");
			if(ligne!=0)
				System.out.print("* ");
			for(cpt=1; cpt<=(ligne*2)-2; cpt++)
				System.out.print(" ");
			System.out.println("*");

		}
		System.out.print(" ");
		for(ligne=0;ligne<nb*2-1;ligne++){
			System.out.print("*");
		}
		System.out.println("");
		// tronc
		for(cpt=nb-1; cpt>=1; cpt--)
			System.out.print(" ");
		System.out.println("| |");

	}

}
