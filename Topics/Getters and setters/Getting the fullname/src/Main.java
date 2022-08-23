class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if ((firstName == null) || (firstName.equals(""))) {
            this.firstName = "";
        } else {this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if ((lastName == null) || (lastName.equals(""))) {
            this.lastName = "";
        } else {this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (((firstName == null) || (firstName.equals(""))) && ((lastName == null) || (lastName.equals("")))) {
           return "Unknown";
        } else if (((firstName == null) || (firstName.equals("")))) {
            return this.lastName;
        } else if (((lastName == null) || (lastName.equals("")))) {
            return this.firstName;
        }else{
            return firstName + " " + lastName;
        }
    }
}