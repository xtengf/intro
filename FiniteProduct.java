public class FiniteProduct
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int product = 1;
        for (int i = 1; i <= N; i++)
            product *= i;
        System.out.println(product);
    }
}
