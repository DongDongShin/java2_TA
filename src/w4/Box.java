package w4;


import java.util.*;

public class Box implements Comparable<Box>{

    private double width;//가로
    private double height;//높이
    private double depth;//세로

    public Box(double width, double depth, double height) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public int compareTo(Box o) {
        double thisVolume = this.width * this.depth * this.height;
        double otherVolume = o.width * o.depth * o.height;
        if (thisVolume < otherVolume) return -1;
        else if (thisVolume > otherVolume) {
            return 1;
        } else return 0;
    }

    public String toString() {
        return String.format("Box[width = %.1f, depth=%.1f, height=%.1f]", this.width, this.depth, this.height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seed: ");
        Long seed = sc.nextLong();
        Random r = new Random(seed);
        Box[] boxes = new Box[5];
        for (int i = 0; i < boxes.length; i++) {
            double width = r.nextDouble() * 10.0;
            double depth = r.nextDouble() * 10.0;
            double height = r.nextDouble() * 10.0;
            Box temp = new Box(width, depth, height);
            boxes[i] = temp;

        }
        List<Box> list = Arrays.asList(boxes);
        System.out.println("Boxes");
        for (Box box : list) {
            System.out.println(box);
        }
        System.out.println("Sort by volume");
        Collections.sort(list);
        for (Box box : list) {
            System.out.println(box);

        }
        System.out.println("Sort by surface area.");
        Collections.sort(list, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                double surface1 = 2*(o1.width * o1.height)+2*(o1.width * o1.depth )+2*(o1.depth * o1.height);
                double surface2 = 2*(o2.width * o2.height)+2*(o2.width * o2.depth )+2*(o2.depth * o2.height);
                if (surface1 < surface2) return -1;
                else if (surface1 > surface2) {
                    return 1;
                } else return 0;
            }
        });
        for (Box box : list) {
            System.out.println(box);

        }

    }


}