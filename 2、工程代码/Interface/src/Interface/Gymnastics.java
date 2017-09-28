package Interface;

import java.util.Arrays;

public class Gymnastics implements ComputeAverage{

    public double []gymGrade={89,85,72,66,99,97};       //85.75

    @Override
    public double averageGrade(double[] array) {
        double sum=0;
        Arrays.sort(array);
        for (int i=1; i<(array.length-1); i++){
            sum+=array[i];
        }
        return (sum/(array.length-2));
    }
}
