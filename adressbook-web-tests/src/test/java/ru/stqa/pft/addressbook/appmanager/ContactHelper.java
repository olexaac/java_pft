package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Админ on 18.04.2017.
 */
public class ContactHelper {

  private WebDriver wd;

  public ContactHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void returnToContactPage() {
    click(By.linkText("home page"));
  }

  private void click(By locator) {
    wd.findElement(locator).click();
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFname());
    type(By.name("lastname"), contactData.getLname());
    type(By.name("address"), contactData.getCity());
    type(By.name("mobile"), contactData.getMob());
    type(By.name("email"), contactData.getMail());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[2]"));
      }
    type(By.name("byear"), contactData.getYear());
  }

  private void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void updateContactModification() {
    click(By.cssSelector("input[value=\"Update\"]"));
  }

  public void initContactModification() {
    click(By.cssSelector("a[href^=\"edit.php?id\"]"));
  }

  public void selectContact() {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
        click(By.name("selected[]"));
      }
  }
}
