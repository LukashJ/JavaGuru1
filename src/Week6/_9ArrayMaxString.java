package Week6;


public class _9ArrayMaxString {

    public static void main(String[] args) {
        int[][] myArray = new int[][]{
                {0, 1, 1, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}
        };

        int maxStringNumber = 0;
        int maxSymbolQty = 1;
        int symbolCounter = 1;

        for (int j = 0; j < myArray.length; j++) {
            for (int i = 0; i < myArray[j].length - 1; i++) {
                if (myArray[j][i] == myArray[j][i + 1]) {
                    symbolCounter = symbolCounter + 1;
                } else if (symbolCounter > maxSymbolQty) {
                    maxSymbolQty = symbolCounter;
                    maxStringNumber = j;
                    symbolCounter = 1;
                }
            }
        }

        System.out.println("Строка с наибольшей последовательностью одинаковых символов:");
        for (int i = 0; i < myArray[maxStringNumber].length; i++) {
            System.out.print(myArray[maxStringNumber][i] + " ,");

        }
    }
}