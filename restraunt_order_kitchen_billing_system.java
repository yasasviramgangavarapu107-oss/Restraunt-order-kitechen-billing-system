import java.util.*;
class restraunt_order_kitchen_billing_system{
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        String noneveg;
        String veg;
        String eggitarian;
        String all;


        String a = "Chicken Biryani";
        int CB = 220;

        String b = "Chicken Noddels";
        int CN = 120;

        String c = "Mutton Biryani";
        int MB = 240;

        String d = "Chicken Lolipop";
        int CL = 160;

        String e = "Chicken Tandori";
        int CT = 240;


        String f = "Panner Tikka" ;
        int PT = 120 ;

        String g = "Methi Chaman" ;
        int MC = 240 ;

        String h = "Palak Panner" ;
        int PP = 160;

        String i = "Panner Butter Masala" ;
        int PBM = 210 ;


        String j = "Egg Buji";
        int EB = 110 ;

        System.out.println(" 1 . nonveg");
        System.out.println(" 2 . veg");
        System.out.println(" 3 . eggitarian");
        System.out.println(" 1 . all");

        System.out.print("Enter The Type ");
        String Type = sc.nextLine();

        System.out.println("===========");

        System.out.println("   MENU   ");

        System.out.println("===========");



        switch(Type){



            case "nonveg" :

                System.out.println("Selected Nonveg ");
                System.out.println(a + " = " + CB);
                System.out.println(b + " = " + CN);
                System.out.println(c + " = " + MB);
                System.out.println(d + " = " + CL);
                System.out.println(e + " = " + CT);

            case "veg" :

                System.out.println("Selected veg ");
                System.out.println(f + " = " + PT);
                System.out.println(g + " = " + MC);
                System.out.println(h + " = " + PP);
                System.out.println(i + " = " + PBM);


            case "eggitarian" :

                System.out.println("Selected eggitarian  ");

                System.out.println(j + " = " + EB);


            case "all" :
                System.out.println(j + " = " + EB);
                System.out.println(a + " = " + CB);
                System.out.println(b + " = " + CN);
                System.out.println(c + " = " + MB);
                System.out.println(d + " = " + CL);
                System.out.println(e + " = " + CT);
                System.out.println(f + " = " + PT);
                System.out.println(g + " = " + MC);
                System.out.println(h + " = " + PP);
                System.out.println(i + " = " + PBM);


        }



    }
}
