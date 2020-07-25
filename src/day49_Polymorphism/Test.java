package day49_Polymorphism;


interface A{
    void readBook();// public abstract
    abstract void watchTC();// public
}

abstract class B implements A{

    public void readBook(){

    }
    //public abstract void watchTV();

}
public class Test {
    public void watchTV(){
        System.out.println("Watching TV");
    }
}
