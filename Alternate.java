public class Alternate {
    
    void hii(){
        System.out.println(
            "hiii function is running in base class "
        );
    }

}

class B extends Alternate{
    public static void main(String[] args) {
        System.out.println("This is just psvm");
        Alternate a =new Alternate();
        System.out.println("This is parent class");
    a.hii();
    }


}