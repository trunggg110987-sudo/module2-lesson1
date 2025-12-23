import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 25000;
        double usd;
        System.out.println("nhap so tien USD :");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();

        double quydoi = usd * vnd;
        System.out.println("so tien VND : " + quydoi);
    }
}
