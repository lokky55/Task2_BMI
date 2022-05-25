public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(182, 140);  // height in cm
        System.out.println("Индекс массы тела: ");
        System.out.printf("%.0f", bmi);
    }
}
