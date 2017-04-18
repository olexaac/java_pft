package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Админ on 22.02.2017.
 */
public class NavigationHelper extends HelperBase{


  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
      click(By.linkText("groups"));
  }

  public void gotoContactPage() {
      click(By.linkText("home"));
  }
}
