import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        int n;
        int maks=0,min=0;
        System.out.println("Kac tane sayi gireceksiniz : ");
        n = data.nextInt();
        for (int i=1;i <=n;i++ ){
            System.out.print(i + ".Sayiyi giriniz :");
            int a=data.nextInt();

            if (i == 1) {
                maks=a;
                min=a;
            }
            if (a>maks){
                maks=a;
            }
            if (a<min){
                min=a;
            }
        }
        System.out.println("girdiginiz sayilar icinde en buyuk olani: "+maks);
        System.out.println("girdiginiz sayilar icinde en kucuk olani: "+min);

    }
}