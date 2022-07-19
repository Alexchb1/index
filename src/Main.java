public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.86;
        double weight = 80.2;
        double imt = service.calculate(height, weight);
        System.out.println("Индекс тела: " + imt);
    }
}
