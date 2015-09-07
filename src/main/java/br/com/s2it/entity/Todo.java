package br.com.s2it.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.s2it.builder.TodoBuilder;

@Document
public class Todo {
  
  @Id
  private String id;

  private String description;

  private String title;

  public Todo() {
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

  public Todo(TodoBuilder builder) {
    this.description = builder.getDescription();
    this.title = builder.getTitle();
  }

  public static TodoBuilder getBuilder() {
    return new TodoBuilder();
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
