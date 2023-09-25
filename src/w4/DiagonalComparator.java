package w4;

import java.util.Comparator;

public class DiagonalComparator implements Comparator<Rectangle3> {


    @Override
    public int compare(Rectangle3 o1, Rectangle3 o2) {
        double d1 = Math.sqrt(Math.pow(o1.getHeight(),2)+Math.pow(o1.getWidth(),2));
        double d2 = Math.sqrt(Math.pow(o2.getHeight(),2)+Math.pow(o2.getWidth(),2));

        if(d1 == d2)
            return 0;
        else if(d1 < d2)
            return -1;
        else
            return 0;
    }
}
