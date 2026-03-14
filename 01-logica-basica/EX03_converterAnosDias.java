import java.util.Scanner;
public class EX03_converterAnosDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos;
        System.out.println("dijite a quantidades de anos: ");
        anos = sc.nextInt();
        int dias = anos*365;
        System.out.println(dias+ " dias em " + anos + " anos");
    }
}
