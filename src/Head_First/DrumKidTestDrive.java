package Head_First;

public class DrumKidTestDrive {

    public static void main(String[] args) {

        DrumKid d = new DrumKid();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if(d.snare == true) {
            d.playSnare();
        }

    }
}
