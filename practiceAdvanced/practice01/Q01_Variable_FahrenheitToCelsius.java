package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9


            Scanner input = new Scanner(System.in);
            System.out.println("Fahrenheit değeri giriniz.");

            double f = input.nextDouble();
            double c = (f-32)*5/9;
            System.out.println(c);

            NumberFormat numberFormat = new DecimalFormat("#0.00");
            String formattedC = numberFormat.format(c);
            System.out.println("formattedC = " + formattedC+1);//Concatenation
            double doubleC =  Double.valueOf(formattedC);
            System.out.println("doubleC = " + (doubleC+1));//Matematik İşlemi (+)

            //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
            String str = "!s";
            System.out.println(str.matches(".s"));//true ==> herhangi bir karakter ile başlayıp 's' harfi ile bitiyor.
            //matches() methodu regex ile çalışıp String değerin regex ile karşılaştırmasını yapar.
            System.out.println(str.matches("..s"));//false ==> 3 karakterli olamadığı için

            //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
            System.out.println("&shgfh".matches(".s.*"));//true ==> ilk karakter herhangi biri, ikinci karakter 's'
            //  .* ==> esnek sayıda karalter(0 yada daha fazla)
            System.out.println("&shgfh".matches(".r.*"));//false ==> ikinci karakter uyuşmuyor.

























    }
}
