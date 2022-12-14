package com.splitscale.fordastore.core.user;

public class User {
  private String uid;
  private String username;
  private String password;

  public User() {
    // default constructor
  }

  public User(String uid, String username, String password) {
    this.uid = uid;
    this.username = username;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }
}
