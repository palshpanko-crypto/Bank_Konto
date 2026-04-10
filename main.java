
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            User user = null;
            String userAnswer;
            boolean quitProgramm = false;
            UserRepository userRepository = new UserRepository();
            UserService userService = new UserService();
            boolean successfullyLogged = false;
            boolean rightPassword = false;

            System.out.println("Welcome in our bank, u have to login");

            while (!successfullyLogged) {
                System.out.println("Write ur login");
                String loginConfirm = input.nextLine();
                if ((!userRepository.containsLogin(loginConfirm))) {
                    System.out.println("Login is wrong, try one more time");
                }
                if (userRepository.containsLogin(loginConfirm)) {
                    successfullyLogged = true;
                    while (!rightPassword) {
                        System.out.println("Write ur password");
                        String passwordConfirm = input.nextLine();
                        user = userRepository.getByLogin(loginConfirm);

                        if (userService.login(user, passwordConfirm)) {
                            System.out.println("Successfully logged in");
                            rightPassword = true;
                        } else if (!userService.login(user, passwordConfirm)) {
                            System.out.println("Password is wrong. Try one more time");
                        }
                    }
                    while (!quitProgramm) {
                        System.out.println("What you want now? U can write 'quit' to exit or 'possible commands' to see possible commands");
                        userAnswer = input.nextLine();
                        if (userAnswer.equalsIgnoreCase("balance")) {
                            System.out.println("Your balance is " + user.getAmount());
                        } else if (userAnswer.equalsIgnoreCase("ID")) {
                            System.out.println("Your UUID is " + user.getId());
                        } else if (userAnswer.equalsIgnoreCase("possible commands")) {
                            System.out.println("Write 'transaction' to make a transaction, 'balance' to check ur balance or ID to see ur ID.");
                        } else if (userAnswer.equalsIgnoreCase("quit")) {
                            quitProgramm = true;
                        } else if (userAnswer.equalsIgnoreCase("transaction")){
                            System.out.println("Write ID of the reciever");
                            String recieverVerification = input.nextLine();
                        }
                    }

                }

            }
        }
    }
}
