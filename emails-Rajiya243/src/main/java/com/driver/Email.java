package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId) {
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUpper(String newPassword) {
        //  int []freq = new int[26];
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isUpperCase(newPassword.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public boolean isLower(String newPassword) {
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isLowerCase(newPassword.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public boolean isNumber(String newPassword) {
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isDigit(newPassword.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public boolean isSpecial(String newPassword) {
        for (int i = 0; i < newPassword.length(); i++) {
            char s = newPassword.charAt(i);
            if (!Character.isDigit(s) && !Character.isLetter(s) && !Character.isWhitespace(s)) {
                return true;
            }
        }

        return false;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if (this.password.equals(oldPassword)) {
            if (newPassword.length() >= 8) {
                boolean upper = isUpper(newPassword);
                boolean lower = isLower(newPassword);
                boolean number = isNumber(newPassword);
                boolean special = isSpecial(newPassword);
                if (upper == true && lower == true && number == true && special == true) {
                    this.password = newPassword;
                }
            }
        }
    }
}
