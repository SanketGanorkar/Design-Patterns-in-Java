package Creational.Builder;
public class User{
    private String firstName;
    private String lastName;


    private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    static class UserBuilder{
        private String firstName;
        private String lastName;

        public UserBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
