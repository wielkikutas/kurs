package pl.kurs.java.lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JpgMazeService {
    public int[][] returnArrayPointsFromJpg(File picture) throws IOException {
        BufferedImage jpg = ImageIO.read(picture);
        int width = jpg.getWidth();
        int height = jpg.getHeight();
        int[][] maze = new int[height / 12][width / 12];
        int x = 1;
        int y = 1;
        for (int i = 0; i < height / 12; i++) {
            x=1;
            for (int j = 0; j < width / 12; j++) {


                int rgb = jpg.getRGB(x, y);
                String s = Integer.toHexString(rgb);
                if (s.equals("ff000000")) {
                    maze[i][j] = 1;
                } else {
                    maze[i][j] = 0;
                    // BIEALY

                }
                x += 12;
            }
            y += 12;
        }

return maze;
    }
}
