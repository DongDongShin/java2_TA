package w4;

public class Rectangle3 implements Measurable, Comparable<Rectangle3> {

    private double width, height;        // 필드


    public Rectangle3(double width, double height){
        this.width = width;
        this.height = height;

    }    // 생성자

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String toString(){
        return "Rectangle3[width="+String.format("%.1f",width)+""+", height="+String.format("%.1f",height)+"]";
    }


    @Override
    public double getMeasure() {
        return width*height;
    }

    @Override
    public int compareTo(Rectangle3 o) {
        double thisArea = width * height;
        double otherArea = o.width * o.height;
        if(thisArea== otherArea)
            return 0;
        else if(otherArea> thisArea)
            return -1;
        else
            return  1;
    }
}

