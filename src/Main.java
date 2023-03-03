import java.util.Scanner;

public class Main {

    static int fakt(int n){
        int sonuc=1;

        for (int i =1;i<=n;i++){
            sonuc*=i;
        }
        return sonuc ;
    }

    public static void main(String[] args) {

        int sayi, secim,kombinasyon;

        Scanner oku=new Scanner(System.in);
        System.out.println("Kac sayi var : ");
        sayi=oku.nextInt();

        System.out.println("Kac secim yapilacak : ");
        secim = oku.nextInt();

        kombinasyon=fakt(sayi)/(fakt(secim)*fakt(sayi-secim));

        System.out.println("\n"+sayi+ " nin "+secim+ "lu kombinasyonu = "+kombinasyon);


    }
}