package pl.kurs.java.lesson9;

public class Person {
    private String name;
    private String surname;
    private String pesel;

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        if (pesel.length() == 11){
            this.pesel = pesel;
        } else {
            this.pesel = "000000000";
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            return;
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

/*

1. stworz klase Car o polach:
- marka
- model
- przebieg
- moc
- rocznik
- pojemnocs
- typNadwozia (ENUM)


 i napisz CarService w ktorym będdą mmetody przyjmujace liste car:
- zwraca auto z najwiekszym przebeitgirm
- zwrocci auto z najmniejsza mocą
- wyświuetli posortowane po mocy pojazy (malejąco)
- policzy ile jest aut z kazdego typu nadwozia
- policzy sumaryczna ilosc samoglosek we wszysktich nazwach modeli
- policzy łączną długość stringów (nazw marek)
- policzy ile jest aut danej marki (metoda przyjmuje dodatwkowo Stringa marka)


Lista aut ma zostac wygenerowana losowo
losujesz marke z loisty
losujesz model dla danej marki (mapa Map<String, List<String>> np. "Ford", {"Kuga", "Puma", "Mondeo"})
przebieg losuj
pojemnosc losuj
moc licz na podstawie pojemnosci (wymyśl jakis wzor)
rocznik losuj
typ nadwozia losuj z listy


2. napisz zddanie z ofertami i apliakcjami jeszcze RAZ, ale tym razem zastosuj enkapsulacje czyli to private dostep w polach klasy



 */