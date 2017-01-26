package jp.sh4.ooga.perf;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Created by sh-ogawa on 2017/01/25.
 */
public class PerformaceTest {

    //テストのタイムアウトを検知する
    @Rule
    public Timeout timeout = Timeout.seconds(1);

    @Test
    public void タイムアウトしない場合のテスト(){
        assertEquals(0, Performance.perform(500));
    }

    @Test
    public void タイムアウトした場合のテスト(){
        assertEquals(0, Performance.perform(1500));
    }

    @Test
    public void タイムアウトを動的に変更して通過させる場合のテスト(){
        //デバッグすれば判るが、Ruleは毎回インスタンスを作り直すため、変更したら、変更しっぱなしにしておいて問題ない。
        timeout = Timeout.seconds(2);
        assertEquals(0, Performance.perform(1000));
    }

}
