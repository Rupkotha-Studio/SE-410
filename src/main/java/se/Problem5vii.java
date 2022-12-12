package se;

public class Problem5vii {
    public static void propagateException() throws InterruptedException {
        Thread.sleep(1000);
        Thread.currentThread().interrupt();
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }
    public static void setPercentage(Integer pct, Object object) {
        if( pct < 0 || pct > 100) {
            throw new IllegalArgumentException("pct has an invalid value");
        }
        if (object == null) {
            throw new IllegalArgumentException("object is null");
        }
    }

    public static void main(String[] args) throws InterruptedException {
       // propagateException();
        setPercentage(110,new Object());
    }
}
