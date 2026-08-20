import java.util.Scanner;
class RestaurantBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Item Prices
        int cb_price = 220, cn_price = 120, mb_price = 240, cl_price = 160, ct_price = 240;
        int pt_price = 120, mc_price = 240, pp_price = 160, pbm_price = 210;
        int eb_price = 110;

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
                System.out.println("101. Chicken Biryani = " + cb_price);
                System.out.println("201. Paneer Tikka    = " + pt_price);
                System.out.println("301. Egg Bhurji      = " + eb_price);
                System.out.println("(Showing sample of ALL - Refer to categories for full list)");
                break;
            default:
                System.out.println("Invalid Category Selected.");
        }
        System.out.println("============================\n");

        int total_amount = 0;
        boolean isOrdering = true;

        // while loop perfectly replaces the need to store cart items in an array
        while (isOrdering) {
            System.out.print("Enter Item Code (or 0 to Generate Bill): ");
            int selectedItem = sc.nextInt();

            if (selectedItem == 0) {
                isOrdering = false;
                continue; // Skips the rest of the loop and goes to billing
            }

            // Using if-else ladder for item selection
            if (selectedItem == 101) {
                total_amount += cb_price;
                System.out.println("Chicken Biryani added. Subtotal: " + total_amount);
            } else if (selectedItem == 102) {
                total_amount += cn_price;
                System.out.println("Chicken Noodles added. Subtotal: " + total_amount);
            } else if (selectedItem == 103) {
                total_amount += mb_price;
                System.out.println("Mutton Biryani added. Subtotal: " + total_amount);
            } else if (selectedItem == 201) {
                total_amount += pt_price;
                System.out.println("Paneer Tikka added. Subtotal: " + total_amount);
            } else if (selectedItem == 301) {
                total_amount += eb_price;
                System.out.println("Egg Bhurji added. Subtotal: " + total_amount);
            } else {
                System.out.println("Invalid Code. Please try again.");
            }
        }

        // --- FINAL BILLING CALCULATIONS ---
        if (total_amount > 0) {
            // Implicit widening casting occurs here (int * double = double)
            double service_tax = total_amount * 0.05;
            double gst = total_amount * 0.18; // Corrected from 0.018 to 0.18 for 18% GST

            double final_bill = total_amount + service_tax + gst; // Correctly summing all charges

            System.out.printf("%n========== FINAL BILL ==========%n");
            System.out.printf("Subtotal:    Rs %10d%n", total_amount);
            System.out.printf("Service Tax: Rs %10.2f%n", service_tax);
            System.out.printf("GST (18%%):   Rs %10.2f%n", gst);
            System.out.println("--------------------------------");
            System.out.printf("Total Due:   Rs %10.2f%n", final_bill);
            System.out.println("================================");
        } else {
            System.out.println("No items were ordered.");
        }

        sc.close();
    }
}