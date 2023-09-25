package w4;

public class Rectangle {

    private double width, height;        // 필드


    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }    // 생성자

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public String toString(){
        return "Rectangle[width="+String.format("%.1f",width)+""+", height="+String.format("%.1f",height)+"]";
    }


}

