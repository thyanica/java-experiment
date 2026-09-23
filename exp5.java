class Payment {

    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made.");
    }

    void makePayment(double amount, String method) {
        System.out.println("Payment of Rs." + amount + " made using " + method);
    }

    void makePayment(String cardNumber, double amount) {
        System.out.println("Card payment of Rs." + amount + " made.");
    }
}

class UPIPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("UPI payment of Rs." + amount + " made successfully.");
    }
}

class exp5 {
    public static void main(String[] args) {

        Payment payment = new Payment();

        System.out.println("--- Method Overloading ---");
        payment.makePayment(1000);
        payment.makePayment(1500, "Credit Card");
        payment.makePayment("1234567890", 2000);

        System.out.println("\n--- Method Overriding ---");

        Payment upi = new UPIPayment();
        upi.makePayment(2500);
    }
}