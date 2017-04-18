package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.gotoContactPage();
        app.selectContact();
        app.initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Василий", "Пупкин", "Москва", "56320", "dfddsfdfs@fg.cv", "1980"));
        app.updateContactModification();
        app.getContactHelper().returnToContactPage();
    }

}
