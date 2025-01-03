public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        StackOperation stacks = new StackOperation();



        String postfix = "231+9";


        for(int i=0;i<postfix.length();i++)
        {
            int ch = postfix.charAt(i);
            if(Character.isDigit(ch) == true)
            {
                stacks.Push(ch - '0');
                System.out.println(ch);

            }else {

              int num1 = stacks.Pop();
              int num2 = stacks.Pop();


                switch (ch){

                    case '+' :
                    {
                        stacks.Push(num1 + num2);
                        break;
                    }

                    case '-' :
                    {
                        stacks.Push(num1 - num2);
                        break;
                    }

                    case '*' :
                    {
                        stacks.Push(num1 * num2);
                        break;
                    }

                    case '/' :
                    {
                        stacks.Push(num1 / num2);
                        break;
                    }

                    case '%' :
                    {
                        stacks.Push(num1 % num2);
                        break;
                    }

                    case '^' :
                    {
                        stacks.Push(num1 ^ num2);
                        break;
                    }
                }
            }

            System.out.println("EVALUVATED ANSWER IS :" + stacks.Pop());
        }
    }
}