package recursivesum;

import java.util.ArrayList;
import java.util.List;

public class Question {

    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(100));
        payments.add(new Payment(50));
        payments.add(new Payment(1));
        payments.add(new Payment(2));

        System.out.println(sum(payments));

    }

    private static int sum(List<Payment> payments) {
        if (payments.size()==0) {
            return 0;
        }
        return payments.remove(0).getAmount() + sum(payments);
    }
}
