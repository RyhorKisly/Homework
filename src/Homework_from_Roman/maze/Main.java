package Homework_from_Roman.maze;

public class Main {
    
    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 1, 1},
                {0, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 0, 1}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 0) {
                    if(array[i][j + 1] != 1){

                    }
                    if(array[i][j - 1] != 1){

                    }
                    if(array[i + 1][j] != 1 && i != array.length){

                    }
                    if(array[i - 1][j] != 1 && i != 0){

                    }
                }
            }
        }

    }
}
