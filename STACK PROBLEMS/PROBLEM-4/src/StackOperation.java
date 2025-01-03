public class StackOperation {

    int DatabaseSize = 10;
    int index = -1;

    int stack[] = new int[DatabaseSize];

    public void Push(int val)
    {
        if(index == DatabaseSize)
        {
            throw new IndexOutOfBoundsException("OUR DATABASE IS FULL PLEASE TRY AFTER SOME TIME...");
        }else {

            int pushing = stack[++index] = val;
            System.out.println("Pushing Value Is.." + pushing);
        }
    }

    public int Pop()
    {
        if (index == -1)
        {
            throw new IndexOutOfBoundsException("OUR DATABASE IS DRAIN SO ACCESS AFTER SOME TIME.. ");
        }else {

            int poping = stack[index--];
            System.out.println("Poping Value IS.." + poping);
        }
        return 0;
    }

    public void Peek()
    {
        if (index == -1)
        {
            throw new IndexOutOfBoundsException("OUR DATABASE IS DRAIN SO ACCESS AFTER SOME TIME.. ");
        }else {

            int peeking = stack[index];
            System.out.println("Peeking Value IS.." + peeking);
        }
    }
}
