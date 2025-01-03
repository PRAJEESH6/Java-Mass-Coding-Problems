

class Spacecraft implements Flyble{


    @Override
    public void Fly_Obj() {
        System.out.println("SPACECRAFT IS FLYING...");
    }
}

class Airplane implements Flyble{

    @Override
    public void Fly_Obj() {
        System.out.println("Airplane IS FLYING...");
    }
}

class Helicopter implements Flyble{

    @Override
    public void Fly_Obj() {
        System.out.println("Helicopter IS FLYING...");
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        spacecraft.Fly_Obj();
        airplane.Fly_Obj();
        helicopter.Fly_Obj();

    }
}