package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String city;
  private final String mob;
  private final String mail;
  private final String year;
  private String group;

  public ContactData(String fname, String lname, String city, String mob, String mail, String year, String group) {
    this.fname = fname;
    this.lname = lname;
    this.city = city;
    this.mob = mob;
    this.mail = mail;
    this.year = year;
    this.group = group;
  }

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public String getCity() {
    return city;
  }

  public String getMob() {
    return mob;
  }

  public String getMail() {
    return mail;
  }

  public String getYear() {
    return year;
  }

  public String getGroup() {
    return group;
  }
}
