import java.util.Random;
import java.util.Scanner;

public class hangman {
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
    public static void main(String[] args){
        //need to declare ALL variables used
        int error;
        int i;
        int ii;
        char letter;
        char letterMaj;
        char[] wordHidden;
        char[] wordTruth;
        String word[];
        word = new String [15];
		String random = "";
        Random r=new Random();
        boolean badLetter = false;
        boolean triedLetter = false;
        char[] badLetters;
        int x;
        int ix = 0;
        badLetters = new char [6];
        boolean defeat = false;
        boolean victory = false;
        String gameReset = "";
        boolean game = true;

        //introduction
        System.out.println("Salem, 1800");
        System.out.println("You have been found guilty of witchcraft and will be hung");
        System.out.println("However, the executionner is bored, and if you manage to guess his word, he will let you go");
        System.out.println("Do you want to play ? (y/n)");
        gameReset=(new Scanner(System.in)).nextLine();
        if(gameReset.equalsIgnoreCase("n")) { 
            game=false;
        }
        //System.out.println("Just kidding, you don't have a choice");
        while(game==true){
            //resetting counters
            x = 0;
            error = 0;
            //array of words to guess
            word[0]="furet";
            word[1]="pomme de terre";
            word[2]="ornithologue";
            word[3]="Neon Genesis Evangelion";
            word[4]="Winou le magnifique";
            word[5]="Fullmetal Alchemist";
            word[6]="Sauron";
            word[7]="constellation";
            word[8]="le Seigneur des Anneaux";
            word[9]="pistache";
            word[10]="SEPHIROTH";
            word[11]="chute de Constantinople";
            word[12]="Sir Winston the 1st of his Name His Majesty Emperor and King of the Seven Gardens Protector of the Realm and the Winouide Dynasty Conqueror of Hearts and Cutest Cutie Pie";
            word[13]="Ancalagon le noir";
            word[14]="anticonstitutionellemment";

            //selecting random word from array and hiding it
            random=word[r.nextInt(word.length)];
            wordTruth=random.toCharArray();
            wordHidden=new char[wordTruth.length];
            for(i=0; i<wordHidden.length; i++) {
                if(wordTruth[i]==' '){ //leave blank space blanks
                    wordHidden[i]=' ';
                } else wordHidden[i]='-';
            }
            defeat=hanged(error);

            //actual game loop
            while(defeat==false && victory==false) { //lazy &&, stop checking if one condition is not ok
                System.out.println(wordHidden);
                System.out.println("Enter a letter :");
                letter=(new Scanner(System.in)).nextLine().charAt(0);
                letterMaj=Character.toUpperCase(letter); //will permit to check for uppercase
                for(i=0; i<wordHidden.length; i++) { //check every letter to see if user got one correct
                    if(letter==wordHidden[i] | letterMaj==wordHidden[i]) { //check if the letter was already guessed
                        triedLetter = true;
                        badLetter=false;
                    }
                    if((letter==wordTruth[i] | letterMaj==wordTruth[i]) && triedLetter==false) { 
                        System.out.println("Nice !");
                        for(ii=0; ii<wordTruth.length; ii++) { //replace every letter, without the congratulation each time (for double letters)
                            victory = true;
                            if(letter==wordTruth[ii] | letterMaj==wordTruth[ii]) {
                                wordHidden[ii]=wordTruth[ii];
                                wordTruth[ii]='/'; // erase letter from the word to guess to avoid eternal loop
                            }
                        }
                        for(i=0; i<wordHidden.length; i++) { //check if there's still letters to guess
                            if(wordHidden[i]=='-') {
                                victory = false; // with victory true in precedent loop, avoid victory on final letter
                            }
                        }
                        badLetter=false;
                    } else if(triedLetter==false){
                        badLetter = true; //this was supposed to check the array and not count error already made
                        //while(triedLetter!=true | ix<badLetters.length){
                        //    for(ix=0; ix<badLetters.length; ix++){
                        //        if(letter==badLetters[ix] | letterMaj==badLetters[ix]);{
                        //            triedLetter = true;
                        //            badLetter = false;
                        //        }
                        //    }
                        //}
                    }
                    
                }
                if(badLetter==true) { //print error message
                    System.out.println("Awww, too bad !");
                    System.out.println(letter+" is not in the word to guess"); //change this, have array of bad letters, display it under the hangman
                    System.out.println("You feel the rope tightening");
                    error++;
                    if(x<6){
                        badLetters[x] = letter;
                        x++;
                    }
                    badLetter = false;
                }
                if(triedLetter==true) {
                    System.out.println(letter+" was already found !");
                    triedLetter=false;
                }
                if(error>0) {
                    System.out.print("Already tried : ");
                    for(ix=0; ix<x-1; ix++){
                        System.out.print(badLetters[ix]+", ");
                    }
                    if(ix==x-1){
                        System.out.println(badLetters[ix]);
                    }
                }
                defeat=hanged(error);
            }
            //final results
            if(defeat==true){
                System.out.println("The crowd cheers as the ground fall beneath your feet");
                System.out.println("As you fall, you hear the executionner say 'too bad friend, my word was "+random+".");
                System.out.println("You have lost the game, and your life");
            }
            if(victory==true){
                System.out.println("You found the secret word, "+random+" !");
                System.out.println("The crowd boos as you exit the platform.");
                System.out.println("But you managed to save yourself, and the future is bright");
            }
            System.out.println("Do you want to try again ? (y/n)");
            gameReset=(new Scanner(System.in)).nextLine();
            if(gameReset.equalsIgnoreCase("n")) { 
                game=false;
            }
            defeat=false;
            victory=false;
        }
        System.out.println("Thanks for playing ! Hope you had fun !");
    }
    
}
