package Seminar3.HomeWork3;

import java.time.LocalDate;

public class UserData {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final LocalDate birthDate;
    private final long phoneNumber;
    private final char gender;

    public UserData(String surname, String name, String patronymic, LocalDate birthDate, long phoneNumber, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
}
