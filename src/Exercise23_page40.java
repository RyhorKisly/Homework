/* Создать двухмерный квадратный массив и заолнить его "бабочкой", то есть
таким образом:
 1 1 1 1 1
 0 1 1 1 0
 0 0 1 0 0
 0 1 1 1 0
 1 1 1 1 1     */

public class Exercise23_page40 {
    public static void main(String[] args) {
//                                                           Второй вариант, с возможностью изменять входные данные
            int arrays[][]=new int[11][11];
            int i;
            int j;

            for (i = 0; i < arrays.length / 2 + 1; i++) {
                for (j = 0 ; j < arrays[i].length; j++) {
                    if ((j < i) || (j >= (arrays[i].length - i))) {
                    arrays[i][j] = 0;
                    } else {
                        arrays[i][j] = 1;
                    }
                } // for 2
            } // for 1

            for (i = arrays.length - 1; i >= arrays.length / 2; i--) {
                for (j = 0; j < arrays[i].length; j++){
                    if ((j < (arrays[i].length - 1 - i)) || (j > i)) {
                        arrays[i][j] = 0;
                    } else {
                        arrays[i][j] = 1;
                    }
                } // for 2
            } // for 1

            for (i = 0; i < arrays.length; i++) {
                for (j = 0; j < arrays[i].length; j++){
                    System.out.print(arrays[i][j] + " ");
                }
                System.out.println(" ");
            }

//                                                         Первый вариант без возможности изменять входные данные данные
//        int arrays[][] = new int[5][5];
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                if (i == 0 || i == 4) {
//                    arrays[i][j] = 1;
//                } else if (i == 1 && (j == 0 || j == 4)) {
//                    arrays[i][j] = 0;
//                } else if ((i == 1) && (j >= 1 && j <= 3)) {
//                    arrays[i][j] = 1;
//                } else if (i == 2 && ((j >= 0 && j <= 1) || (j >= 3 && j <= 4))) {
//                    arrays[i][j] = 0;
//                } else if (i == 2 && j == 2) {
//                    arrays[i][j] = 1;
//                } else if (i == 3 && (j == 0 || j == 4)) {
//                    arrays[i][j] = 0;
//                } else if ((i == 3) && (j >= 1 && j <= 3)) {
//                    arrays[i][j] = 1;
//                } else {
//                System.out.println("Something strange");
//                }
//                    System.out.print(arrays[i][j] + " ");
//                }
//                System.out.println(" ");
//            }

    }
}
