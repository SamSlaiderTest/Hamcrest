package co.com.testing.hamcrest;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ListTest {

  List<Integer> list = Arrays.asList(5, 2, 4);

  @Test
  public void hasSizePass() {
    assertThat(list, hasSize(3));
  }

  @Test
  public void hasSizeFail() {
    assertThat(list, hasSize(4));
  }

  @Test
  public void containsPass() {
    assertThat(list, contains(5, 2, 4));
  }

  @Test
  public void containsFail() {
    assertThat(list, contains(5, 1, 4));
  }

  @Test
  public void containsInAnyOrderPass() {
    assertThat(list, containsInAnyOrder(2, 4, 5));
  }

  @Test
  public void everyItemGreaterThanPass() {
    assertThat(list, everyItem(greaterThan(1)));
  }

  @Test
  public void everyItemGreaterThanFail() {
    assertThat(list, everyItem(greaterThan(4)));
  }

}
