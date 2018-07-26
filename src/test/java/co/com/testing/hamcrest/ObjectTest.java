package co.com.testing.hamcrest;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ObjectTest {

  @Test
  public void objectHasPass() {
    Todo todo = new Todo(1, "Learn Hamcrest", "Important");

    assertThat(todo, hasProperty("summary"));
  }

  @Test
  public void objectHasFail() {
    Todo todo = new Todo(1, "Learn Hamcrest", "Important");

    assertThat(todo, hasProperty("summary", equalTo("Learn Hamcrest")));
  }

  @Test
  public void objectHasSameProperties () {

    Todo todo1 = new Todo(1, "Learn Hamcrest", "Important");
    Todo todo2 = new Todo(1, "Learn Hamcrest", "Important");

    assertThat(todo1, samePropertyValuesAs(todo2));
  }

}
