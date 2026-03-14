import java.util.Scanner;
public class EX01_positivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dijite qualquer numero:");
        float nu = sc.nextFloat();
        if (nu > 0) {
            System.out.println("positivo!");
        } else {
            System.out.println("negativo! ou neutro se for '0'!");
        }
    }
}
