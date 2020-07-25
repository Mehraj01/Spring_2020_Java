package day40_Encapsulation;

public class Encapsulation {
    private long SSN;

    // getter: read only
    public long getSSN(){
        return SSN;
    }

    // setter: write only
    public  void setSSN(long SSN){
        this.SSN = SSN;
    }
}
