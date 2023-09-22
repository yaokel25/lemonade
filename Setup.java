import java.util.Scanner;

public class Setup{
    private double lemon;
    private double cup;
    private double ice;
    private double sugar;
    private double budget;

    public double Budget(){
    System.out.println("How many cups? ($0.01 each)");
    cup = scan.nextLine();
    System.out.println("How many lemons? ($0.10 each)");
    lemon = scan.nextLine();
    System.out.println("How much ice? ($0.01 each)");
    ice = scan.nextLine();
    System.out.println("How much sugar? ($0.25 each)");
    sugar = scan.nextLine();
    }

    budget = 20 - (0.01*cup) - (0.1*lemon) - (0.01*ice) - (0.25*sugar);


}