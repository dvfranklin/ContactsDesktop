package sample;


public class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return this.name + ", " + this.phone + ", " + this.email;
    }
}
