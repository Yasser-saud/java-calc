public class Calc {
    private static final String result = "✅ Results: ";

    public void sum (float a, float b){
        float res = a+b;
        System.out.println(result + res);
    }

    public void subtract(float a, float b){
        float res = a - b;
        System.out.println(result + res);
    }

    public void multiply (float a, float b){
        float res = a * b;
        System.out.println(result + res);

    }

    public void divide (float a, float b){
        float res = a / b;
        System.out.println(result + res );
    }
}
