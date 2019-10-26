
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> scoreList = new ArrayList<Integer>();
        ArrayList<Integer> failed = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> four = new ArrayList<Integer>();
        ArrayList<Integer> five = new ArrayList<Integer>();

        System.out.println("Type exam scores, -1 completes: ");

        while (true) {
            int score = reader.nextInt();

            if (score > 0 && score < 61){
                 scoreList.add(score);
            }
           
            if (score <= 29 && score > 0) {
                failed.add(score);
            }
            if (score >= 30 && score <= 34) {
                one.add(score);
            }
            if (score >= 35 && score <= 39) {
                two.add(score);
            }
            if (score >= 40 && score <= 44) {
                three.add(score);
            }
            if (score >= 45 && score <= 49) {
                four.add(score);
            }
            if (score >= 50 && score <= 60) {
                five.add(score);
            }
            if (score > 60 && score < 0) {
                return;
            }
            if (score == -1) {
                break;
            }

        }
        
        System.out.println("Grade distribution: ");

        System.out.println("5: " + printStars(five));
        System.out.println("4: " + printStars(four));
        System.out.println("3: " + printStars(three));
        System.out.println("2: " + printStars(two));
        System.out.println("1: " + printStars(one));
        System.out.println("0: " + printStars(failed));
        
        System.out.println("Acceptance percentage: " + acceptPercent(scoreList, failed));

    }

    public static int intInput(Scanner scanner) {
        int intInput = scanner.nextInt();
        return intInput;

    }

    public static String printStars(ArrayList array) {
        String stars = "";
        for (int i = 0; i < array.size(); i++) {
            stars += "*";

        }
        return stars;

    }
    
    public static String acceptPercent(ArrayList array, ArrayList arrayListFailed){
        
        double sizeAll = array.size();
        double sizeFailed = arrayListFailed.size();
        double accepted = sizeAll - sizeFailed;
        
        String hej = "" +((accepted / sizeAll) *100 );
        
        
        return hej;
        
        
    }

}
