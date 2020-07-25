package day34_CutomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total =(width+length)*unitPrice;

        //return (isPersian)?total+200:total;

        if(isPersian){
            return total+200;
        }else{
            return total;
        }
    }

    public void CustomOrder(double CarpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian){

      width=  CarpetWidth;
      length=carpetLength;
      unitPrice=carpetUnitPrice;
      isPersian=carpetPersian;

    }


    public String toString(){
        return "width: "+width+"\nlength: "+length+"\nunit Price "+unitPrice+"\ncost of carpet "+calcCost();
    }
}
