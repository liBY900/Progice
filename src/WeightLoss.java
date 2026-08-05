public abstract class WeightLoss implements IWeightLoss {

    protected String customerName;
    protected double weightLoss;

    public WeightLoss(WeightLossModel model) {
        this.customerName = model.CustomerName;
        this.weightLoss = model.WeightLoss;
    }

    @Override
    public String GetCustomerName() {
        return customerName;
    }

    @Override
    public double GetWeightLoss() {
        return weightLoss;
    }
}