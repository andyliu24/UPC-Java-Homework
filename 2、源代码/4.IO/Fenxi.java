import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fenxi {
    public static double getTotalScore(String string){
        Scanner scanner=new Scanner(string);
        scanner.useDelimiter("[^0123456789.]+");
        double totalScore=0;
        while (scanner.hasNext()){
            try{
                double score=scanner.nextDouble();
                totalScore+=score;
            }
            catch (InputMismatchException exp){
                String t=scanner.next();
            }
        }
        return totalScore;
    }
}
