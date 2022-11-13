import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static ArrayList<Object> collectAll(ArrayList<Object> rs, Filter f) {
        ArrayList<Object> rectangleList = new ArrayList<Object>();

        for (Object r : rs) {
            if (f.accept(r)){
                rectangleList.add(r);
            }//end if
        }//end for
        return rectangleList;
    }//end AL

    public static void main(String[] args) {
        ArrayList<Object> rectangles = new ArrayList<Object>();
        rectangles.add(new Rectangle(1,2));
        rectangles.add(new Rectangle(1,3));
        rectangles.add(new Rectangle(1,4));
        rectangles.add(new Rectangle(2,2));
        rectangles.add(new Rectangle(3,1));
        rectangles.add(new Rectangle(5,5));
        rectangles.add(new Rectangle(6,2));
        rectangles.add(new Rectangle(7,2));
        rectangles.add(new Rectangle(10,10));
        rectangles.add(new Rectangle(1,10));

        rectangles = collectAll(rectangles, new BigRectangleFilter());
        System.out.println(rectangles);
        }

    }

