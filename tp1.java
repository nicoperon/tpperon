package fr.peron.tp1;

//Package à importer afin d'utiliser l'objet File, et Scanner

        import java.io.File;
        import java.util.Scanner;



public class tp1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le nom de votre fichier:");
        File f = new File(sc.nextLine());
        //L'utilisateur entre le nom de son fichier


        System.out.println("Chemin du fichier : " + f.getAbsolutePath());
        //
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Il existe ? " + f.exists());
        System.out.println("C'est un répertoire ? " + f.isDirectory());
        System.out.println("C'est un fichier ? " + f.isFile());

        // Le fichier entrée par l'utilisateur est analysé par les méthodes suivante



    }
}