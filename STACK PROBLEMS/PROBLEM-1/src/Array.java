public class Array {

    static final int MAX_SIZE = 8;

    int arr[] = new int[MAX_SIZE];
    int index = -1;

    public void push(int val)
    {
        if(index == MAX_SIZE)
        {
           throw new IndexOutOfBoundsException("ARRAY IS FULL TRY LATER...");
        }

        int d = arr[++index] = val;
        System.out.println( d + " ");
    }

    public void pop()
    {
        if(index == -1)
        {
            throw new IndexOutOfBoundsException("ARRAY IS EMPTY SO PLEADE INSERT THE VALUES FIRST...");
        }

        int data = arr[index--];

        System.out.println("YOUR POPPED DATA IS : " + data);
    }

    public void peek()
    {
        if (index == -1)
        {
            throw new IndexOutOfBoundsException("ARRAY IS EMPTY SO PLEADE INSERT THE VALUES FIRST...");
        }

        System.out.println("YOUR PEEK DATA IS : " + arr[index]);
    }


}
