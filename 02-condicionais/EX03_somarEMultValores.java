import java.util.Scanner;

public class EX03_somarEMultValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C;
        System.out.println("dijite um numero: ");
        int A = sc.nextInt();
        System.out.println("dijite um numero: ");
        int B = sc.nextInt();
        if (A == B) {
            C = A+B;
            System.out.println(C);
        } else {
            C = A*B;
            System.out.println(C);
        }
    }
    
}