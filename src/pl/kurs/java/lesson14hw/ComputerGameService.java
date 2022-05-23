package pl.kurs.java.lesson14hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerGameService {
    List<ComputerGame> computerGameList = new ArrayList<>();
    ComputerGame c1 = new ComputerGame("Minecraft","notch",100,"rpg",12);
    ComputerGame c2 = new ComputerGame("cs","valv",100,"rpg",14);

    public List<ComputerGame> find_game_for_youngilings(List<ComputerGame> computerGameList) {
        List<ComputerGame>gamesforkids=new ArrayList<>();
        for (ComputerGame computerGame : computerGameList) {
            if (computerGame.getAgebound()<16&&computerGame.getAgebound()>13){
                gamesforkids.add(computerGame);
            }
        }
        return gamesforkids;
    }
    public List<ComputerGame>findsametype(List<ComputerGame>computerGameList){
        Scanner scanner= new Scanner(System.in);
        System.out.println("podaj typ jakiego szukasz ");
        String usertype = scanner.nextLine();
        List<ComputerGame> sametypegames=new ArrayList<>();
        for (ComputerGame computerGame : computerGameList) {
            if (computerGame.getType()==usertype){
                sametypegames.add(computerGame);
            }
        }
        return sametypegames;
    }
    public double meanofprice (List<ComputerGame>computerGameList){
        int counter=0;
        double sum=0;
        for (ComputerGame computerGame : computerGameList) {
            sum=+computerGame.getPrice();
            counter++;
        }
        return sum/counter;
    }
    public int countsamogloslkikurwa (List<ComputerGame>computerGameList){
        int counter=0;
        for (ComputerGame computerGame : computerGameList) {
            char[] chars = computerGame.getTitle().toCharArray();
            for (char aChar : chars) {
                if (aChar==11){//tu zjebane
                    counter++;


                }
            }


        }
    return counter;
    }
    public ComputerGame returnrequestedgame(List<ComputerGame>computerGameList){
        Scanner scanner =new Scanner(System.in);
        System.out.println("give the name of the game that u seek");
        String userString =scanner.nextLine();
        for (ComputerGame computerGame : computerGameList) {
            if (computerGame.getTitle().contains(userString)){
                return computerGame;
            }else {
            }
        }

        return null;

    }

}
