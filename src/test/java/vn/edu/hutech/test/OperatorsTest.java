package vn.edu.hutech.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import vn.edu.hutech.selection.Operators;

public class OperatorsTest {

    private Operators op;

    public OperatorsTest() {
        op = new Operators();
    }

    @Test
    public void testSum(){
        long actual = op.sum(1,2,3);
        long expected = 6;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSum1(){
        long actual = op.sum(1,2,3);
        long expected = 6;
        Assertions.assertAll(() -> Assertions.assertEquals(3, op.sum(1,2)));
        Assertions.assertAll(() -> Assertions.assertEquals(0, op.sum()));
        Assertions.assertAll(() -> Assertions.assertEquals(10, op.sum(1,2,3,4)));
        Assertions.assertAll(() -> Assertions.assertEquals(8, op.sum(1,2,2,1,2)));

    }
}
