import java.util.function.Predicate;

public class TestComputableVersion2
{
    public static void main(String[] args)
    {
        // Part a: Testing with Integer
        printResult(x -> x > 30);
        printResult(x -> x > 30.0);
        
        // Part b: Testing with String
        printStringResult(s -> s.length() > 5);
    }
    
    public static void printResult(Predicate<Integer> compIn)
    { 
        System.out.println(compIn.test(35));
    }

    public static void printDoubleResult(Predicate<Double>compIn)
    {
        System.out.println(compIn.test(40.0));
    }
    public static void printStringResult(Predicate<String> compIn)
    {
        System.out.println(compIn.test("Hello world"));
    }
}

