public class Main {
    public static void main(String[] args) {

        int num1 = 100, num2 = 200;

        int valor = buscarMax(num1, num2);
        System.out.println(valor);
    }
    public static int buscarMax(int num1, int num2){

        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}