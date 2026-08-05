public class PrintWeightLoss  extends WeightLoss{

    public  PrintWeightLoss(WeightLossModel model){
        super(model);
    }

    public void Print(){
        System.out.println("*************************************");
        System.out.println("     CUSTOMER WEIGHTLOSS PRINTOUT    ");
        System.out.println("*************************************");
        System.out.println("CUSTOMER NAME : " + GetCustomerName());
        System.out.println("WEIGHT LOSS   : " + GetWeightLoss() + "kg");
        System.out.println("*************************************");
    }
}
