import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int value = scanner.nextInt(); // Kullanıcıdan veriyi aldım

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0}; // diziyi oluşturdum
        Arrays.sort(arr); // Diziyi küçükten büyüğe doğru sıraladım

        int closestmin = arr[0]; // hali hazırda küçükten büyüğe sıraladığım dizideki en küçük ve en
        int closestmax = arr[arr.length-1]; // büyük değerleri bildiğim için onları atadım

        for (int i : arr) { // elemanlarda geziniyoruz ve aşağıdaki hesaplamalar çalışıyor
            if (i < value && i > closestmin) { // i valuemizden küçükse ve en son baktığı i den büyükse yeni min oluyor
                closestmin = i;
            }
            if (i > value && i < closestmax) {// i valuemizden büyükse  ve en son baktığı i den küçükse yeni max oluyor
                closestmax = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestmin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestmax);
    }
}