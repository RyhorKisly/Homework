package Homework_from_Roman.hw4.factories.factoryBMW;

import Homework_from_Roman.hw4.brand.BMW;
import Homework_from_Roman.hw4.brand.Car;
import Homework_from_Roman.hw4.brand.enums.Option;
import Homework_from_Roman.hw4.brand.enums.colours.Colour;
import Homework_from_Roman.hw4.brand.enums.colours.ColourBMW;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolume;
import Homework_from_Roman.hw4.brand.enums.engineVolumes.EngineVolumeBMW;
import Homework_from_Roman.hw4.brand.enums.models.Model;
import Homework_from_Roman.hw4.brand.enums.models.ModelBMW;
import Homework_from_Roman.hw4.brand.enums.uniqueFields.FuelType;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSize;
import Homework_from_Roman.hw4.brand.enums.wheelSizes.WheelSizeBMW;
import Homework_from_Roman.hw4.factories.Storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StorageBMW extends Storage {

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
            if (verifyModelEngine(temp, model, engineVolume)) {
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
                    continue;
                }
                if (temp.getFuelType() == fuelType && bmw.getFuelType() != fuelType) {
                    iterator.remove();
                    removed.add(bmw);
                    bmw = temp;
                }
            }
        }
        bmws.addAll(removed);
        System.out.println("Осталось машин на складе: ");
        for(BMW element : bmws){
            System.out.println(element);
        }
        return bmw;
    }

    private boolean verifyModelEngine(BMW bmw, ModelBMW model, EngineVolumeBMW engineVolume) {
        return bmw.getModel() == model && bmw.getEngineVolume() == engineVolume;
    }

}
