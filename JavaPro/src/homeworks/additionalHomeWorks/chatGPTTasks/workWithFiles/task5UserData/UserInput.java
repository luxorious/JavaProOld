package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public UserData input(){
        System.out.println("Input login");
        String login = scanner.nextLine();
        System.out.println("Input password");
        String password = scanner.nextLine();

//        return login + " " + password + "\n";
        return new UserData(login, password);
    }
}