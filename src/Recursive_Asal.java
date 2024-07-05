import java.util.Scanner;

public class Recursive_Asal {
    //Reküsif olsun istiyoruz.Asal sayı kendinden önceki sayının tam katı olamaz.
    static boolean asal(int num,int yari) {
        boolean isPrime=true;
        if (yari == 0) {
            //num=1 olur ve asal  değil
            isPrime=false;
        }else if(yari==1)    {
            //num=2 olur ve asaldır
        } else {
            if (num % yari == 0) {
                //num 1 den farklı bir sayının tam katı yani asal değil
                isPrime=false;
                //(bir sayı yarısı veya yarısından küçük sayıların katı olabilir)
            } else {
                //num tek sayı.Asal mı diye kontrol etmeye devam etmeliyiz
                if(asal(num, yari - 1)){
                }else {
                    isPrime=false;
                }
            }
        }
        return isPrime;
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı: ");
        int num= input.nextInt();

        if (asal(num,num/2)==true){
            System.out.println("Asal");
        }else {
            System.out.println("Asal değil");
        }


    }
}
