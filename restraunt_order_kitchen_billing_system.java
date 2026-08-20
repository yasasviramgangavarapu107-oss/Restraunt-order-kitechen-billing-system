import java.util.Scanner;
class RestaurantBillingSystem {
      void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cb_price = 220.00, cn_price = 120.00, mb_price = 240.00, cl_price = 160.00, ct_price = 240.00;
        double pt_price = 120.00, mc_price = 240.00, pp_price = 160.00, pbm_price = 210.00;
        double eb_price = 110.00;

        System.out.println("=== MENU CATEGORIES ===");
        System.out.println("1. Non-Veg");
        System.out.println("2. Veg");
        System.out.println("3. Eggitarian");
        System.out.println("4. All");

        System.out.print("Enter The Type (1-4): ");
        int type = sc.nextInt();

        System.out.println("=======================");
        System.out.println("          MENU         ");
        System.out.println("=======================");

        int selectedItem ;
        switch (type) {
            case 1:
                System.out.println("101. Chicken Biryani = " + cb_price);
                System.out.println("102. Chicken Noodles = " + cn_price);
                System.out.println("103. Mutton Biryani  = " + mb_price);
                System.out.println("104. Chicken Lolipop = " + cl_price);
                System.out.println("105. Chicken Tandori = " + ct_price);
                break;
            case 2:
                System.out.println("201. Paneer Tikka         = " + pt_price);
                System.out.println("202. Methi Chaman         = " + mc_price);
                System.out.println("203. Palak Paneer         = " + pp_price);
                System.out.println("204. Paneer Butter Masala = " + pbm_price);
                break;
            case 3:
                System.out.println("301. Egg Bhurji = " + eb_price);
                break;
            case 4:
                System.out.println("301. Egg Bhurji = " + eb_price);
                System.out.println("101. Chicken Biryani = " + cb_price);
                System.out.println("102. Chicken Noodles = " + cn_price);
                System.out.println("103. Mutton Biryani  = " + mb_price);
                System.out.println("104. Chicken Lolipop = " + cl_price);
                System.out.println("105. Chicken Tandori = " + ct_price);
                System.out.println("201. Paneer Tikka         = " + pt_price);
                System.out.println("202. Methi Chaman         = " + mc_price);
                System.out.println("203. Palak Paneer         = " + pp_price);
                System.out.println("204. Paneer Butter Masala = " + pbm_price);
                break;

            default:
                System.out.println("Wrong Type Selected");
        }
        System.out.println("============================\n");

        double total_amount = 0;
        boolean Ordering = true;
        int cb_qty = 0, cn_qty = 0, mb_qty = 0, cl_qty = 0, ct_qty = 0;
        int pt_qty = 0, mc_qty = 0, pp_qty = 0, pbm_qty = 0, eb_qty = 0;

        while (Ordering) {
            System.out.print("Enter Item Code (or 0 to Generate Bill): ");
            selectedItem = sc.nextInt();

            if (selectedItem == 0) {
                Ordering = false;
                continue;
            }

            System.out.print("Enter the quantity: ");
            int qty = sc.nextInt();
            if (selectedItem == 101) {
                cb_qty += qty;
                total_amount += (cb_price * qty);
                System.out.println(qty+ " x Chicken Biryani added. Subtotal: " + total_amount);
            } else if (selectedItem == 102) {
                cn_qty += qty;
                total_amount += (cn_price * qty);
                System.out.println(qty+ " x Chicken Noodles added. Subtotal: " + total_amount);
            } else if (selectedItem == 103) {
                mb_qty += qty;
                total_amount += (mb_price * qty);
                System.out.println(qty+ " x Mutton Biryani added. Subtotal: " + total_amount);
            } else if (selectedItem == 104) {
                cl_qty += qty;
                total_amount += (cl_price * qty);
                System.out.println(qty+ " x Chicken Lolipop added. Subtotal: " + total_amount);
            } else if (selectedItem == 105) {
                ct_qty += qty;
                total_amount += (ct_price * qty);
                System.out.println(qty+ " x Chicken Tandori added. Subtotal: " + total_amount);
            } else if (selectedItem == 201) {
                pt_qty += qty;
                total_amount += (pt_price * qty);
                System.out.println(qty+ " x Paneer Tikka added. Subtotal: " + total_amount);
            } else if (selectedItem == 202) {
                mc_qty += qty;
                total_amount += (mc_price * qty);
                System.out.println(qty+ " x Methi Chaman added. Subtotal: " + total_amount);
            } else if (selectedItem == 203) {
                pp_qty += qty;
                total_amount += (pp_price * qty);
                System.out.println(qty+ " x Palak Paneer added. Subtotal: " + total_amount);
            } else if (selectedItem == 204) {
                pbm_qty += qty;
                total_amount += (pbm_price * qty);
                System.out.println(qty+ " x Paneer Butter Masala added. Subtotal: " + total_amount);
            } else if (selectedItem == 301) {
                eb_qty += qty;
                total_amount += (eb_price * qty);
                System.out.println(qty+ " x Egg Bhurji added. Subtotal: " + total_amount);
            } else {
                System.out.println("Invalid Code. Please try again.");
            }
        }
        if (total_amount > 0) {
            double service_tax = total_amount * 0.05;
            double gst = (total_amount * 0.18);
            System.out.println("=============== FINAL BILL ===============");
            System.out.println("item              qty        price     final price");
            if (cb_qty > 0) {
                System.out.println("Chicken Biryani    " + cb_qty + "         " + cb_price + "         " + (cb_qty * cb_price));
            }
            if (cn_qty > 0) {
                System.out.println("Chicken Noodles    " + cn_qty + "         " + cn_price + "         " + (cn_qty * cn_price));
            }
            if (mb_qty > 0) {
                System.out.println("Mutton Biryani    " + mb_qty + "         " + mb_price + "         " + (mb_qty * mb_price));
            }
            if (cl_qty > 0) {
                System.out.println("Chicken Lolipop    " + cl_qty + "         " + cl_price + "         " + (cl_qty * cl_price));
            }
            if (ct_qty > 0) {
                System.out.println("Chicken Tandori    " + ct_qty + "         " + ct_price + "         " + (ct_qty * ct_price));
            }
            if (pt_qty > 0) {
                System.out.println("Paneer Tikka    " + pt_qty + "         " + pt_price + "         " + (pt_qty * pt_price));
            }
            if (mc_qty > 0) {
                System.out.println("Methi Chaman    " + mc_qty + "         " + mc_price + "         " + (mc_qty * mc_price));
            }
            if (pp_qty > 0) {
                System.out.println("Palak Paneer    " + pp_qty + "         " + pp_price + "         " + (pp_qty * pp_price));
            }
            if (pbm_qty > 0) {
                System.out.println("Paneer Butter Masala  " + pbm_qty + "       " + pbm_price + "         " + (pbm_qty * pbm_price));
            }
            if (eb_qty > 0) {
                System.out.println("Egg Bhurji    " + eb_qty + "      " + eb_price + "         " + (eb_qty * eb_price));
            }
            double final_ammount = total_amount + service_tax + gst ;
            System.out.println("--------------------------------");
            System.out.printf("Subtotal:         %.2f%n" , total_amount);
            System.out.printf("Service Tax:     %.2f%n" ,  service_tax);
            System.out.printf("GST (18%%):       %.2f%n" , gst);
            System.out.println("--------------------------------");
            System.out.printf("Total Due:   Rs   %.2f%n" , final_ammount);
            System.out.println("================================");
        } else {
            System.out.println("No items were ordered.");
        }
        sc.close();
    }
}