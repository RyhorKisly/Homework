//        Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
//        Создать несколько объектов-цветов.
//        Собрать букет и определить его стоимость.
//        Определить все цвета, используемые в букете.
//        Определить когда весь букет завянет.
//        В букет может входить несколько цветов одного типа.

package Homework_from_Roman.extra.inheritance.exerciseSixFlowers;

public class Main {


        public static void main(String[] args) {

                OrdinaryRose ordinaryRose1 = new OrdinaryRose("Роза обыкновенная", Color.RED,
                        8, 7);
                OrdinaryRose ordinaryRose2 = new OrdinaryRose("Роза обыкновенная", Color.RED,
                        7, 8);
                OrdinaryRose ordinaryRose3 = new OrdinaryRose("Роза обыкновенная", Color.RED,
                        9, 8);
                SprayRoses sprayRoses = new SprayRoses("Кустовая роза", Color.PINK,
                        15,14, 6);
                Carnation carnation = new Carnation("Гвоздика", Color.WHITE,
                        5, 14);

                Bouquet bouquet = new Bouquet(ordinaryRose1, ordinaryRose2, ordinaryRose3,
                        sprayRoses, carnation);

                bouquet.sumOfCost();
                bouquet.fullSetOfColors();
                bouquet.dateOfDeath();


        }
}
