public class PowerOfTwoLessN
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int v = 1;
        while (v <= N/2)
        {
            v = 2 * v;
            System.out.println(v);
        }
    }
}
