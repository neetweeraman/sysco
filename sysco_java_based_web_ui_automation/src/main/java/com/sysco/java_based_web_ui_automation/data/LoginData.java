package com.sysco.java_based_web_ui_automation.data;

public class LoginData {

    public String Ref;
    public String userName;
    public String password;
    public String firstName;
    public String lastName;
    public String postCode;
    public String phoneNumber;

    public String getRef() {
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) { this.userName = userName; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPostCode() { return postCode; }

    public void setPostCode(String postCode) { this.postCode = postCode; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String postCode) { this.phoneNumber = phoneNumber; }
}
