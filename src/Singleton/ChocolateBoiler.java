package Singleton;

/**
 * Chocolate boiler controller class
 */
public class ChocolateBoiler {
    private static ChocolateBoiler boiler;
    private boolean empty;
    private boolean boiled;

    public static synchronized ChocolateBoiler getBoiler(){
        if(boiler == null){
            boiler = new ChocolateBoiler();
        }
        return boiler;
    }


    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("Boiler is filled with cool chocolate.");
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("Boiler is boiling the chocolate.");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            boiled = false;
            System.out.println("Draining the boiler.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
