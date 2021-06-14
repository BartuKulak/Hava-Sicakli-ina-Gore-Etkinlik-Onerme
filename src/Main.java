import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklık Değerini Giriniz:");
        sicaklik = input.nextInt();
        if (sicaklik < 5)
            System.out.println("Kayak Yapabilirsiniz");
        if (sicaklik >= 5 && sicaklik < 10)
            System.out.println("Sinemaya Gidebilirsiniz");
        if (sicaklik >= 10 && sicaklik <= 15)
            System.out.println("Sinemaya veya Pikniğe Gidebilirsiniz");
        if (sicaklik > 15 && sicaklik <= 25)
            System.out.println("Pikniğe Gidebilirsiniz");
        if (sicaklik>25)
            System.out.println("Yüzmeye Gidebilirsiniz");

    }
}