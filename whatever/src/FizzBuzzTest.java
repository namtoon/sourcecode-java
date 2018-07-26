import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void   เลขหนึ่งต้องมีค่าเป็นหนึ่ง( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(1);
         assertEquals("1",result);
    }
    @Test
    public void   NumberTwoGetReturnTWo( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(2);
         assertEquals("2",result);
    }
    @Test
    public void   NumberThreeGetReturnFizz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(3);
         assertEquals("Fizz",result);
    }
    @Test
    public void   NumberFourGetReturnFour( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(4);
         assertEquals("4",result);
    }
    @Test
    public void   NumberFiveGetReturnBuzz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(5);
         assertEquals("Buzz",result);
    }
    @Test
    public void   NumberSixGetReturnFizz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(6);
         assertEquals("Fizz",result);
    }
    @Test
    public void   NumberSevenGetReturnSeven( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(7);
         assertEquals("7",result);
    }
    @Test
    public void   NumberEightGetReturnEight( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(8);
         assertEquals("8",result);
    }
    @Test
    public void   NumberNineGetReturnFizz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(9);
         assertEquals("Fizz",result);
    }
    @Test
    public void   NumberTenGetReturnBuzz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(10);
         assertEquals("Buzz",result);
    }
    @Test
    public void   NumberElevenGetReturnEleven( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(11);
         assertEquals("11",result);
    }
    @Test
    public void   NumberTwelevGetReturnFizz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(12);
         assertEquals("Fizz",result);
    }
    @Test
    public void   NumberThirteenGetReturnThirteen( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(13);
         assertEquals("13",result);
    }
    @Test
    public void   NumberFourteenGetReturnFourteen( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(14);
         assertEquals("14",result);
    }
    @Test
    public void   NumberFifteenGetReturnFifteenFizzBuzz( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(15);
         assertEquals("FizzBuzz",result);
    }
    @Test
    public void   NumberSixteenGetReturnSixteen( ) {
         FizzBuzz fz= new FizzBuzz();
         String result = fz.sendAndReturn(16);
         assertEquals("16",result);
    }
}
