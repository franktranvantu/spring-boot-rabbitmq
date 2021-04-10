package com.franktran.producer.model;

import java.util.Date;

public class CustomMessage {

  private String id;
  private String message;
  private Date date;

  public CustomMessage() {}

  public CustomMessage(String id, String message, Date date) {
    this.id = id;
    this.message = message;
    this.date = date;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
