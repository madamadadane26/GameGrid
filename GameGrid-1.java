import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Scanner;

public class GameGrid {

    public void run() {

        int[][] aiGrid = new int[10][10];

        Scanner input = new Scanner(System.in);


        LinkedList olinkedList = new LinkedList();
        SecureRandom oRand = new SecureRandom();
        int iWallChance = 0;
        int iUserRow = 0;
        int iUserCol = 0;
        private static int iTotalMovements;
        boolean game = true;



        while (game == true) {

            olinkedList.addFirst(iUserRow, iUserCol);


            System.out.println("Please type 'd' to move down or 'r' to move right: ");

            if (input.equals("d")) {
                iUserRow++;
            } else{
                iUserCol++;
            }

            if (aiGrid[iUserRow][iUserCol] == 1) {
                System.out.println("Game Over!");
                break;

            } else if (aiGrid[iUserRow][iUserCol] == 9) {
                if (iUserRow == 9) {
                    System.out.println("You won!");


                    for (int x = 0; x < aiGrid.length; x++) {
                        for (int y = 0; y < aiGrid[x].length; y++) {
                            if (oRand.nextInt(10) < iWallChance) {
                                aiGrid[x][y] = 1;
                            } else {
                                aiGrid[x][y] = 0;
                            }
                            aiGrid[0][0] = 0;
                        }
                    }
                }
            }
        }

        while(olinkedList.getFirst() != null){
            aiGrid[olinkedList.getFirst().xPosition][olinkedList.getFirst().yPosition]= 40;
            iTotalMovements++;
            oLinkedList.removeHeadNode();
        }
        printGrid(aiGrid);

    }

}

    private static void printGrid(int[][] aiGrid){

        for(int[] oAIGrid: aiGrid){
            for(int NewAIGrid: oAIGrid){
                System.out.println(" "+ NewAIGrid);
            }
            System.out.println();
        }
    }

}