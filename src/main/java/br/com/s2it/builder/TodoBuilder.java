package br.com.s2it.builder;

import br.com.s2it.entity.Todo;

public class TodoBuilder {

  private String description;

  private String title;

  public TodoBuilder() {
  }

  public TodoBuilder description(String description) {
    this.setDescription(description);
    return this;
  }

  public TodoBuilder title(String title) {
    this.setTitle(title);
    return this;
  }

  public Todo build() {
    Todo build = new Todo(this);

    return build;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}