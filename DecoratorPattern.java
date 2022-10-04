import java.io.File;
import java.util.Scanner;

public class DecoratorPattern
{
    public static void main(String[] args)
    {
        Output out = new Output();

        Output bracketOut = new BracketOutputDecorator(new Output());
        Output teeOut = new TeeOutputDecorator(new Output());

    }
}