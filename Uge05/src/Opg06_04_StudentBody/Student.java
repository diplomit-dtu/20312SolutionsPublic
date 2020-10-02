package Opg06_04_StudentBody;

//********************************************************************
// Student.java Author: Lewis/Loftus
//
// Represents a college student.
//********************************************************************
    public class Student {
        private String firstName, lastName;
        private Address homeAddress, schoolAddress;

        //-----------------------------------------------------------------
// Constructor: Sets up this student with the specified values.
//-----------------------------------------------------------------
        public Student(String first, String last, Address home,
                       Address school) {
            firstName = first;
            lastName = last;
            homeAddress = new Address(home.getStreetAddress(), home.getCity(), home.getState(), home.getZipCode());
            schoolAddress = school;
        }

        //-----------------------------------------------------------------
// Returns a string description of this Student object.
//-----------------------------------------------------------------
        public String toString() {
            String result;
            result = firstName + " " + lastName + "\n";
            result += "Home Address:\n" + homeAddress + "\n";
            result += "School Address:\n" + schoolAddress;
            return result;
        }
    }