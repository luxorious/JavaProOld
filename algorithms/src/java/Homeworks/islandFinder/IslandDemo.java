package Homeworks.islandFinder;

public class IslandDemo {
    public static void main(String[] args) {
        IslandCreator iC = new IslandCreator();

        int[][] icl= iC.createIsland(5,5);
        iC.printSea(icl);
        System.out.println();
        iC.findIsland(icl);
    }
}
