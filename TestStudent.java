// Student class (non-public)
class Student {
    int num;
    String name;
    String Address;
    int phone;
    char Gender;

    void insertRecord(int num, String name, String Address, int phone, char Gender) {
        this.num = num;
        this.name = name;
        this.Address = Address;
        this.phone = phone;
        this.Gender = Gender;
    }

    void display() {
        System.out.println("Num     = " + num);
        System.out.println("Name    = " + name);
        System.out.println("Address = " + Address);
        System.out.println("Phone   = " + phone);
        System.out.println("Gender  = " + Gender);
    }


// Main Public Class - Must match the file name


    }
