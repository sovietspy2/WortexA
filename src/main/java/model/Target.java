package model;

import java.util.Objects;

public class Target {
    private String name;
    private Integer age;
    private Integer fee;
    private Assassin assignedAssasin;
    private boolean finished;

    public Target(String name, Integer age, Integer fee, Assassin assignedAssasin, boolean finished) {
        this.name = name;
        this.age = age;
        this.fee = fee;
        this.assignedAssasin = assignedAssasin;
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", assignedAssasin=" + assignedAssasin +
                ", finished=" + finished +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Target target = (Target) o;
        return finished == target.finished &&
                Objects.equals(name, target.name) &&
                Objects.equals(age, target.age) &&
                Objects.equals(fee, target.fee) &&
                Objects.equals(assignedAssasin, target.assignedAssasin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, fee, assignedAssasin, finished);
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

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Assassin getAssignedAssasin() {
        return assignedAssasin;
    }

    public void setAssignedAssasin(Assassin assignedAssasin) {
        this.assignedAssasin = assignedAssasin;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
