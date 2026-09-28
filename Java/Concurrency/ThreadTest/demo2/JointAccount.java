public class JointAccount {
    
    private long balance;

    public long balance() {
        return balance;
    }

    public boolean withdraw(long amount) {
        boolean success = false;
        //to execute a synchronized block a thread must
        //acquire ownership of the monitor associated
        //with the this object
        synchronized(this){
            if(balance >= amount){
                balance = work(balance, amount, -1);
                success = true;
            }
        }//the thread that owns the monitor of this object releases it
        return success;
    }

    public synchronized void deposit(long amount) {
        balance = work(balance, amount, 1);
    }

    private static long work(long bal, long amt, int sgn) {
        try{
            Thread.sleep(amt / 100);
        }catch(InterruptedException e){}
        return bal + amt * sgn;
    }
}
