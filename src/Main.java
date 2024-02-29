    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir tam sayı giriniz: ");
            int tamSayi = scanner.nextInt();

            System.out.print("Bir ondalıklı sayı giriniz: ");
            double ondalikliSayi = scanner.nextDouble();

            System.out.println("Tam sayının ondalıklı dönüşümü: " + (double) tamSayi);

            int tamSayiyaDonusum = (int) ondalikliSayi;
            System.out.println("Ondalıklı sayının tam sayıya dönüşümü: " + tamSayiyaDonusum);

            scanner.close();
        }
    }
