public class BmiService {
    public float calculate(int massaKg, float heightM) {
        float index = massaKg / (heightM * heightM);
        return index;
    }
}
