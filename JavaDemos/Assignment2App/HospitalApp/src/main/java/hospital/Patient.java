package hospital;

public class Patient {
    private int id;
    private int bedType;
    private int days;
    private static int count = 0;

    public Patient(int bedType, int days) {
        this.bedType = bedType;
        this.days = days;
        this.id = ++count;
    }

    public Patient() {
        this(3, 3);
    }

    public int getId() {
        return id;
    }

    public int getBedType() {
        return bedType;
    }

    public void setBedType(int bedType) {
        this.bedType = bedType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static int getCount() {
        return count;
    }

    public double getPricePerDay(){
        switch (bedType){
            case 1:
                return 500;
            case 2: 
                return 350;
            case 3:
                return 200;
            default:
                return 250;
        }
    }    

    public double getBill(){
        return getPricePerDay() * days;
    }    
  
    
}
