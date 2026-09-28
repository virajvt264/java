public class NumberCheck {
    // Inner class
    // To create an object of inner class 
    // We also need to create object of outer class
    // new Outer().new Inner()
    class EvenCheck implements Interest {

        @Override
        public boolean Check(int num) {
           if (num % 2 == 0)
             return true;
           else
             return false;
        }
        
    }
    // Inner Nested class
    // To create an object of Nested class 
    // We do not need to create object of outer class
    // new Outer.Inner()

    static class OddCheck implements Interest {

        @Override
        public boolean Check(int num) {
           if (num % 2 != 0)
             return true;
           else
             return false;
        }
        
    }
    
}
