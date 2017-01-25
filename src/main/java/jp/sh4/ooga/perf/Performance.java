package jp.sh4.ooga.perf;

/**
 * Created by sh-ogawa on 2017/01/25.
 */
public class Performance {

    public static int perform(long stopTimeMills){
        try {
            Thread.sleep(stopTimeMills);
        } catch (InterruptedException e) {
            return 1;
        }
        return 0;
    }

}
