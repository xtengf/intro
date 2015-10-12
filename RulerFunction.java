public class RulerFunction
{
    public static void main(String[] args)
    {
        String ruler = " ";
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++)
            ruler = ruler + i + ruler;
        System.out.println(ruler);
    }
}
