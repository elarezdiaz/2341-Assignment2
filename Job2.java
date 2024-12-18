public class Job2 implements Comparable<Job2> {
    int id, processingTime, priorityLevel;

    public Job2(int id, int processingTime, int priorityLevel) {
        this.id = id;
        this.processingTime = processingTime;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public int compareTo(Job2 other) {
        if (this.priorityLevel != other.priorityLevel) {
            return this.priorityLevel - other.priorityLevel;
        } else {
            return this.processingTime - other.processingTime;
        }
    }

    public int getId() { return id; }
    public int getProcessingTime() { return processingTime; }
    public int getPriorityLevel() { return priorityLevel; }
}
