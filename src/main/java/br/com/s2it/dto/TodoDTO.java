package br.com.s2it.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class TodoDTO {
  public static final int MAX_LENGTH_DESCRIPTION = 500;
  public static final int MAX_LENGTH_TITLE = 100;
  
  private String id;
  
  @Size(max = MAX_LENGTH_DESCRIPTION)
  private String description;

  @NotEmpty
  @Size(max = MAX_LENGTH_TITLE)
  private String title;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public String toString() {
      return String.format(
              "TodoDTO[id=%s, description=%s, title=%s]",
              this.id,
              this.description,
              this.title
      );
  }
}
