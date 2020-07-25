package day50_Polymorphism;

public class Encapsulation {

    private String username="MIT";
    //private Final String username="MIT";
    //when private variable is final we cannot generate setter we only can generate getter
    // getter ==> read
    // setter ==> write

    public String getUsername(){// getter and setter make it public so can read it
                              // getter and setter should be instance
                             // static dosent accepts instance
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

}

class Test{
    public static void main(String[] args) {

        Encapsulation obj=new Encapsulation();
        //System.out.println(obj.username);
        System.out.println(obj.getUsername());
        //obj.username="Cybertek";

        obj.setUsername("Cybertek");
        System.out.println(obj.getUsername());
    }
}
