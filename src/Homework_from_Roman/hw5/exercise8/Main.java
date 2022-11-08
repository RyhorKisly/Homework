//        8
//        Имеется два файла (INPUT_1 и INPUT_2). В третий (OUTPUT) необходимо
//        записать только те строки, которые есть и в первом, и во втором.

package Homework_from_Roman.hw5.exercise8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mover mover = new Mover();

        List<String> lines1 = mover.readListFormInPut("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
                "Homework_from_Roman\\hw5\\exercise8\\INPUT_1");
        List<String> lines2 = mover.readListFormInPut("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
                "Homework_from_Roman\\hw5\\exercise8\\INPUT_2");

        mover.writeReverseListToOutPut("C:\\Users\\Workstation\\IdeaProjects\\Homework\\src\\" +
                "Homework_from_Roman\\hw5\\exercise8\\OUTPUT", lines1, lines2);


    }

}
