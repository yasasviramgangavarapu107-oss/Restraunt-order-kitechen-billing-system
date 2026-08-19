import java.util.*;
class restraunt_order_kitchen_billing_system{
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        String noneveg;
        String veg;
        String eggitarian;
        String all;


        String cb = "Chicken Biryani";
        int cb_price = 220;

        String cn = "Chicken Noddels";
        int cn_price = 120;

        String mb = "Mutton Biryani";
        int mb_price = 240;

        String cl = "Chicken Lolipop";
        int cl_price = 160;

        String ct = "Chicken Tandori";
        int ct_price = 240;


        String pt = "Panner Tikka" ;
        int pt_price = 120 ;

        String mc = "Methi Chaman" ;
        int mc_price = 240 ;

        String pp = "Palak Panner" ;
        int pp_price = 160;

        String pbm = "Panner Butter Masala" ;
        int pbm_price = 210 ;


        String eb = "Egg Buji";
        int eb_price = 110 ;

        System.out.println(" 1 . nonveg");
        System.out.println(" 2 . veg");
        System.out.println(" 3 . eggitarian");
        System.out.println(" 4 . all");

        System.out.print("Enter The Type ");
        String Type = sc.nextLine();

        System.out.println("===========");

        System.out.println("   MENU   ");

        System.out.println("===========");



        switch(Type){



            case "nonveg" :

                System.out.println("Selected Nonveg ");
                System.out.println(cb + " = " + cb_price);
                System.out.println(cn + " = " + cn_price);
                System.out.println(mb + " = " + mb_price);
                System.out.println(cl + " = " + cl_price);
                System.out.println(ct + " = " + ct_price);
                break;

            case "veg" :

                System.out.println("Selected veg ");
                System.out.println(pt + " = " + pt_price);
                System.out.println(mc + " = " + mc_price);
                System.out.println(pp + " = " + pp_price);
                System.out.println(pbm + " = " + pbm_price);
                break;


            case "eggitarian" :

                System.out.println("Selected eggitarian  ");

                System.out.println(eb + " = " + eb_price);
                break;

            case "all" :
                System.out.println(eb + " = " + eb_price);
                System.out.println(cb + " = " + cb_price);
                System.out.println(cn + " = " + cn_price);
                System.out.println(mb + " = " + mb_price);
                System.out.println(cl + " = " + cl_price);
                System.out.println(ct + " = " + ct_price);
                System.out.println(pt + " = " + pt_price);
                System.out.println(mc + " = " + mc_price);
                System.out.println(pp + " = " + pp_price);
                System.out.println(pbm + " = " + pbm_price);
                 break;

            default :
                System.out.println("Wrong Type Selected");

                System.out.print("Select The Item");
                String Selected_Item = sc.nextLine();




    sc.close();

        }




    }
}
