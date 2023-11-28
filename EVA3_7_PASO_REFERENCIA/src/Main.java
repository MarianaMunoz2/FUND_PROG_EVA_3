public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println("Valor de array en main: " + array);
        llenarArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");

        }
    }
    private static void llenarArray(int[] valores){
        System.out.println("Valor de array en llenarArray: " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);

        }
    }
}