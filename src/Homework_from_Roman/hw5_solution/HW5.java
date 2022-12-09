package Homework_from_Roman.hw5_solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW5 {



    public static void main(String[] args) throws IOException, ClassNotFoundException {


        // Необходимо реализовать программу, которая будет считывать
        // строки, введенные пользователем и выводить их в консоль.
//        try (BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in))) {
//            while (true) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.err.println("Can`t read lines from console.");
//        }





















        // Необходимо реализовать программу, которая будет считывать
        // числа, введенные пользователем, пока пользователь не введет
        // "стоп" слово. После чего программа выведет среднее из всех
        // введенных значений.
//        try (BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in))) {
//            int count = 0;
//            double sum = 0d;
//
//            System.out.println("Type an numbers, to stop type: 'stop'.");
//            while (true) {
//                Integer temp = readNumberOrStopCommand(
//                        br,  false, "stop");
//                if (temp == null) {
//                    System.out.println("Middle number is: " + sum / count);
//                    return;
//                }
//                sum += temp;
//                count++;
//            }
//        } catch (IOException e){
//            System.err.println("Can`t read lines from console.");
//        }


















        // Необходимо реализовать программу, которая будет считывать
        // числа, введенные пользователем, пока пользователь не введет
        // "стоп" слово, по команде "статус" необходимо вывести введенные
        // цифры в отсортированном виде.
//        List<Double> result = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in))) {
//            System.out.println("Type an numbers, to stop type: 'stop'.");
//            while (true) {
//                Double temp = readNumberOrStopOrStatusCommand(
//                        br, "status", "stop");
//                if (temp == null) {
//                    Collections.sort(result);
//                    System.out.println("Current list is: " + result);
//                    continue;
//                }
//                result.add(temp);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }





















        // Необходимо реализовать программу "калькулятор".
        // Поддерживаемые операции +-/* выбор операции и ввод данных
        // осуществляется пользователем с клавиатуры.
//        try (BufferedReader rd = new BufferedReader(
//                new InputStreamReader(System.in))) {
//            System.out.println("Write first number:");
//            Integer x = readNumberOrStopCommand(rd, false, null);
//            if (x == null) {
//                return;
//            }
//            System.out.println("Write second number:");
//            Integer y = readNumberOrStopCommand(rd, false, null);
//            if (y == null) {
//                return;
//            }
//
//            switch (readOperation(rd)) {
//                case "+": {
//                    System.out.println("Результат: " + (x + y));
//                    break;
//                }
//                case "-": {
//                    System.out.println("Результат: " + (x - y));
//                    break;
//                }
//                case "*": {
//                    System.out.println("Результат: " + (x * y));
//                    break;
//                }
//                case "/": {
//                    if (y == 0) {
//                        throw  new ArithmeticException("Division by/0");
//                    }
//                    System.out.println("Результат: " + ((double) x / y));
//                    break;
//                }
//                default: {
//                    throw  new IllegalArgumentException();
//                }
//            }
//        } catch (IOException | ArithmeticException e) {
//            e.printStackTrace();
//        }





























        // Необходимо написать программу по умножению двух матриц.
        // Пользователь вводит матрицы с клавиатуры.
//        try (BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in))) {
//            System.out.println("Write n: ");
//            Integer n = readNumberOrStopCommand(br, true, null);
//            int[][] result = sumMatrix(readMatrix(br, n), readMatrix(br, n), n);
//            printMatrix(result);
//        } catch (IOException | NullPointerException e) {
//            System.err.println("Can`t read lines from console.");
//        }






















        // Задача #5, но матрицы необходимо считывать из файла (INPUT).
//        2
//        1 2
//        3 4
//
//        4 5
//        6 7
//        List<String> lines = Files.readAllLines(Paths.get("PATH_TO_FILE"));
//        int n = Integer.parseInt(lines.remove(0));
//        int[][] a = readMatrixFromList(n, lines);
//        lines.remove(0);
//        int[][] b = readMatrixFromList(n, lines);
//        int[][] result = sumMatrix(a, b, n);
//        printMatrix(result);
















        // Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
        // строки из первого, но в обратном порядке (первая строка должна быть
        // последней).
//        try {
//            List<String> lines = Files.readAllLines(Paths.get("FILE_NAME"));
//            Collections.reverse(lines);
//            Files.write(Paths.get("PATH_TO_FILE"), lines);
//        } catch (IOException e) {
//            System.err.println("Unexpected error.");
//        }




































        // Имеется два файла (INPUT_1.txt и INPUT_2.txt). В третий (OUTPUT.txt) необходимо
        // записать только те строки, которые есть и в первом, и во втором.
//        try {
//            List<String> first = Files.readAllLines(Paths.get("PATH_TO_FILE"));
//            first.retainAll(Files.readAllLines(Paths.get("PATH_TO_FILE")));
//            Files.write(Paths.get("PATH_TO_FILE"), new HashSet<>(first));
//        } catch (IOException e) {
//            System.err.println("Unexpected error.");
//        }









//        Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\autpa\\java_core\\src\\com\\roman\\lis\\hw\\HW5");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        List<Box> boxes = createBoxes(5);
//        oos.writeObject(boxes);
//        oos.close();


//        Десериализовать объекты из задания #9. Отсортировать их по объёму.
//        Вывести на экран. Записать в файл (OUTPUT) самый большой объем.
//        FileInputStream fis = new FileInputStream("PATH_TO_FILE");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        List<Box> boxesRead = (List<Box>) ois.readObject();
//        Collections.sort(boxesRead);
//        System.out.println(boxesRead);
//
//        Files.write(
//            Paths.get("PATH_TO_FILE"),
//            String.valueOf(boxesRead.get(boxesRead.size() - 1).getVolume()).getBytes()
//        );
//        ois.close();


    }












    private static Integer readNumberOrStopCommand(BufferedReader reader,
                                                   boolean positiveOnly,
                                                   String stop) throws IOException {
        while (true) {
            try {
                String line = reader.readLine();
                if (stop != null && stop.equalsIgnoreCase(line)) {
                    return null;
                }
                int num = Integer.parseInt(line);
                if (positiveOnly && num < 0) {
                    System.out.println("Number should be positive");
                    continue;
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please write valid number:");
            }
        }
    }

    private static int[][] readMatrix(BufferedReader reader, Integer n) throws IOException {
        if (n == null) {
            throw new IllegalArgumentException("matrix size can not be null.");
        }
        int[][] matrix = new int[n][n];
        System.out.println("Fill matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Write [" + i + "][" + j + "]:");
                Integer number = readNumberOrStopCommand(
                        reader, false, null);
                if (number == null) {
                    throw new NullPointerException("Number can not be null.");
                }
                matrix[i][j] = number;
            }
        }
        return matrix;
    }

    private static int[][] sumMatrix(int[][] one, int[][] two, Integer n) {
        if (one == null || two == null || n == null) {
            throw new IllegalArgumentException("Passed params invalid");
        }
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = one[i][j] + two[i][j];
            }
        }
        return matrix;
    }



    public static void printMatrix(int[][] result) {
        System.out.println("Result:");
        for (int[] row : result) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }



    public static Double readNumberOrStopOrStatusCommand(BufferedReader reader, String status, String stop) throws IOException {
        while (true) {
            try {
                String str = reader.readLine();
                if (status != null && status.equalsIgnoreCase(str)) {
                    return null;
                }
                if (stop != null && stop.equalsIgnoreCase(str)) {
                    System.exit(0);
                }
                return Double.parseDouble(str);
            } catch (NumberFormatException e) {
                System.out.println("Please write valid number:");
            }
        }
    }



    public static int[][] readMatrixFromList(int n, List<String> lines) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] row = lines.remove(0).split(" ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(row[j]);
            }
        }
        return a;
    }







        public static String readOperation(BufferedReader reader) throws IOException {
            System.out.println("Write a valid operator:");
            while (true) {
                String str = reader.readLine();
                if (str.equals("+") || str.equals("/") || str.equals("*") || str.equals("-")) {
                    return str;
                }
                System.out.println("Write a valid operator:");
            }
        }


        public static List<Box> createBoxes(int cont) {
            Random random = new Random();
            List<Box> boxes = new ArrayList<>();
            for (int i = 0; i < cont; i++) {
                boxes.add(
                    new Box(
                        random.nextInt(5),
                        random.nextInt(5),
                        random.nextInt(5)
                    )
                );
            }
            return boxes;
        }


}



