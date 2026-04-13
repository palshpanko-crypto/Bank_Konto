
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            User user = null;
            String userAnswer;
            boolean quitProgram = false;
            UserRepository userRepository = new UserRepository();
            UserService userService = new UserService();
            TransactionService transactionService = new TransactionService(userRepository);
            boolean successfullyLogged = false;
            boolean rightPassword = false;

            System.out.println("Welcome in our bank, u have to login");

            while (!successfullyLogged) {
                System.out.println("Write ur login");
                String loginConfirm = input.nextLine();
                if ((!userRepository.containsLogin(loginConfirm))) {
                    System.out.println("Login is wrong, try one more time");
                    continue;
                } else if (userRepository.containsLogin(loginConfirm)) {
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
                    while (!quitProgram) {
                        System.out.println("What you want now? U can write 'quit' to exit or 'possible commands' to see possible commands");
                        userAnswer = input.nextLine();
                        if (userAnswer.equalsIgnoreCase("balance")) {
                            System.out.println("Your balance is " + user.getBalance());
                        } else if (userAnswer.equalsIgnoreCase("ID")) {
                            System.out.println("Your UUID is " + user.getId());
                        } else if (userAnswer.equalsIgnoreCase("possible commands")) {
                            System.out.println("Write 'transaction' to make a transaction, 'balance' to check ur balance or ID to see ur ID.");
                        } else if (userAnswer.equalsIgnoreCase("quit")) {
                            quitProgram = true;
                        } else if (userAnswer.equalsIgnoreCase("transaction")) {
                            System.out.println("Write login of the reciever");
                            String recieverLogin = input.nextLine();
                            User receiver = userRepository.getByLogin(recieverLogin);
                            if (receiver == null) {
                                System.out.println("Login doesnt exist");
                                continue;
                            }
                            System.out.println("Now write amount of your transaction");
                            double userAmount = Double.parseDouble(input.nextLine());
                            if (userAmount <= 0){
                                System.out.println("Amount of ur transaction cannot be less then 0");
                                continue;
                            }
                            boolean success = transactionService.transfer(user.getLogin(), receiver.getLogin(), userAmount);

                            if (success) {
                                System.out.println("Transaction is completed");
                                System.out.println("Your balance now is " + user.getBalance());
                            } else {
                                System.out.println("Not enough balance");
                            }

                        }
                    }

                }

            }
        }
    }
}
