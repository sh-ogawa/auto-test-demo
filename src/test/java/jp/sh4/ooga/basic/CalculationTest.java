package jp.sh4.ooga.basic;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by sh-ogawa on 2017/01/25.
 */
public class CalculationTest {

    //例外を検知する
    @Rule
    public ExpectedException expect = ExpectedException.none();

    @Test
    public void 加法の確認(){
        assertEquals(3, Calculation.add(1, 2));
    }

    @Test
    public void 減法の確認(){
        assertEquals(4, Calculation.sub(6, 2));
    }

    @Test
    public void 乗法の確認(){
        assertEquals(12, Calculation.multi(6, 2));
    }

    @Test
    public void 徐法の確認(){
        assertEquals(2, Calculation.div(8, 4));
    }

    @Test
    public void 徐法でゼロ除算させようとした場合に例外が発生することの確認(){
        //デバッグすれば判るが、Ruleは毎回インスタンスを作り直すため、変更したら、変更しっぱなしにしておいて問題ない
        expect.expect(IllegalArgumentException.class);
        expect.expectMessage("Please pass a non-zero value to y.");
        assertEquals(2, Calculation.div(8, 0));
    }

}
