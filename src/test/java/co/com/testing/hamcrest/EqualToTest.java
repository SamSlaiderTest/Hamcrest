package co.com.testing.hamcrest;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class EqualToTest {

  boolean a = true;
  boolean b = true;
  boolean c = false;

  @Test
  public void equalToPass() {
    assertThat(a, equalTo(b));
  }

  @Test
  public void equalToFail() {
    assertThat(a, equalTo(c));
  }

  @Test
  public void isEqualToPass() {
    assertThat(a, is(equalTo(b)));
  }

  @Test
  public void isEqualToFail() {
    assertThat(a, is(equalTo(c)));
  }

  @Test
  public void isPass() {
    assertThat(a, is(b));
  }

  @Test
  public void isFail() {
    assertThat(a, is(c));
  }

  @Test
    public void isNotEqualToPass() {
    assertThat(a, is(not(equalTo(c))));
  }

  @Test
  public void isNotEqualToFail() {
    assertThat(a, is(not(equalTo(b))));
  }

  @Test
  public void anyOfPass() {
    assertThat("test", anyOf(is("testing"), containsString("est")));
  }

  @Test
  public void anyOfFail() {
    assertThat("test", anyOf(is("testing"), containsString("tse")));
  }

}
