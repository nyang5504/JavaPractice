package PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser josh = new KidUser();
        josh.setAge(10);
        josh.registerAccount();
        josh.setAge(18);
        josh.registerAccount();
        josh.setBookType("Kids");
        josh.requestBook();
        josh.setBookType("Fiction");
        josh.requestBook();
        System.out.println();


        AdultUser sally = new AdultUser();
        sally.setAge(5);
        sally.registerAccount();
        sally.setAge(23);
        sally.registerAccount();
        sally.setBookType("Kids");
        sally.requestBook();
        sally.setBookType("Fiction");
        sally.requestBook();

    }
}
