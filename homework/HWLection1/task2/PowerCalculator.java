package task2;

public class PowerCalculator {
    private Double number;
    private Double power;
    private Long number1;
    private  Long power1;

    public PowerCalculator(Double number, Double power) {
        this.number = number;
        this.power = power;
    }

    public PowerCalculator(Long number, Long power) {
        this.number1 = number;
        this.power1 = power;
    }

    public Double degreeDouble(Double a, Double n){
        return Math.pow(a, n);
    }

}
