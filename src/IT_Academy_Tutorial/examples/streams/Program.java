package IT_Academy_Tutorial.examples.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple",450),
                new Phone2("Nokia 9", "HMD Global",150),
                new Phone2("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));

    }
}
class PhoneComparator implements Comparator<Phone2> {

    public int compare(Phone2 a, Phone2 b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}