import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Zavod z = new Zavod();

        boolean x = true;
        AtomicInteger a1 = new AtomicInteger();
        AtomicInteger a2 = new AtomicInteger();
        AtomicInteger a3 = new AtomicInteger();
        AtomicInteger a4 = new AtomicInteger();
        AtomicInteger a5 = new AtomicInteger();

        Thread a = new Thread(()->{
            Auto auto = new Auto("1");
            auto.run();
            a1.set(auto.getPocetKol());

        });

        Thread b = new Thread(()->{
            Auto auto = new Auto("2");
            auto.run();
            a2.set(auto.getPocetKol());
        });

        Thread c = new Thread(()->{
            Auto auto = new Auto("3");
            auto.run();
            a3.set(auto.getPocetKol());
        });

        Thread d = new Thread(()->{
            Auto auto = new Auto("4");
            auto.run();
            a4.set(auto.getPocetKol());

        });

        Thread e = new Thread(()->{
            Auto auto = new Auto("5");
            auto.run();
            a5.set(auto.getPocetKol());

        });

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();





        try {
            a.join();
            b.join();
            c.join();
            d.join();
            e.join();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }


        System.out.println("\n\nZávod skončil! Celkový počet ujetých kol: " + z.getPocetKol());

//        if (a1.get() > a2.get() && a1.get() > a3.get() && a1.get() > a4.get() && a1.get() > a5.get()) {
//            System.out.println("Auto 1 je první");
//        }
//        else if (a2.get() > a1.get() && a2.get() > a3.get() && a2.get() > a4.get() && a2.get() > a5.get()) {
//            System.out.println("Auto 2 je první");
//        }
//        else if (a3.get() > a1.get() && a3.get() > a2.get() && a3.get() > a4.get() && a3.get() > a5.get()) {
//            System.out.println("Auto 3 je první");
//        }
//        else if (a4.get() > a1.get() && a4.get() > a2.get() && a4.get() > a3.get() && a4.get() > a5.get()) {
//            System.out.println("Auto 4 je první");
//        }
//        else if (a5.get() > a1.get() && a5.get() > a2.get() && a5.get() > a3.get() && a5.get() > a4.get()) {
//            System.out.println("Auto 5 je první");
//        }

    }
}