package hospital;

public class InHousePatient extends Patient{

    private float discount = 10;

    public InHousePatient(int bedType, int days, float discount) {
        super(bedType, days);
        this.discount = discount;
    }

    public InHousePatient() {
        this(3, 3, 10);
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public double getBill() {
            //System.out.printf("%d", discount);
            return super.getBill() * ( 1 - discount/ 100.0);
    }
   
    
}
