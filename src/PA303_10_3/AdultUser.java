package PA303_10_3;

import java.util.Objects;

public class AdultUser implements LibraryUser{
    private int age;
    private String bookType;

    @Override
    public void registerAccount() {
        if(age >= 12){
            System.out.println("You have successfully registered under an Adult Account.");
        }
        else{
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if(Objects.equals(bookType, "Fiction")){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
