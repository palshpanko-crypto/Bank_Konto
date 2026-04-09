import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
        HashMap<String, User> users = new HashMap<>();
        
        String passwordConfirm;
        boolean loggedin = true;
        boolean backToReg = false;
        String loginConfirm;
        boolean repeat = false;
        User user;

        System.out.println("Welcome in our bank, u have to register ur account");
         while(!repeat) { while (!backToReg){System.out.println("Make a username");
        String id = UUID.randomUUID().toString();
        String username = input.nextLine();

        System.out.println("Create a login");
        String login = input.nextLine();

        
        System.out.println("Create ur password");
        String password = input.nextLine();

        System.out.println("Great! ur account created and there is ur unique ID: " + id);

        User newUser = new User(username, login, password, id);
        users.put(login, newUser);
        System.out.println("Do u want to login into ur account? Print 'Yes' to back to registration or 'no' to login");
        String toReg = input.nextLine();
        if  (toReg.equalsIgnoreCase("no")){
            backToReg = true;
        } if (toReg.equalsIgnoreCase("Yes")){
            backToReg = false;
        }
        
    }
    System.out.println("Now login into ur account");
       while(loggedin){ System.out.println("Write ur login");
        loginConfirm = input.nextLine();
        if (!users.containsKey(loginConfirm)){
            System.out.println("Login is wrong, try one more time");
        }        
        if (users.containsKey(loginConfirm)) {
            System.out.println("And ur password");
            passwordConfirm = input.nextLine();
            user = users.get(loginConfirm);
        
        if (user.getPassword().equals(passwordConfirm)) {
            System.out.println("Successfully logged in");
            System.out.println("Do u want to finish? Yes - end. no - create new accout. quit - finish");
            String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("no")){
                loggedin = false;
                repeat = false;
            } else if (userAnswer.equalsIgnoreCase("quit")){
                break;
            }

        } else if (!user.getPassword().equals(passwordConfirm)) {
            System.out.println("Wrong password. Try one more time");

            }    } } 
        }
    }
}
}
