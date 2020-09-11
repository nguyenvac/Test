class Toyota implements Runnable {
    public void run () {
        for(int i = 1; i<= 20; i++) {
            System.out.println("100");
            try {
                Thread.sleep(0);
            } catch (Exception e) {
                //TODO: handle exception
            }
          }
    }
}

class BMW implements Runnable {
    public void run () {
        for(int i = 1; i<= 20; i++) {
            System.out.println("200");
            try {
                Thread.sleep(0);
            } catch (Exception e) {
                //TODO: handle exception
            }
          }
    }
}

public class Car2 {
    public static void main(String[] args) {
        Runnable ob1 = new Toyota();
        Runnable ob2 = new BMW(); 
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
    }
}
