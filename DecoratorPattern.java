import java.io.*;
import java.util.Scanner;

public class DecoratorPattern
{
    /**
     * Program driver to be ran as java DecoratorPattern
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // Prompt user for input file 
        Scanner inputFileScanner = new Scanner(System.in);
        System.out.println("Enter the input file name\n");
        String filename = inputFileScanner.nextLine();
        File inputFile = new File(filename);

        // Prompt user for input decorator patterns, space separted
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter desired decorator pattern\n");
        System.out.println("Options: Tee, Filter, Numbered, Bracket\n");
        String decoratorChoices = userInput.nextLine();
        String[] decoratorChoicesArray = decoratorChoices.split(" ");
        for (String s: decoratorChoicesArray)
        {
            handleChoice(s.toLowerCase());
        }

        
        Scanner reader = new Scanner(inputFile);


        // Output out = new Output();

        // Output bracketOut = new BracketOutputDecorator(new Output());
        // Output teeOut = new TeeOutputDecorator(new Output());

    }

    public static void handleChoice(String s)
    {
        // System.out.println(s+'\n');
        if (s.equals("filter")) {
            System.out.println("Choice is filter");
        }
        else if (s.equals("tee")) {
            System.out.println("Choice is tee");
        } else if (s.equals("bracket")) {
            System.out.println("Choice is bracket");
        } else if (s.equals("numbered")) {
            System.out.println("Choice is numbered");
        } 
    }
}