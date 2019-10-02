import Circle.Circle;
import Circle.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5 , "Red", true);
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        Comparator circleComparator = new CircleComparator();

        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }

    }
}
