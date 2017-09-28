package Interface;

public class School implements ComputeAverage{

    public double []schoolGrade={90,80,70,90,65};   //平均79分。

    @Override
    public double averageGrade(double[] array) {
        double sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return (sum/array.length);
    }
}
