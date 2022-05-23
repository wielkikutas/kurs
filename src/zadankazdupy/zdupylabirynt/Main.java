package zadankazdupy.zdupylabirynt;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PointCords a = new PointCords(1, 1);
        PointCords b = new PointCords(3, 1);
        List<PointCords> listakorduwdoprzejscia=new ArrayList<>();
        int[][] labirynth = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},

        };
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (labirynth[i][j]==0){
                    //listakorduwdoprzejscia.add(1;i,j)



                }
            }
        }
    }
}