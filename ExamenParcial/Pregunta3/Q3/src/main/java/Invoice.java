import java.math.BigDecimal;

public class Invoice {
    private final double value;
    private final String country;
    private final CustomerType customerType;
    public Invoice(double value, String country, CustomerType customerType) {
        this.value = value;
        this.country = country;
        this.customerType = customerType;
    }
    public double calculate() {
        double ratio = 0.1;
        return value * ratio;
    }
    public String Country(){
        return this.country;
    }
    public double Value(){
        return this.value;
    }
    public CustomerType customerType(){
        return this.customerType;
    }
}