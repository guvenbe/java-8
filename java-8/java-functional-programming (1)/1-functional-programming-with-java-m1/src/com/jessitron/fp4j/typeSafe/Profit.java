

public class Profit implements com.jessitron.fp4j6.QuantityOfInterest {
    private final com.jessitron.fp4j6.Sales sales;
    private final com.jessitron.fp4j6.IncrementalCosts incrementalCosts;
    private final FixedCosts fixedCosts;

    public Profit(Sales s, IncrementalCosts ic, FixedCosts fc) {
        this.sales = s;
        this.incrementalCosts = ic;
        this.fixedCosts = fc;
    }

    public String getName() {
        return "Profit!!";
    }

    public double valueAt(int time) {
        return sales.valueAt(time) -
                (incrementalCosts.valueAt(time) +
                fixedCosts.valueAt(time));
    }

}
