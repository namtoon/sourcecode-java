import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

    @Test
    public void Array1() {
      Sort sort = new Sort();
      int[] input = {1};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1}, sorted);
    }
    @Test
    public void Array12() {
      Sort sort = new Sort();
      int[] input = {1,2};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2}, sorted);
    }
    @Test
    public void Array21() {
      Sort sort = new Sort();
      int[] input = {2,1};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2}, sorted);
    }
    @Test
    public void Array123() {
      Sort sort = new Sort();
      int[] input = {1,2,3};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2,3}, sorted);
    }
    @Test
    public void Array231() {
      Sort sort = new Sort();
      int[] input = {2,1,3};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2,3}, sorted);
    }
    @Test
    public void Array132() {
      Sort sort = new Sort();
      int[] input = {1,3,2};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2,3}, sorted);
    }
    @Test
    public void Array312() {
      Sort sort = new Sort();
      int[] input = {3,1,2};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2,3}, sorted);
    }
    @Test
    public void Array321() {
      Sort sort = new Sort();
      int[] input = {3,2,1};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2,3}, sorted);
    }
    @Test
    public void Array54321() {
      Sort sort = new Sort();
     int[] input = {5,4,3,2,1};
      int[] sorted = sort.of(input);
      assertArrayEquals(new int[]{1,2,3,4,5}, sorted);
    }
    
}
