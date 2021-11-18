public class mainClass {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        mainClass mainClass = new mainClass();

        System.out.println(mainClass.int_sum(x,y));
        System.out.println(mainClass.double_sum(x,y));

    }

    public int int_sum(int number1, int number2) {
        return number1 + number2;
    }

    public double double_sum(double number1, double number2)
    {
        return number1 + number2;
    }


}
