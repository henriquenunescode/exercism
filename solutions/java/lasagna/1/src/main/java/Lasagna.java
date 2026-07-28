public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int realTime) {
        int totalTime = expectedMinutesInOven() - realTime;
        return totalTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int addedLayers) {
        int minutesToPrepare = addedLayers * 2;
        return minutesToPrepare;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberLayers) + minutesInOven;
    }
    
}
