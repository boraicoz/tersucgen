import java.util.Scanner;
public class TersUcgen {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int basSayi;
        System.out.print("Basamak Sayisini Giriniz:");
        basSayi=in.nextInt();

        for (int i=basSayi;i>=1;i--)
        {
            for(int k=1;k<=basSayi-i+1;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=2*i-1;l++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
