import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        int a = 0;
        for (int i =0; i<numbers.size();i++){
            a += numbers.get(i);
        }return a / numbers.size();
    }
}