import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class T3Scheduler {
    public static void main(String[] args) {

        // list will be used to determine which jobs go out
        List<Job3> jobExecutionOrder = new ArrayList<>();

        PriorityQueue<Job3> queue = new PriorityQueue<>(10);

        int jobCount = 0;
        int currentTime = 0;
        int totalCompletionTime = 0;

        // adding jobs to the queue in arrival order
        while (!StdIn.isEmpty()) {
            int jobId = StdIn.readInt();
            int processingTime = StdIn.readInt();
            int arrivalTime = StdIn.readInt();

            jobExecutionOrder.add(new Job3(jobId, processingTime, arrivalTime));
            jobCount++;
        }

        jobExecutionOrder.sort(new Comparator<Job3>() {
            @Override
            public int compare(Job3 j1, Job3 j2) {
                return Integer.compare(j1.getArrivalTime(), j2.getArrivalTime());
            }
        });

        for (int i = 0; i < jobExecutionOrder.get(jobExecutionOrder.size()-1).getArrivalTime(); i++) {

            for (Job3 job : jobExecutionOrder) {
                if (job.arrivalTime == currentTime) {
                    queue.insert(job);
                }
            }
        }
        // double for most accurate calculations with decimal if necessary
        double averageCompletionTime = (double) totalCompletionTime / jobCount;

        // printing array list will print brackets by default
        System.out.println("Execution order: " + jobExecutionOrder);
        System.out.println("Average completion time: " + averageCompletionTime);
    }
}
