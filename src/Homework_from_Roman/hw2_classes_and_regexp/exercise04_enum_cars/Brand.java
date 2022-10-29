// Задача 4:
// Необходимо реализовать класс Car,  который имеет поля марка и цвет.
//
// Марки имеют следующие цвета:
// Audi - Синий. Красный. Зеленый
// BMW - Оранжевый. Черный. Фиолетовый
// KIA -  Желтый. Cерый. Белый
//
// Ожидается метод который изметяет цвет.
// Как параметр принимает строку, если цвет не верный
// то ничего не изменяет.
//
//package Homework_from_Roman.hw2.exercise04;

package Homework_from_Roman.hw2_classes_and_regexp.exercise04_enum_cars;

public enum Brand {

    AUDI(new Color[]{Color.BLUE, Color.RED, Color.GREEN}),
    BMW(new Color[]{Color.ORANGE, Color.BLACK, Color.VIOLET}),
    KIA(new Color[]{Color.YELLOW, Color.GREY, Color.WHITE});

    private final Color[] colors;

    Brand(Color[] colors) {
        this.colors = colors;
    }

    public Color[] getColors() {
        return colors;
    }

}
