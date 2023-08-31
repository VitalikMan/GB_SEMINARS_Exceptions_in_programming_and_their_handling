package Seminar3.HomeWork3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class UserDataWriter {
    public void saveUserData(UserData userData, String folderPath) throws IOException {
        File directory = new File(folderPath);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Каталог создан: " + directory.getAbsolutePath());
            } else {
                throw new IOException("Не удалось создать каталог: " + directory.getAbsolutePath());
            }
        }

        String fileName = folderPath + File.separator + userData.getSurname() + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(userData.getSurname() + " " + userData.getName() + " " + userData.getPatronymic() +
                " " + userData.getBirthDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                " " + userData.getPhoneNumber() + " " + userData.getGender() + "\n");
        writer.close();
    }
}
