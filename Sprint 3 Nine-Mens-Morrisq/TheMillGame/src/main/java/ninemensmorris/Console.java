package ninemensmorris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Board nmmBoard = new Board();
        while(true) {
            Movement move = new Movement();
            printBoard(nmmBoard.boardPositionValues);

            // Ingresar movimiento en notación algebraica
            System.out.print("\nIngresa movimiento: ");
            String str = reader.readLine();
            int y = -'a' + str.replaceAll(".*([a-g]).*", "$1").charAt(0) ;
            int x = 7 - Integer.parseInt(str.replaceAll(".*([1-7]).*", "$1"));
            nmmBoard.boardPositionValues[x][y] = 1;
        }

    }

    public static void printBoard(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("" + (7-i) + "\t");
            for (int j = 0; j < matrix[0].length; j++) {
                String value = matrix[i][j] == -1 ? " " : ""+matrix[i][j];
                System.out.print("" + value + "\t");
            }
            System.out.println();
        }
        System.out.print("\ta\tb\tc\td\te\tf\tg");
    }
}
