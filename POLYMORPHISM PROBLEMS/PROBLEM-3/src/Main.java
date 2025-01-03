class Sports{
    public void Play()
    {
        System.out.println("Sports Quata can have Playing Methods...");
    }
}

class Footbal extends Sports
{
    @Override
    public void Play()
    {
        System.out.println("Footbal is the Supre playing game...");
    }
}

class Cricket extends Sports {

    @Override
    public void Play()
    {
        System.out.println("Cricket is the Supre playing game...");
    }
}

class Ruby extends Sports {

    @Override
    public void Play()
    {
        System.out.println("Ruby is the Supre playing game...");
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Sports sports = new Sports();
        Cricket cricket = new Cricket();
        Footbal footbal = new Footbal();
        Ruby ruby = new Ruby();

        sports.Play();
        cricket.Play();
        footbal.Play();
        ruby.Play();
    }
}