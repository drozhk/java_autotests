package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email1;
	public String email2;
	public String bday;
	public String bmonth;
	public String byear;
	public String newgroup;
	public String address2;
	public String phone2;

	public ContactData(String firstname, String lastname, String address,
			String home, String mobile, String work, String email1,
			String email2, String bday, String bmonth, String byear,
			String newgroup, String address2, String phone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email1 = email1;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.newgroup = newgroup;
		this.address2 = address2;
		this.phone2 = phone2;
	}
	public ContactData() {
		
	}
}