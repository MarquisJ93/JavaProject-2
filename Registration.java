package JavaProject2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("Email is valid");
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setUserName(String userName) {
        if (userName.length()<6 || userName.isEmpty()) {
            this.userName = userName;
            System.out.println("Invalid username, should be longer than 6 characters and should not be empty.");
        } else {
            System.out.println("Valid username");
        }
    }

    public void setPassword(String password) {
        if (password.length() < 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Password should be longer than 6 characters and should not contain username.");
        } else if(password.isEmpty()){
            System.out.println("Password is empty");
        }else{
            System.out.println("Valid password");
        }
    }
}
class RegistrationTester {
    public static void main(String[] args) {
        Registration r = new Registration();
        r.setEmail("SyntaxStudent@yahoo.com");
        r.setUserName("Syntax");
        r.setPassword("IloveJava101");
    }
}