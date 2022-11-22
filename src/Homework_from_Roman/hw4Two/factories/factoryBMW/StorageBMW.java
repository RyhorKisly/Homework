package Homework_from_Roman.hw4Two.factories.factoryBMW;

import Homework_from_Roman.hw4Two.brand.BMW;
import Homework_from_Roman.hw4Two.brand.enums.Option;
import Homework_from_Roman.hw4Two.brand.enums.enumBMW.*;
import Homework_from_Roman.hw4Two.factories.Storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StorageBMW<T, C, M, W, E> extends Storage {

    private final List<BMW> bmws = new ArrayList<>();

    public void addCarToStorage(BMW bmw) {
        bmws.add(bmw);
    }

    public BMW getCarFromStorage(ModelBMW model, EngineVolumeBMW engineVolume, ColourBMW colour, WheelSizeBMW wheelSize, Set<Option> option, FuelType fuelType) {
        Iterator<BMW> iterator = bmws.listIterator();
        List<BMW> removed = new ArrayList<>();
        BMW bmw = null;
        while (iterator.hasNext()) {
            BMW temp = iterator.next();
            if (verifyModelEngine(temp, model, engineVolume, fuelType)) {
                if (bmw == null) {
                    bmw = temp;
                    iterator.remove();
                    continue;
                }
                if (temp.getColor() == colour && bmw.getColor() != colour) {
                    iterator.remove();
                    removed.add(bmw);
                    bmw = temp;
                    continue;
                }
                if (temp.getWheelSize() == wheelSize && bmw.getWheelSize() != wheelSize) {
                    iterator.remove();
                    removed.add(bmw);
                    bmw = temp;
                    continue;
                }
                if (temp.getOption().equals(option) && !bmw.getOption().equals(option)) {
                    iterator.remove();
                    removed.add(bmw);
                    bmw = temp;
                }
            }
        }
        bmws.addAll(removed);
        System.out.println("Осталось машин BMW на складе: ");
        for(BMW element : bmws){
            System.out.println(element);
        }
        return bmw;
    }

    private boolean verifyModelEngine(BMW bmw, ModelBMW model, EngineVolumeBMW engineVolume, FuelType fuelType) {
        return bmw.getModel() == model && bmw.getEngineVolume() == engineVolume && bmw.getFuelType() == fuelType;
    }

}
