public class FunctionTable
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++)
            System.out.println(i + " " + 2*Math.PI*i/N);
    }
}
