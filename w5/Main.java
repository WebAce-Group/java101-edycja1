import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseController sqliteControl = new DatabaseController();

        DatabaseController mysqlControl = new DatabaseController(
                "localhost",
                "3306",
                "java101",
                "root",
                ""
        );

        User user1 = new User("Adrian", "test@gmail.com");
        User user2 = new User("Michał", "michal@gmail.com");
        User user3 = new User("Piotrek", "piotrek@gmail.com");
        mysqlControl.addUser(user1);
        mysqlControl.addUser(user2);
        mysqlControl.addUser(user3);

        ArrayList<User> users = mysqlControl.getUserByEmail("test@gmail.com");

        for (User user : users){
            System.out.println(user.toString());
        }
    }
}
