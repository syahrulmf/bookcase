package models;

import abstracts.Person;

public class Author extends Person {
  private String country;
  int age;

  public Author(String firstName, String lastName, String country, int age) {
    super(firstName, lastName);
    this.country = country;
    this.age = age;
  }

  public Author() {

  }

  @Override
  public String getFullName() {
    return getLastName() + ", " +getFirstName();
  }

  @Override
  public String toString() {
    return "Author {" + "country='" + country + '\'' + ", age=" + age + ", getFullName()=" + getFullName() + '}';
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
