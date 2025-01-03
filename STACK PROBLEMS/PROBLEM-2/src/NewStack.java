public class NewStack {

    int Max_Size = 10;
    char array[] = new char[Max_Size];

    int temp = -1;

    public void push_Process(char val)
    {
        if(temp == Max_Size-1)
        {
            throw new IndexOutOfBoundsException("STACK IS FULL ... TRY LATER..");
        }

       char d = array[++temp] = val;

       System.out.println("YOUR PUSHED DATA IS : " + d + " ");
    }

    public void Pop_Process()
    {
        if(temp == -1)
        {
            throw new IndexOutOfBoundsException("STACK IS EMPTY ... TRY LATER..");
        }

        char s = array[temp--];
        System.out.println("YOUR POPED DATA IS : " + s);
    }

    public void Peek_Data()
    {
        if(temp == -1)
        {
            throw new IndexOutOfBoundsException("STACK IS EMPTY ... TRY LATER..");
        }

        char p = array[temp];
        System.out.println("YOUR PEEK DATA IS : " + p);
    }

    public boolean Paraenthesis_Checker(char val)
    {
        for (int i=0;i<=val.length();i++)
        {
           char data = val.charAt(i);

            if(data == '{' || data == '[' || data == '(' )
            {
                push_Process(data);

            } else if (Max_Size == -1) {
                return false;

            } else if (data == '}' && Peek_Data() == '{') {

                Pop_Process();

            } else if (data == ']' && Peek_Data() == '[') {

                Pop_Process();

            } else if (data == ')' && Peek_Data() == '(') {

                Pop_Process();
            }
        }
        return false;
    }


}
