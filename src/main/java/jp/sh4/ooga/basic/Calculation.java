package jp.sh4.ooga.basic;

/**
 * Created by sh-ogawa on 2017/01/25.
 */
public class Calculation {

    /** 加法を行う */
    public static int add(int x, int y) { return x + y; }
    /** 減法を行う */
    public static int sub(int x, int y) { return x - y; }
    /** 乗法を行う */
    public static int multi(int x, int y) { return x * y; }
    /** 除法を行う */
    protected static int div(int x, int y) {
        if(y == 0) throw new IllegalArgumentException("Please pass a non-zero value to y.");
        return x / y;
    }

}
