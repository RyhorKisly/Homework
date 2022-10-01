public class Arrays_example {
    public static void main(String[] args) {

//        int marks[] = new int [20];
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = (int) (Math.random() * 10 + 1);
//        }
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("Ученик № " + i + " = " + marks[i]);
//        }
//
//        int maxMark = marks[0];
//        for (int i = 0; i < marks.length; i++) {
//            if (maxMark < marks[i]) {
//                maxMark = marks[i];
//            }
//        }
//        System.out.println("Максимальная оценка = " + maxMark);
//
//    }
//}

//        int m[][] = new int [5][];
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m.length; j++) {
//                m[i][j] = 1;
//                System.out.print(m[i][j] + " ");
//            } //for 2
//            System.out.println("");
//        } // for 1

//        int[][] matrix = new int[3][];
//        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
//        matrix[1] = new int[]{1, 2, 3};
//        matrix[2] = new int[]{1};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++)
//                System.out.print( matrix[i][j] + " " );
//            System.out.println();
//        }

        int[][] matrix = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
