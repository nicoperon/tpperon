package fr.peron.tp;

// Ecrire un programme en Java permettant d’écrire dans un fichier tout ce que vous taperez dans le scanner, ligne par ligne. Le mot clé pour quitter sera ‘quit’

import java.io.*;
import java.util.Scanner;

public class tp4 {

    static File file = new File("/Users/nicolas/Desktop/file.txt");

    public static void main(String[] args){

        String s = ""; // saisie de l'utilisateur
        Scanner scan = new Scanner(System.in);

        while(!s.equals("quit")){   //Boucle while tant que "quit" n'est pas écrit
            System.out.println("Saisir la phrase à copier dans le fichier file.txt");
            s = scan.nextLine();    //Copie de la saisie

            if(!s.equals("quit")){   //si non quit, on écrit dans le fichier

                // Création d'un nouveau fichier avec ré-écriture par dessus
                try(FileWriter writer = new FileWriter(file,true);) {
                    s = s + "\n";
                    writer.write(s);
                }
                catch(FileNotFoundException e){
                    e.printStackTrace();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}