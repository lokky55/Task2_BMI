public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(182, 90);  // height in cm
        System.out.println("Индекс массы тела: " + bmi);
    }
}
