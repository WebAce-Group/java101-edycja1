public class User {
    private String username;
    private String email;

    public User( String username, String email){
        this.username = username;
        this.email = email;
    }

    public String toString(){
        return "Username: " + this.username + "\nEmail: " + this.email + "\n\n\n\n";
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }
}
