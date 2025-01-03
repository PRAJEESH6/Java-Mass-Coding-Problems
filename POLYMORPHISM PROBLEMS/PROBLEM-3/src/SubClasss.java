public class SubClasss {

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

    class Cricket extends Sports{

        @Override
        public void Play()
        {
            System.out.println("Cricket is the Supre playing game...");
        }
    }

    class Ruby extends Sports{

        @Override
        public void Play()
        {
            System.out.println("Ruby is the Supre playing game...");
        }
    }
}
