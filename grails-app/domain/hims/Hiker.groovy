package hims


class Hiker {

    String firstName
    String middleName
    String lastName
    String mobileNumber
    String phoneNumber
    String emailAddress
    String rollNumber
    String address
    String foodPreferences
    String batch

    Date createdDate = new Date();

    static constraints = {
        middleName(nullable: true)
    }
}
