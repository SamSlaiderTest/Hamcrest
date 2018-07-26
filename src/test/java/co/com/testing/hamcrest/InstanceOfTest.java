package co.com.testing.hamcrest;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class InstanceOfTest {

  @Test
  public void instanceOfPass () {
    assertThat(Integer.valueOf(1), instanceOf(Integer.class));
  }

  @Test
  public void instanceOfFail () {
    assertThat(Long.valueOf(1), instanceOf(Integer.class));
  }
}
