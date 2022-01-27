package pl.kurs.java.lesson9.zadankozautkami;

import zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo.JobOffer;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class CarService {

    public Car methodThatReturnsCarWithHighestCoures(List<Car> cars) {
        Car autoZNajwiekszymPrzebiegiemDoTejPory = null;
        for (Car car : cars) {
            if (autoZNajwiekszymPrzebiegiemDoTejPory == null || autoZNajwiekszymPrzebiegiemDoTejPory.getPrzebieg() < car.getPrzebieg()) {
                autoZNajwiekszymPrzebiegiemDoTejPory = car;
            }
        }
        return autoZNajwiekszymPrzebiegiemDoTejPory;
    }

    public Car methodThatReturnsCarWithAtLeastHorsePower(List<Car> cars) {
        Car autoZnajmniejszaMocomDoTejPory = null;
        for (Car car : cars) {
            if (autoZnajmniejszaMocomDoTejPory == null || autoZnajmniejszaMocomDoTejPory.getMoc() > car.getMoc()) {
                autoZnajmniejszaMocomDoTejPory = car;
            }
        }
        return autoZnajmniejszaMocomDoTejPory;
    }

    public List<Car> methodThatReturnsSortedByHpCars(List<Car> cars) {
        Car autoZnajwiekszaMoca = null;
        List<Car> autaByHp = null;
        for (Car car : cars) {
            if (autoZnajwiekszaMoca == null || autoZnajwiekszaMoca.getMoc() < car.getMoc()) {
                autoZnajwiekszaMoca = car;
            }
            for (Car auto : autaByHp) {
                if (autaByHp.contains(car)) {
                    continue;
                } else {
                    autaByHp.add(car);
                }
            }
        }
        return autaByHp;
    }
    public Map<String,Integer> methodThatReturnsQuantityOfCarBodies(List<Car> cars){
        Map<String,Integer> mapWithBodyCars=null;
        for (Car car : cars) {
            if (mapWithBodyCars.containsKey(car.getTypNadwozia())){
                mapWithBodyCars.put(car.getTypNadwozia(),+1);
            }else {
                mapWithBodyCars.put(car.getTypNadwozia(), 1);
            }
        }
        return mapWithBodyCars;
    }
    public Map<String,Integer> methodThatReturnsQuantityOfVovelsAndOthers(List<Car>cars){
        Map<String,Integer> literkipierdolonewmapie =null;
        char[]literki=null;
        for (Car car : cars) {
            car.getModel().toCharArray();
            for (char c : literki) {
                if (c==('a'|'ą'|'e'|'ę'|'i'|'o'|'u'|'y')){
                    literkipierdolonewmapie.put("Samogłoska",+1);
                }else{
                    literkipierdolonewmapie.put("Spółgłoska",+1);
                }
            }
        }
        return literkipierdolonewmapie;
    }
    public Integer methodThatReturnsSumaricLengthInAllModelNames(List<Car>cars){
        int dlugoscwszystkich=0;
        for (Car car : cars) {
            dlugoscwszystkich+=car.getModel().length();

        }
        return dlugoscwszystkich;
    }
        public Map<String,Integer> methodThatretunsQuantityofBolidesOf1Mark (List<Car>cars){
        Map<String,Integer>spierdolonampazjebanymikaroseriami=null;
        for (Car car : cars) {

                spierdolonampazjebanymikaroseriami.put(car.getTypNadwozia(),+1);

            }
        return spierdolonampazjebanymikaroseriami;
        }

        public  List<Car> metodalosoweautka(List<Car>cars){
        List<Car> pomieszanalistautek=null;
        for (Car car : cars) {
                if (ThreadLocalRandom.current().nextBoolean()){
                    pomieszanalistautek.add(car);
                }continue;
            }
        return pomieszanalistautek;
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