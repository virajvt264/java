public class Program {
    public static void main(String[] args) {
        // Creatiing Instance of Number Summation class
        
        NumberSummation ns = new  NumberSummation();
        System.out.printf("Total summation of Even Numbers is %d",ns.SumofSpecific(10,100, new NumberCheck().new EvenCheck()));
        System.out.printf("Total summation of Odd Numbers is %d",ns.SumofSpecific(10,100, new NumberCheck.OddCheck()));
    }
    
}
