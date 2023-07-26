public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massa = 98; // вес в килограммах
        float height = 1.87F; // рост в метрах
        System.out.println("Ваш вес: " + massa + " кг.");
        System.out.println("Ваш рост: " + height + " м.");

        float index = service.calculate(massa, height);
        System.out.println("Ваш bmi-индекс равен " + (int) index);
    }
}