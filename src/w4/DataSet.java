package w4;

public class DataSet {


    private double sum;
    private Measurable maximum;
    private Measurable minimum;
    private int count;

    public DataSet() {
        sum = 0;
        maximum = null;
        minimum = null;
        count = 0;
    }

    public void add(Measurable x) {
        sum = sum + x.getMeasure();
        if(count ==0 || maximum.getMeasure()<x.getMeasure())
            maximum = x;
        if(count ==0 || minimum.getMeasure()<=x.getMeasure())
            minimum = x;
        count++;
    }

    public Measurable getMaximum(){
        return maximum;
    }
    public Measurable getMinimum(){
        return minimum;
    }



    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return  sum / count;
    }
}
