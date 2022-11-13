import java.awt.Rectangle;

public class BigRectangleFilter implements Filter{
    @Override
    public boolean accept(Object x) {
       Rectangle r = (Rectangle) x;
       double perimeter = 2 * (r.height + r.width);
       if (perimeter>10){
           return true;
       }
       return false;
    }
}
