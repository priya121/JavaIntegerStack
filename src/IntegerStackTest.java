import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerStackTest {

    private IntegerStack stack;

        @Before
        public void setUp() throws Exception {
        stack = new IntegerStack();
        }

        @Test
        public void emptyStack() {
        assertEquals(0, stack.getSize());
        }

        @Test
        public void pushIncreasesSize() {
        stack.push(5);
        assertEquals(1, stack.getSize());
    }

        @Test
        public void popDecreasesSize() {
        stack.push(5);
        stack.pop();
        assertEquals(0, stack.getSize());
    }

        @Test
        public void popReturnsLastPushedNumber() {
        stack.push(5);
        assertEquals(5, stack.pop());
    }

        @Test
        public void peekShowsLastPushedNumber() {
        stack.push(6);
        stack.peek();
        assertEquals(6, stack.peek());
        }

        @Test
        public void popMultipleTimes() {
        stack.push(3);
        stack.push(4);
        stack.pop();
        assertEquals(3, stack.pop());
    }
}