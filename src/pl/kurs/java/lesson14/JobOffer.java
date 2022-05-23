package pl.kurs.java.lesson14;

import java.util.List;

public class JobOffer {
    private int salary;
    private int exp;
    private List<String> skills;
    private String city;

    public JobOffer(int salary, int exp, List<String> skills, String city) {
        this.salary = salary;
        this.exp = exp;
        this.skills = skills;
        this.city = city;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
