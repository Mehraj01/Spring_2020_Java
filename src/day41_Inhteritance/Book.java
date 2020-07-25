package day41_Inhteritance;

public class Book { // Parent class

    public String title;
    public String author;
    double price;

    public String toString(){
        return "Title "+title+", Author "+author+", $"+price;
    }

}
//********************************************************************************************************************

class Ebook extends Book{// inherited variables title, author, price
    /*
    title-(Inherited)
    author-(Inherited)
    price-(Inherited)
    toString()-(Inherited)

    size
    pages
    readbook
    toString()-(Inherited)
     */


   public  String size;
   public int pages;

   public void readbook(){

       System.out.println("Reading "+title);

   }

}

class AudioBook extends Book{ // child class

    /*
    title-(Inherited)
    author-(Inherited)
    price-(Inherited)


    length
    listen()

    toString()-(Inherited)

     */

    public String length;


    public void listen(){
        System.out.println("Listening to "+title);
    }

}

class BookObjects{
    public static void main(String[] args) {


        Ebook book1=new Ebook();
        book1.title="Hamlet";
        book1.author="Shakespeare";
        book1.price=20;

        book1.size="1.5MB";
        book1.pages=432;

        System.out.println(book1);
        System.out.println("Size: "+book1.size);
        System.out.println("Pages: "+book1.pages);

        book1.readbook();


        System.out.println("===========================");

        AudioBook book2=new AudioBook();
        System.out.println(book2);
        book2.title="Becoming";
        book2.author="Michelle Obama";
        book2.price=30;
        book2.length="19 hours and 3 minutes";
        System.out.println(book2);
        System.out.println("Length of the audio book: \""+book2.title+"\" is "+book2.length);
    }
}
