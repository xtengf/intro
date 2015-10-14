public class DoWhile
{
    do
    { // Scale x and y to be random in (-1, 1).
        x = 2.0*Math.random() - 1.0;
        y = 2.0*Math.random() - 1.0;
    } while (Math.sqrt(x*x + y*y) > 1.0);
}
