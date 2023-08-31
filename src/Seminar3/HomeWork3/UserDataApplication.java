package Seminar3.HomeWork3;

import java.io.IOException;
import java.util.Scanner;

public class UserDataApplication {
    private static final int MIN_PARAMETER_COUNT = 6;
    private static final int MAX_PARAMETER_COUNT = 6;
    private static final String OUTPUT_FOLDER_PATH = "D:\\GeekBrains\\Учеба GeekBrains\\2 quater. Main\\" +
                                                     "14. Exceptions in programming and their handling (Seminars)" +
                                                     "\\Seminars\\src\\Seminar3\\HomeWork3\\UserData";

    public void processUserData() {
        String[] inputParams = readUserInput();

        if (inputParams.length < MIN_PARAMETER_COUNT) {
            System.out.println("Введено недостаточно данных о пользователе.");
            System.exit(1);
        } else if (inputParams.length > MAX_PARAMETER_COUNT) {
            System.out.println("Введено больше данных о пользователе, чем требовалось.");
            System.exit(1);
        }

        UserData userData = parseUserData(inputParams);
        saveUserData(userData);
    }

    private String[] readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные, через пробел:" +
                           " (<фио> <датарождения> <телефон> <пол: f - женский, m - мужской>)");
        return scanner.nextLine().split(" ");
    }

    private UserData parseUserData(String[] inputParams) {
        UserDataParser parser = new UserDataParser();
        return parser.parse(inputParams);
    }

    private void saveUserData(UserData userData) {
        UserDataWriter writer = new UserDataWriter();

        try {
            writer.saveUserData(userData, OUTPUT_FOLDER_PATH);
        } catch (IOException e) {
            System.err.println("Не удалось сохранить пользовательские данные: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
