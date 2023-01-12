public class App {
    public static void main(String[] args) throws Exception {
        int x = 10;

        System.out.println("Tabela de multiplicação do " + x);

        for(int i = 1; i <= x; i++){
            System.out.println(x + "*" + i + "=" + x*i);
        }
    }
}
