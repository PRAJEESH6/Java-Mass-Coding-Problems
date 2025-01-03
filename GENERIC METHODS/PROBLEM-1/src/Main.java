public class Main {

    public static <T> void DisplayArray(T[] BaseArray)
    {
        for (T ele: BaseArray) {
            System.out.println(ele);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Integer[]    array1 = {1,2,3,4,5};
        String[] array2 = {"praju","suju","sasikumar","saraswathi"};
        Character[]   array3 = {'a','b','c','d'};
        Double[] array4 = {200.9,3.6,90.9};

        DisplayArray(array1);
        DisplayArray(array2);
        DisplayArray(array3);
        DisplayArray(array4);
    }
}