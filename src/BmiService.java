public class BmiService {

    public double calculate(double height, double weight) {
        double formula = weight / (height * height);
        return formula;
    }
}
