package co.com.testing.hamcrest;

public class Todo {

  private final long id;
  private String summary;
  private String description;
  private int year;

  public Todo(long id, String summary, String description) {
    this.id = id;
    this.summary = summary;
    this.description = description;
  }

}
