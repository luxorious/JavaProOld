package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData;

import java.io.FileWriter;
import java.io.IOException;

public class AddUserData {
    public void saveToFile(String login, String password) throws IOException {
        String path = "src/homeworks/additionalHomeWorks/chatGPTTasks/workWithFiles/sources/db.txt";
        try (FileWriter appendData = new FileWriter(path, true)){
//            String textToAdd = userInput.input();
            appendData.write(login + " " + password + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
