package Creational.Builder;

public class Prgm {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .build();

        System.out.println("User: " + user);
    }
}
