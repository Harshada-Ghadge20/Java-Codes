abstract class Mobile{
    abstract void camera();


    void quality(){
        System.out.println("Diffrent mobiles quality camera are diffrent");
    }
}



class Samsung extends Mobile{
    @Override
    void camera(){
        System.out.println("Samsung has good  quality ");
 
   }
   void quality(){
    System.out.println("Samsung camera quality is 70 percent");
   }
}

class Iphone extends Mobile{
    @Override

    void camera(){
        System.out.println("Iphone has highest quality");
    }
    void quality(){
        System.out.println("Iphone camera quality is 100 percent ");
    }
}


class OnePlus extends Mobile{
    @Override
    void camera(){
        System.out.println("Onplus has most good quality");
    }
    void quality(){
        System.out.println("Oneplus camera quality is 90 percent");
    }
}

public class Main{
    public static void main(String args[]){

        Samsung s1 = new Samsung();
        Iphone i1 = new Iphone();
        OnePlus o1 = new OnePlus();



        s1.camera();
        s1.quality();


        
        i1.camera();
        i1.quality();



        o1.camera();
        o1.quality();
    }
}
