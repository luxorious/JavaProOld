package Homeworks.islandFinder;

import java.util.Random;

public class IslandCreator {
    private Random random = new Random();

    public int[][] createIsland(int height, int width){
        int[][] sea = new int[height][width];
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                sea[i][j] = random.nextInt(2);
            }
        }
        return sea;
    }

    public void printSea(int[][] sea){
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                System.out.print(sea[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findIsland(int[][] sea){
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                if (sea[i][j] == 1){
                    sizeIsland(sea, i, j);
                }
            }
        }
    }

    private void sizeIsland(int[][] sea, int i, int j) {
        if (i <= 0 || i >= sea.length || j <= 0 || j >= sea[0].length || sea[i][j] == 0){
            return;
        }
        sea[i][j] = 0;

        sizeIsland(sea, i - 1, j);
        sizeIsland(sea, i + 1, j);
        sizeIsland(sea, i, j + 1);
        sizeIsland(sea, i, j - 1);
    }
}


