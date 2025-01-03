import java.sql.Struct;
import java.util.Scanner;

class family
{

    public void sound()
    {
        System.out.println("THIS FAMILY MEMBERS HAVE GOOD DEMEANOUR QUALITIES...");
    }
}

class Bird extends family
{
    private String fbird;

    public Bird(String fbird) {
        this.fbird = fbird;
    }

    @Override
    public void sound()
    {
        System.out.println("THIS IS YOUR FAV BIRDS "+fbird +"...");
    }
}

class Cat extends family
{
    private String fcat;

    public Cat(String fcat)
    {
      this.fcat = fcat;
    }

    @Override
    public void sound()
    {
        System.out.println("THIS IS YOUR FAV CAT "+ fcat +"...");
    }
}

public class Main {
    public static void main(String[] args)

    {
        System.out.println("Hello PRAJEESH world!");

        Scanner in = new Scanner(System.in);

        System.out.println("ENTER YOUR FAV BIRD NAME : ");
        String fbird = in.nextLine();

        System.out.println("ENTER YOUR FAV CAT NAME : ");
        String fcat = in.nextLine();

        family family = new family();
        Bird bird = new Bird(fbird);
        Cat cat = new Cat(fcat);

        family.sound();
        bird.sound();
        cat.sound();

    }
}