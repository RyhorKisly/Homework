// Задача 2:
// Задача с классом Box.
// Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
// 1) Куб (Все стороны равны).
// 2) Обычная коробка.
// 3) Конверт (Есть только длинна и ширина).
//
//Задача 10:
//Используя класс Box из задания 2, необходимо
//добавить в него конструктор который принимает строку вида:
//
//Box[1,2,3] или Box[2] или Box[1,2]
//
//И как результат создает соответствующий обьект.

        package Homework_from_Roman.hw2_classes_and_regexp.exercise02_and_exercise10_boxesENum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Box {

    private int x;
    private int y;
    private int z;
    private Type type;
    private static final String BOX_REGEXP = "Box\\[(\\d+)(,(\\d+)(,(\\d+))?)?]";
    private static final Pattern PATTERN = Pattern.compile(BOX_REGEXP);

    public Box(int x) {
        this.x = this.y = this.z = x;
        this.type = Type.CUBE;
    }

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        this.type = Type.ENVELOPE;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = Type.BOX;
    }

    public Box(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.find()) {
            this.x = Integer.parseInt(matcher.group(1));
            if (matcher.group(3) != null) {
                this.y = Integer.parseInt(matcher.group(3));
                if (matcher.group(5) != null) {
                    this.z = Integer.parseInt(matcher.group(5));

                }
            }
        }
    }
}
