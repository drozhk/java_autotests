package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  
  @Test
  public void testNonEmptyContactCreation() throws Exception {
	openMainPage();
    gotoContactPage();
    ContactData contact = new ContactData();
	contact.firstname = "first name";
	contact.lastname = "last name";
	contact.address = "qwertyuiop 12, asdfg 23.";
	contact.home = "+796012345678";
	contact.mobile = "+796012334556";
	contact.work = "2362362456256";
	contact.email1 = "asdfg@google.com";
	contact.email2 = "zxcvbn@google.com";
	contact.bday = "2";
	contact.bmonth = "February";
	contact.byear = "1988";
	contact.newgroup = "group 1";
	contact.address2 = "poiutty, hsdfpoj 34";
	contact.phone2 = "11111111111";  
    fillContactForm(contact);
    submitContactCreation();
    returnToHomePage();
  }

  @Test
  public void testEmptyContactCreation() throws Exception {
	openMainPage();
    gotoContactPage();
    ContactData contact = new ContactData();
	contact.firstname = "";
	contact.lastname = "";
	contact.address = "";
	contact.home = "";
	contact.mobile = "";
	contact.work = "";
	contact.email1 = "";
	contact.email2 = "";
	contact.bday = "-";
	contact.bmonth = "-";
	contact.byear = "";
	contact.newgroup = "";
	contact.address2 = "";
	contact.phone2 = "";  
    fillContactForm(contact);
    submitContactCreation();
    returnToHomePage();
  }

}
