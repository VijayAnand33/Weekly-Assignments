package week4;

public class Asset {
    String name;
    double returnRate;
    double volatility;

    public Asset(String name, double returnRate, double volatility) {
        this.name = name;
        this.returnRate = returnRate;
        this.volatility = volatility;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public double getVolatility() {
        return volatility;
    }

    @Override
    public String toString() {
        return name + ":" + returnRate + "%";
    }
}