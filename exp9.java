class ReservationThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Reservation: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Reservation thread interrupted");
            }
        }
    }
}

class StatusThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Confirmation: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Status thread interrupted");
            }
        }
    }
}

public class exp9 {
    public static void main(String[] args) {

        ReservationThread r = new ReservationThread();

        StatusThread s = new StatusThread();
        Thread t = new Thread(s);

        r.start();
        t.start();
    }
}