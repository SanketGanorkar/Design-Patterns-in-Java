package Creational.Singleton;

public class Singleton {

}

class ABC{


    static ABC abc = new ABC();
    
    // Making the constructor private so that this class 
    // cannot be instantiated from outside
    private ABC(){

    }

    // Since we dont want to create object of this class from outside , we 
    // will provide a static method which will return the instance of this class
    public static ABC getInstance(){
        return abc;
    }
}
