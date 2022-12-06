
import java.util.Arrays;

public class Score {
    double score;

    public int sum(int[] array) {
        int sum=0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    public double average(int[] array){
        Arrays.sort(array);
        double sum = sum(array);
        sum = sum - (array[0] + array[array.length-1]);

        double score = sum/3;
        return score;
    }
}
