public class BmiService {
    public float calculate(float height, float weight) {
        float heightMetres = height / 100;
        float bmi = weight / (heightMetres * heightMetres);
        return bmi;
    }
}
