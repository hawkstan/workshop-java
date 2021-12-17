import java.util.Random;
import java.util.Scanner;

public class hangmanws {
    public static boolean hanged(int error){ //little hangman drawing
        boolean defeat=false;
        switch (error) {
            case 0:
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
                break;
            case 1:
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
                break;
            case 2:
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
                break;
            case 3:
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
                break;
            case 4:
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
                break;
            case 5:
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
                break;
            case 6:
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
                break;
            case 7:
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
                defeat=true;
                break;
        
        }
        return defeat;
    }
    public static void main(String[] args) {
        char[] wordHidden;
        char[] wordTruth;
        String word[];
        word = new String [5];
        String random = "";
        Random r=new Random();
        int i;
        int ii;
        int error;
        int x;
        int ix;
        char[] badLetters;
        badLetters = new char [6];
        boolean defeat = false;
        boolean victory = false;
        String gameReset = "";
        boolean game = true;
        char letter;
        char letterMaj;
        boolean triedLetter = false;
        boolean badLetter = false;

        word[0]="furet";
        word[1]="pomme de terre";
        word[2]="ornithologue";
        word[3]="Neon Genesis Evangelion";
        word[4]="Winou le magnifique";

        System.out.println("do you wanna play ? (y/n)");
        gameReset=(new Scanner(System.in)).nextLine();
        if (gameReset.equalsIgnoreCase("n")) {
            game = false;
        }
        while(game==true){
            error=0;
            x=0;
            random=word[r.nextInt(word.length)];
            wordTruth=random.toCharArray();
            wordHidden= new char[wordTruth.length];
            for(i=0; i<wordHidden.length; i++){
                if(Character.isWhitespace(wordTruth[i]) | Character.isDigit(wordTruth[i])){ //leave not letters as themselves
                    wordHidden[i]=wordTruth[i];
                } else wordHidden[i]='-';
            }
            defeat=hanged(error);
            System.out.println(wordHidden);

            while (defeat==false && victory==false) {
                System.out.println("Enter a letter :");
                letter=(new Scanner(System.in)).nextLine().charAt(0);
                if(!(Character.isLetter(letter))){
                    while (!(Character.isLetter(letter))) {
                        System.out.println("This is not a letter, please try again");
                        letter=(new Scanner(System.in)).nextLine().charAt(0);
                    }
                }
                letterMaj=Character.toUpperCase(letter);

                for(i=0; i<wordHidden.length; i++){
                    if (letter==wordHidden[i] | letterMaj==wordHidden[i]) {
                        triedLetter=true;
                        badLetter=false;
                    }
                    if ((letter==wordTruth[i] | letterMaj==wordTruth[i]) && triedLetter==false) {
                        for(ii=0; ii<wordTruth.length; ii++){
                            victory = true;
                            if(letter==wordTruth[ii] | letterMaj==wordTruth[ii]) {
                                wordHidden[ii]=wordTruth[ii];
                                wordTruth[ii]='/'; // erase letter from the word to guess to avoid eternal loop
                            }
                        }
                        for(i=0; i<wordHidden.length; i++){
                            if (wordHidden[i]=='-') {
                                victory=false;
                            }
                        }
                        badLetter=false;
                    } else if (triedLetter==false) {
                        badLetter=true;
                    }
                }

                if (badLetter==true) {
                    System.out.println("awww, too bad ! "+letter+" doesn't exist in this word !");
                    error++;
                    if (x<6) {
                        badLetters[x] = letter;
                        x++;
                    }
                    badLetter=false;
                }
                if (triedLetter==true) {
                    System.out.println(letter+" has already been found !");
                    triedLetter=false;
                }
                if (error>0) {
                    System.out.print("Already tried : ");
                    for(ix=0; ix<x-1; ix++){
                        System.out.print(badLetters[ix]+", ");
                    }
                    if(ix==x-1){
                        System.out.println(badLetters[ix]);
                    }
                }

                defeat=hanged(error);
                System.out.println(wordHidden);
            }
            if (defeat==true) {
                System.out.println("aww, too bad, you lost !");
                System.out.println("the secret word was "+random);
                defeat=false;
            }
            if (victory==true) {
                System.out.println("congratulations, you guessed the word !");
                victory=false;
            }
            System.out.println("do you wanna play again ? (y/n)");
            gameReset=(new Scanner(System.in)).nextLine();
            if (gameReset.equalsIgnoreCase("n")) {
                game = false;
            }
        }
        System.out.println("thanks for playing !");

    }
}
