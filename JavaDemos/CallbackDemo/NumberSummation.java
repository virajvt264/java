public class NumberSummation {
    // Third parameter refers to Interface Object 
    // which may refer to instance of any class implementing 
    // Interest interface
    // Allows to call implemented check() method through 
    // Callback Mechanism
    
    public int SumofSpecific(int l, int h, Interest chk){
        int total = 0;
        for (int i = l; i <= h; i++){
            if (chk.Check(i))
                total = total + i;
        }
        return total;
    }    
}
