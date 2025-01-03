public class sTACK {

    int Max_Size = 10;
    char array[] = new char[Max_Size];

    int index = -1;
    char one;
    char cg;

    public void PushOperation(String val)
    {

        if(index == 10)
        {
            throw new IndexOutOfBoundsException("ARRAY IS FULL");
        }

        for (int i =0;i<=val.length()-1;i++)
        {
            one = array[++index] = val.charAt(i);
            System.out.print( one + " ");
        }

    }

    public char[] PopOperation()
    {
        if (index == -1)
        {
            throw new IndexOutOfBoundsException("ARRAY IS EMPTY : ....");

        }else {


            char pop = array[index--];
            System.out.println("Pop Value : " + pop);
        }
        return new char[0];
    }


}
