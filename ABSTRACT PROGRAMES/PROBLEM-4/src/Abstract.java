
abstract class Abstract {

    public abstract void StartEngine();
    public abstract void StopEngine();
}

class Car extends Abstract{

    @Override
    public void StartEngine() {

        System.out.println("TESLA Car Engine Started.... ");
    }

    @Override
    public void StopEngine() {

        System.out.println("ROLS ROYALs Car Engine Started.... ");
    }

    public void Motors()
    {
        System.out.println("TATA Motors.... ");
    }
}

class MotorCycle extends Abstract{

    @Override
    public void StartEngine() {

        System.out.println("BMW BIKE Engine Started.... ");
    }

    @Override
    public void StopEngine() {

        System.out.println("APACHI BIKE Engine Started.... ");
    }

    public void Tier()
    {
        System.out.println("MRF Tiers.... ");
    }
}
