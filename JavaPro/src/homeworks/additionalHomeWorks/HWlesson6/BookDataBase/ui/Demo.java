package homeworks.additionalHomeWorks.HWlesson6.BookDataBase.ui;

import homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task5UserData.AddUserData;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        AddUserData addUserData = new AddUserData();

        addUserData.saveToFile();
    }
}
