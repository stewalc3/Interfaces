public class ShortWordFilter implements Filter{


    @Override
    public boolean accept(Object x) {
        if (x instanceof String) {
            String string = (String)x;
            return string.length()<5;
        }
        return false;
    }
}
