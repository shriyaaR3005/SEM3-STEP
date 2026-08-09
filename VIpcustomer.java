import java.util.*;

public class Vipcustomer {
    static String validateCustomerId(String customerId) {
        if (customerId.startsWith("VIP-"))
            return "VIP Customer";
        return "Regular Customer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String customerId = sc.nextLine();

        System.out.println(validateCustomerId(customerId));
    }
}