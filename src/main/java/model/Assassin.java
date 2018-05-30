package model;

import java.util.Objects;

public class Assassin {
    private String name;
    private Integer age;
    private boolean available;

    public Assassin(String name, Integer age, boolean available) {
        this.name = name;
        this.age = age;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Assassin{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assassin assassin = (Assassin) o;
        return available == assassin.available &&
                Objects.equals(name, assassin.name) &&
                Objects.equals(age, assassin.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, available);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
