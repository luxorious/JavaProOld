package Phone;

public class PhoneDemo {
    public static void main(String[] args) {
//        MyPhone myPhone = new MyPhone();
        Phone iphone = new Phone("iPhone 13", "Black");
        Phone samsung = new Phone("Note 20 Ultra", "white");

        ImportPhone importPhone1 = new ImportPhone("Apple", iphone);
        ImportPhone importPhone2 = new ImportPhone("Samsung", samsung);

        System.out.println(importPhone1);

        MyPhone myPersonalPhone = new MyPhone(123456789, iphone);

        System.out.println(myPersonalPhone);
        myPersonalPhone.ring(93799992);

//        myPersonalPhone.phone.getColor() = "Grey";



    }
}
