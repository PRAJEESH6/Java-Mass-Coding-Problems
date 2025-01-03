package Expository;

public class FirstLinked {
    public static void main(String args[])
    {
        System.out.println("Welcome Prajeesh....");

        FirstSub firstSub = new FirstSub();
        SecondSub secondSub = new SecondSub();
        Expository expository = new Expository();

        firstSub.InsertBegining(500);
        firstSub.InsertBegining(400);
        firstSub.InsertBegining(600);

        secondSub.InsertBegining(1000);
        secondSub.InsertBegining(3000);
        secondSub.InsertBegining(6000);

        expository.InsertBegin(20);
        expository.InsertBegin(40);
        expository.InsertBegin(70);
        expository.InsertBegin(10);

        System.out.println(" ");
        firstSub.Display();
        System.out.println(" ");
        secondSub.Display();
        System.out.println(" ");
        expository.Display();
        System.out.println(" ");
    }
}
