package Seminar3.HomeWork3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserDataParser {
    public UserData parse(String[] inputParams) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String surname = inputParams[0];
        String name = inputParams[1];
        String patronymic = inputParams[2];
        LocalDate birthDate;

        try {
            birthDate = LocalDate.parse(inputParams[3], dateFormatter);
        } catch (Exception e) {
            throw new IllegalArgumentException("\nНеверный формат даты рождения: " + inputParams[3] +
                                               "\nПравильный формат: день.месяц.год");
        }

        long phoneNumber;

        try {
            phoneNumber = Long.parseLong(inputParams[4]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона: " + inputParams[4]);
        }

        char gender;
        String genderStr = inputParams[5].toLowerCase();

        if (genderStr.equals("m")) {
            gender = 'M';
        } else if (genderStr.equals("f")) {
            gender = 'F';
        } else {
            throw new IllegalArgumentException("Неверный пол: " + genderStr);
        }
        return new UserData(surname, name, patronymic, birthDate, phoneNumber, gender);
    }
}
