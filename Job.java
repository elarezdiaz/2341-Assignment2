public class Job implements Comparable<Job> {
    int id, processingTime;

    public Job(int id, int processingTime) {
        this.id = id;
        this.processingTime = processingTime;
    }

    @Override
    public int compareTo(Job other) {
        return 0;
    }

    public int getId() { return id; }
    public int getProcessingTime() { return processingTime; }
//    public void setProcessingTime(int processingTime) { this.processingTime = processingTime; }
//    public void setId(int id) { this.id = id; }
//    public void setPriorityLevel(int priorityLevel) { this.priorityLevel = priorityLevel; }
}
