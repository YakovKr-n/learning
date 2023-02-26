package luah_kefel;
public class multiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
                int num = multiplicationTable[i][j];
                if (i < 1) {
                    System.out.print(num + "    ");
                } else if (i < 2 && j > 4) {
                    System.out.print(num + "   ");
                } else if ((i < 2 && j < 4) || (i < 3 && j < 3)){
                    System.out.print(num + "    ");
                } else if ((i < 4 && j < 2) || (i < 5 && j < 1)) {
                    System.out.print(num + "    ");
                } else if (i < 9 && j == 0) {
                    System.out.print(num + "    ");
                } else {
                    System.out.print(num + "   ");
                }
            }
            System.out.println();
        }

    }}
