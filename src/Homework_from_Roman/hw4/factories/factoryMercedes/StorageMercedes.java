package Homework_from_Roman.hw4.factories.factoryMercedes;

import Homework_from_Roman.hw4.brand.Mercedes;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.colours.ColourMercedes;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolumeMercedes;
import Homework_from_Roman.hw4.brand.enums.models.ModelMercedes;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.FuelType;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.WheelDrive;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSizeMercedes;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StorageMercedes extends Storage {

    private final List<Mercedes> mercedeses = new ArrayList<>();

    public void addCarToStorage(Mercedes mercedes) {
        mercedeses.add(mercedes);
    }

    public Mercedes getCarFromStorage(ModelMercedes model, EngineVolumeMercedes engineVolume, ColourMercedes colour, WheelSizeMercedes wheelSize, Set<Option> option, WheelDrive wheelDrive) {
        Iterator<Mercedes> iterator = mercedeses.listIterator();
        List<Mercedes> removed = new ArrayList<>();
        Mercedes mercedes = null;
        while (iterator.hasNext()) {
            Mercedes temp = iterator.next();
            if (verifyModelEngine(temp, model, engineVolume)) {
                if (mercedes == null) {
                    mercedes = temp;
                    iterator.remove();
                    continue;
                }
                if (temp.getColor() == colour && mercedes.getColor() != colour) {
                    iterator.remove();
                    removed.add(mercedes);
                    mercedes = temp;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && mercedes.getWheelSize() != wheelSize) {
                    iterator.remove();
                    removed.add(mercedes);
                    mercedes = temp;
                    continue;
                }
                if (temp.getOption().equals(option) && !mercedes.getOption().equals(option)) {
                    iterator.remove();
                    removed.add(mercedes);
                    mercedes = temp;
                    continue;
                }
                if (temp.getWheelDrive().equals(wheelDrive) && !mercedes.getWheelDrive().equals(wheelDrive)) {
                    iterator.remove();
                    removed.add(mercedes);
                    mercedes = temp;
                }
            }
        }
        mercedeses.addAll(removed);
        System.out.println("Осталось машин Mercedes на складе: ");
        for(Mercedes element : mercedeses){
            System.out.println(element);
        }
        return mercedes;
    }

    private boolean verifyModelEngine(Mercedes mercedes, ModelMercedes model, EngineVolumeMercedes engineVolume) {
        return mercedes.getModel() == model && mercedes.getEngineVolume() == engineVolume;
    }

}
