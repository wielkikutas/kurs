package pl.kurs.java.lesson11;

import java.util.List;

public class PersonService {
    public Person returnsOldestWoman(List<Person> personList) {
        Person oldest = null;
        for (Person person : personList) {
            if (person.getName().endsWith("a") && (oldest == null || oldest.getAge() < person.getAge())) {
                oldest = person;
            }
        }
        return oldest;
    }

    public double getAverageOfAge(List<Person> personList) {
        double sum = 0;
        for (Person person : personList) {
            sum += person.getAge();
        }
        return sum / personList.size();
    }

    public double getAverageOfMenAge(List<Person> personList) {
        double sum = 0;
        double counter = 0;
        for (Person person : personList) {
            if (!person.getName().endsWith("a")) {
                counter++;
                sum += person.getAge();
            }
        }
        return sum / counter;
    }

    public double getMeanOfWoMenAge(List<Person> personList) {
        double sum = 0;
        int counterForWomen = 0;
        for (Person person : personList) {
            if (person.getName().endsWith("a")) {
                counterForWomen++;
                sum += person.getAge();
            }
        }
        if (counterForWomen == 0) {
            return 0;
        }
        return sum / counterForWomen;
    }

    public double getMeanOfGenderAge(List<Person> personList, String gender) {
        int sum = 0;
        int counterForWomen = 0;
        for (Person person : personList) {
            if (gender.equalsIgnoreCase("men")) {

            } else {

            }


            if (person.getName().endsWith("a")) {
                counterForWomen++;
                sum += person.getAge();
            }
        }
        return sum / counterForWomen;
    }

}
