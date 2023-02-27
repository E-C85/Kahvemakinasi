import java.util.Scanner;

public class main_1 {
   static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {


        //1. kahve secimi asamasi****************88

        //Kullaniciya hangi kahveyi istedigi sorulur ve kahve secenekleri yazdirilir
            menuyuyazdir();
            //Kullniciya hangi kahveyi sectigi sorulur ve alinan cevap bir degiskende tutulur
            String kahvesecim=  kahvesecimiyap();

            //kullanicinin sectigi kahveye gore konsola bilgilendirme msj yazilir

            System.out.println(kahvesecim + " hazirlaniyor");

        //yanlis tuslama  yaparsa kullniciya hangi kahveyi istedigi tekrar sorulur

        //2)sut ekleme asamasi sorusu******************************
        sutekle();
        //kullaniciya sut isteyip istemedigi sorulur
        // sut istiyor ise sut ekleniyor ,istenmiyor ise sut eklenmiyor yazilmali consola

        //3. asama seker isteme sorusu **********************************
        sekerekle();
        //Kullaniciya evet hayir sorusu sorulur,eger kullanici evet derse kac seker istedigi sorulur
        //kullanici istemez ise o zaman seker eklenmiyor consola yazilir.

        //4/boy asamasi*******************
        String boysecim=boysecimiyap();
        
        //  kulaniciya bol bilgisi yazdirili ve kullanicidan tercih alinir
        //buyuk boy ise buyuk boy hazirlaniyor
        // orta boy ise orta boy hazirlaniyor
        //kucuk boy   ise buyuk boy hazirlaniyor yazdirilir

        //sonuc asamasi *****************
        //kullniciya istedigi kahve ve boy bilgileri yazdirilir.
        System.out.println(kahvesecim+" "+boysecim+"olarak hazirlandi yeniden bekleriz");
    }

    private static String boysecimiyap() {
        System.out.println("**********8hangi boy istesiniz*********** buyuk boy,orta boy ,kucuk boy?");
        String boysecimi=sc.nextLine();
        switch (boysecimi.toLowerCase()){
            case "buyuk boy":
                System.out.println("buyuk boy hazirlaniyor");
                break;
            case "orta boy":
                System.out.println("orta boy hazirlaniyor");
                break;
            case "kucuk boy":
                System.out.println("kucuk boy hazirlaniyor");
                break;

            default:
                System.out.println("yanlis girdin");
                break;


        }
        return boysecimi;
    }


    private static void sekerekle() {
        while(true){
            System.out.println("\n***********seker eklemek istemisiniz ? Evet veya Hayir olarak yanit veriniz\n\n");
            String sekersecim=sc.nextLine();

            if(sekersecim.equalsIgnoreCase("evet")){
                System.out.println("kac seker istersiniz");
                int sekersayisi=sc.nextInt();
                sc.nextLine();
                if (sekersayisi>0){
                    System.out.println(sekersayisi+" seker ekleniyor");
                    break;
                }else {
                    System.out.println("yanli girdi yaptiniz");
                    sekerekle();
                }

            }else if
            (sekersecim.equalsIgnoreCase("evet")){
                System.out.println("\nseker eklenmiyor");

            }else{
                System.out.println("\nyanlis giris yaptiniz");
                sekerekle();
            }
        }
    }

    private static void sutekle() {
        while(true){
            System.out.println("\n***********88sut eklemek istemisiniz ? Evet veya Hayir olarak yanit veriniz\n\n");
            String sutsecim=sc.nextLine();
            if(sutsecim.equalsIgnoreCase("evet")){
                System.out.println("\nsut ekleniyor");
                break;

            }else if (sutsecim.equalsIgnoreCase("hayir")){
                System.out.println("\nsut eklenmiyor");

            }else{
                System.out.println("\nyanlis giris yaptiniz");
                sutekle();
            }
        }
    }

    private static String kahvesecimiyap() {

        while(true){
            String secim=sc.nextLine();
            if(secim.equalsIgnoreCase("Turk Kahvesi")
                    || (secim.equalsIgnoreCase("Filtrekahve"))
                    ||(secim.equalsIgnoreCase("esspresso"))){
                return secim;

            }else {
                System.out.println("yanlis secim oldu,dogru secim yap");
                menuyuyazdir();
            }
        }
    }//kullanici dogru secim yapana kadar metoddan cikamasin

    private static void menuyuyazdir() {
        System.out.println("**********Kahve Dunyasina Hosgeldiniz**********\n");
        System.out.println("Hangi Kahveyi istesiniz?");
        System.out.println("1 Turk Kahvesi");
        System.out.println("2 Filtre Kahvesi");
        System.out.println("3 esspresso ");
        System.out.println("\n***********************\n\n");
    }


}
