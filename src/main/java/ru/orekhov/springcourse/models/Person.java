package ru.orekhov.springcourse.models;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class Person {
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2,max = 100,message = "Имя должно быть от 2 до 100 символов длинной")
    private String fullName;
    @Min(value = 1900,message ="Год рождения не может быть больше чем 1900")
    private int yearOfBirth;

    // Пустой конструктор нужен для Spring. Тот же ModelAttribute работает через него и с помощью сеттеров помещает туда поля
    public Person() {

    }
    public Person( String fullName,int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
