
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {        
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: this.birdsPerDay) {
            if (birds == 0) return true;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsSum = 0;

        if (numberOfDays > this.birdsPerDay.length) {
            numberOfDays = this.birdsPerDay.length;
        }
         
        for (int i = 0; i < numberOfDays; i++) {
            birdsSum += this.birdsPerDay[i];
        }

        return birdsSum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int birds: this.birdsPerDay) {
            if (birds >= 5) busyDays++;
        }

        return busyDays;
    }
}
