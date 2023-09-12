import java.util.Scanner;

public class NominalBhaktiAlam {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Harga Cottage tiap jenis, dan pilihlah salah satu !");
        System.out.println("Cottage     Weekday     Weekend     Holiday");

        System.out.println("Duku        Rp 915 000  Rp 1025 000 Rp 1225 000");
        System.out.println("Jeruk       Rp 915 000  Rp 1025 000 Rp 1225 000");

        System.out.println("Alpukat     Rp 575 000  Rp 695 000  Rp 895 000");
        System.out.println("Jambu Air   Rp 575 000  Rp 695 000  Rp 895 000");

        System.out.println("Durian      Rp 595 000  Rp 715 000  Rp 915 000");
        System.out.println("Melon       Rp 595 000  Rp 715 000  Rp 915 000");

        System.out.println("Belimbing   Rp 495 000  Rp 575 000  Rp 755 000");
        System.out.println("Mangga      Rp 495 000  Rp 575 000  Rp 755 000");
        System.out.println("Kedondong   Rp 495 000  Rp 575 000  Rp 755 000");

        System.out.println("Tentukan jenis Cottage yang anda pilih dan harinya !");

        int Harga = 0;
        String Cottage = x.nextLine();
        String day = x.nextLine();

        if (Cottage.equals("Duku") || Cottage.equals("Jeruk")) {
            switch (day) {
                case "Weekday":
                    Harga = 915000;
                    break;

                case "Weekend":
                    Harga = 1025000;
                    break;

                case "Holiday":
                    Harga = 1225000;
                    break;

                default:
                    Harga = 0;
            }
        } else if (Cottage.equals("Alpukat") || Cottage.equals("Jambu Air")) {
            switch (day) {
                case "Weekday":
                    Harga = 575000;
                    break;

                case "Weekend":
                    Harga = 695000;
                    break;

                case "Holiday":
                    Harga = 895000;
                    break;

                default:
                    Harga = 0;
            }
        } else if (Cottage.equals("Durian") || Cottage.equals("Melon")) {
            switch (day) {
                case "Weekday":
                    Harga = 595000;
                    break;

                case "Weekend":
                    Harga = 715000;
                    break;

                case "Holiday":
                    Harga = 915000;
                    break;

                default:
                    Harga = 0;
            }
        } else if (Cottage.equals("Belimbing") || Cottage.equals("Mangga") || Cottage.equals("Kedondong")) {
            switch (day) {
                case "Weekday":
                    Harga = 495000;
                    break;

                case "Weekend":
                    Harga = 575000;
                    break;

                case "Holiday":
                    Harga = 755000;
                    break;
            }
        } else {
            System.out.println("Maaf Tidak Valid !");
        }

        System.out.println("Jenis Cottage yang anda pilih " + Cottage);
        System.out.println("Hari yang dipilih " + day);
        System.out.println("Total Biaya " + Harga);
    }
}
