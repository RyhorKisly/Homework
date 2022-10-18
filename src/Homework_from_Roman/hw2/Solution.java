package Homework_from_Roman.hw2;


public class Solution {

//    Задача 1:
//    Задача с месяцами года.
//
//    Необходимо реализовоть класс который имеет два метода:
//        1) определить номер месяца по имени.
//        2) определить имя месяца по номеру.
//    public enum Month {
//        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4),
//        MAY(5), JUNE(6), JULY(7), AUGUST(8),
//        SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
//
//        private final Integer number;
//
//        Month(int number) {
//            this.number = number;
//        }
//
//        public static String nameByNumber(int number) {
//            Month[] months = Month.values();
//            for (Month m : months) {
//                if (number == m.number) {
//                    return m.name();
//                }
//            }
//            return null;
//        }
//
//        public static Integer numberByName(String name) {
//            Month[] months = Month.values();
//            for (Month m : months) {
//                if (m.name().equalsIgnoreCase(name)) {
//                    return m.number;
//                }
//            }
//            return null;
//        }
//    }











//    Задача 2:
//    Задача с классом Box.
//    Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
//        1) Куб (Все стороны равны).
//        2) Обычная коробка.
//        3) Конверт (Есть только длинна и ширина).
//    public enum Type {
//        CUBE,ENVELOPE,BOX
//    }
//    public class Box {
//        private int x, y, z;
//        private Type type;
//
//        public Box(int x) {
//            this.x = this.y = this.z = x;
//            type = Type.CUBE;
//        }
//        public Box(int x, int y) {
//            this.x = x; this.y = y;
//            type = Type.ENVELOPE;
//        }
//        public Box(int x, int y, int z) {
//            this.x = x; this.y = y; this.z = z;
//            type = Type.BOX;
//        }
//
//        public Type getType() {
//            return type;
//        }
//    }












//    Задача 3:
//    Необходимо создать класс который имеет метод чтобы накапливать 5 последних переданных
//    в него цифровых значений. Так же необходимо создать метод который выводит
//    среднее из накопленных значений.
//    public static class Consumer {
//        private final Integer[] array;
//        private int index = 0;
//
//        public Consumer(int count) {
//            this.array = new Integer[count];
//        }
//
//        public void consume(int number) {
//            array[index] = number;
//            if (index == 4) {
//                index = 0;
//            } else {
//                index++;
//            }
//        }
//        public double avg() {
//            double sum = 0;
//            int count = 0;
//            for (Integer j : array) {
//                if (j != null) {
//                    sum += j;
//                    count++;
//                }
//            }
//            return sum / count;
//        }
//    }















//    Задача 4:
//    Необходимо реализовать класс Car,  который имеет поля марка и цвет.
//
//    Марки имеют следующие цвета:
//    Audi - Синий. Красный. Зеленый
//    BMW - Оранжевый. Черный. Фиолетовый
//    KIA -  Желтый. Cерый. Белый
//    Ожидается метод который изметяет цвет.
//    Как параметр принимает строку, если цвет не верный
//    то ничего не изменяет.
//    public enum Color {
//        BLUE, RED
//    }
//    public enum Brand {
//        AUDI(new Color[]{Color.BLUE, Color.RED}),
//        BMW(new Color[]{Color.RED});
//        private final Color[] colors;
//        Brand(Color[] colors) {
//            this.colors = colors;
//        }
//        public Color[] getColors() {
//            return colors;
//        }
//    }
//    public class Car {
//        private Brand brand;
//        private Color color;
//
//        public Car(Brand brand, Color color) {
//            this.brand = brand;
//            for (Color c : brand.getColors()) {
//                if (c == color) {
//                    this.color = color;
//                    break;
//                }
//            }
//        }
//        public void setColor(String newColor) {
//            for (Color col : brand.getColors()) {
//                if (col.name().equals(newColor.toUpperCase())) {
//                    color = col;
//                }
//            }
//        }
//        public Brand getBrand() {
//            return brand;
//        }
//        public Color getColor() {
//            return color;
//        }
//
//    }













//    Задача 5:
//    Необходимо посчитать колличество слов в строке в которых буква
//    "с" встречается 3 и более раз.
//    public static void main(String[] args) {
//        int count = 0;
//        String str = "ссСр сс, сссc";
//        Pattern pattern = Pattern.compile("\\b((\\S*[Сс]\\S*){3})\\b");
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()) {
//            count++;
//        }
//        System.out.println(count);
//    }















//    Задача 6:
//    Необходимо найти самое длинное слово в строке.
//    public static void main(String[] args) {
//        String str = "Это предложение, в котором нужно найти самое длинное слово";
//        Pattern pattern = Pattern.compile("[А-Яа-я_\\-0-9]*");
//        Matcher matcher = pattern.matcher(str);
//        if (matcher.find()) {
//            int start = matcher.start();
//            int end = matcher.end();
//            while (matcher.find()) {
//                if (matcher.end() - matcher.start() > end - start) {
//                    start = matcher.start();
//                    end = matcher.end();
//                }
//            }
//            System.out.println(str.substring(start, end));
//        }
//    }

















//    Задача 7:
//    Необходимо узнать есть ли в строке слова которые начинаются
//    и заканчиваются на букву "а".
//    public static void main(String[] args) {
//        String str = "анапа, аа, а АНАНАСИНА, африка";
//        Pattern pat = Pattern.compile("\\b[Аа][А-Яа-я]*[Аа]*\\b|\\b[Аа]\\b");
//        Matcher mat = pat.matcher(str);
//        System.out.println(mat.find());
//    }


















//    Задача 8:
//    Необходимо извлечь из строки и распечатать номер карты
//        (XXXX-XXXX-XXXX-XXXX) если он там есть.
//    public static void main(String[] args) {
//        String str = "Ваша карта N (2589-7859-7458-8521) активна";
//        Pattern pattern = Pattern.compile("\\b(\\d{4}-){3}\\d{4}\\b");
//        Matcher matcher = pattern.matcher(str);
//        if (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//    }














//    Задача 9:
//    Реализовать программу которая проверит содержит ли строка некое слово, и если да то
//    напечатает индекс первого символа данного слова.
//    public static void main(String[] args) {
//        String str = "А есть ли слово";
//        String word = "Слово";
//        Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//        Matcher matcher = pattern.matcher(str);
//        System.out.println(matcher.find());
//    }









//    Задача 10:
//    Используя класс Box из задания 2, необходимо
//    добавить в него конструктор который принимает строку вида:
//    Box[1,2,3] или Box[2] или Box[1,2]
//
//    И как результат создает соответствующий обьект.
//    public static class Box {
//        private static final String BOX_REGEXP = "Box\\[(\\d)(,(\\d)(,(\\d))?)?]";
//        private static final Pattern PATTERN = Pattern.compile(BOX_REGEXP);
//
//        private int x, y, z;
//        public Box(String str) {
//            Matcher matcher = PATTERN.matcher(str);
//            if (matcher.find()) {
//                this.x = Integer.parseInt(matcher.group(1));
//                if (matcher.group(3) != null) {
//                    this.y = Integer.parseInt(matcher.group(3));
//                    if (matcher.group(5) != null) {
//                        this.z = Integer.parseInt(matcher.group(5));
//                    }
//                }
//            }
//        }
//    }
















































































































//    Pattern pattern = Pattern.compile("(^|\\s)*([а-я_0-9-&&[^сС]]*[сС][а-я_0-9-&&[^сС]]*){3}");
}
