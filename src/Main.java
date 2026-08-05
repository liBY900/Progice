import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your weight loss: ");
        double weight = scanner.nextDouble();

        WeightLossModel model = new WeightLossModel();
        model.CustomerName = name;
        model.WeightLoss = weight;

        PrintWeightLoss print = new PrintWeightLoss(model);
        print.Print();
    }
}