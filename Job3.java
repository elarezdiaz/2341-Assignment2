public class Job3 implements Comparable<Job3>{
    int id, processingTime, arrivalTime;

    public Job3(int id, int processingTime, int arrivalTime) {
        this.id = id;
        this.processingTime = processingTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int compareTo(Job3 other) {
        if (this.arrivalTime != other.arrivalTime) {
            return this.arrivalTime - other.arrivalTime;
        } else {
            return this.processingTime - other.processingTime;
        }
    }

    public int getId() { return id; }
    public int getProcessingTime() { return processingTime; }
    public int getArrivalTime() { return arrivalTime; }
}
