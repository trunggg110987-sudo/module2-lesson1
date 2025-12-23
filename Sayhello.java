import java.util.Scanner;

public class Sayhello {
    public static void main(String[] args) {
        System.out.println("nhap ten cua ban");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("xin chao " + name);
    }
}
