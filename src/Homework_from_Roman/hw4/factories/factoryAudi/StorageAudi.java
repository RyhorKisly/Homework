package Homework_from_Roman.hw4.factories.factoryAudi;

import Homework_from_Roman.hw4.cars.Audi;
import Homework_from_Roman.hw4.enums.Option;
import Homework_from_Roman.hw4.enums.enumAudi.ColourAudi;
import Homework_from_Roman.hw4.enums.enumAudi.EngineVolumeAudi;
import Homework_from_Roman.hw4.enums.enumAudi.ModelAudi;
import Homework_from_Roman.hw4.enums.enumAudi.Transmission;
import Homework_from_Roman.hw4.enums.enumAudi.WheelSizeAudi;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StorageAudi extends Storage {

    private final List<Audi> audies = new ArrayList<>();

    public void addCarToStorage(Audi audi) {
        audies.add(audi);
    }

    public Audi getCarFromStorage(ModelAudi model, EngineVolumeAudi engineVolume, ColourAudi colour, WheelSizeAudi wheelSize, Set<Option> option, Transmission transmission) {
        Iterator<Audi> iterator = audies.listIterator();
        List<Audi> removed = new ArrayList<>();
        Audi audi = null;
        while (iterator.hasNext()) {
            Audi temp = iterator.next();
            if (verifyModelEngine(temp, model, engineVolume, transmission)) {
                if (audi == null) {
                    audi = temp;
                    iterator.remove();
                    continue;
                }
                if (temp.getColor() == colour && audi.getColor() != colour) {
                    iterator.remove();
                    removed.add(audi);
                    audi = temp;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && audi.getWheelSize() != wheelSize) {
                    iterator.remove();
                    removed.add(audi);
                    audi = temp;
                    continue;
                }
                if (temp.getOption().equals(option) && !audi.getOption().equals(option)) {
                    iterator.remove();
                    removed.add(audi);
                    audi = temp;
                }
            }
        }
        audies.addAll(removed);
        System.out.println("Осталось машин Audi на складе: ");
        for(Audi element : audies){
            System.out.println(element);
        }
        return audi;
    }

    private boolean verifyModelEngine(Audi audi, ModelAudi model, EngineVolumeAudi engineVolume, Transmission transmission) {
        return audi.getModel() == model && audi.getEngineVolume() == engineVolume && audi.getTransmission() == transmission;
    }

}
