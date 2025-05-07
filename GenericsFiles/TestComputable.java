public class TestComputable
{
    public static void main(String[] args)
    {
        GenericComputable<Integer> comp = (x, y) -> (x + y);
        printResult(comp);
    }
    
    public static void printResult(GenericComputable<Integer> compIn)
    {
        System.out.println(compIn.compute(10, 6));
    }
    
}

