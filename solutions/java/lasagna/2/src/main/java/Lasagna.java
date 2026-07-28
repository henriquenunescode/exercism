public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int realTime) {
        int totalTime = expectedMinutesInOven() - realTime;
        return totalTime;
    }

    public int preparationTimeInMinutes(int addedLayers) {
        int minutesToPrepare = addedLayers * 2;
        return minutesToPrepare;
    }
    
    public int totalTimeInMinutes(int numberLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberLayers) + minutesInOven;
    }
    
}
