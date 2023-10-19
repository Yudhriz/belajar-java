public class SpookyNumber {

    public static void main(String[] args) {
        int lantai = 1;

        System.out.println("Welcome to Lift");
        System.out.println("Tombol lantai 13 ditiadakan.");
        System.out.println("Untuk mengakses lantai 13, tekan tombol 14.");

        for (int i = 1; i <= 13; i++) {
            if (i == 13) {
                lantai = 14;
            }

            System.out.println("Lift melewati lantai " + i + ".");
        }

        System.out.println("Lift akan menuju lantai " + lantai + ".");
        System.out.println("Pintu lift terbuka.");
        System.out.println("Selamat datang di lantai " + lantai + ".");
        System.out.println("==========================================");
        System.out.println("Yudha Rizky Alvingky | 0110222122");

    }
}
