import java.util.ArrayList;
import java.util.List;

public class T2Scheduler {
    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue<>(10);

        int jobCount = 0;
        int totalTime = 0;

        // reading jobs to the queue in the static order
        while (!StdIn.isEmpty()) {
            int jobId = StdIn.readInt();
            int processingTime = StdIn.readInt();
            int priorityLevel = StdIn.readInt();
            queue.insert(new Job2(jobId, processingTime, priorityLevel));
            jobCount++;
        }

        // list will be used to determine which jobs go out
        List<Integer> jobExecutionOrder = new ArrayList<>();
        int totalCompletionTime = 0;

        // loops until no more jobs
        while (!queue.isEmpty()) {
            Job2 job = (Job2) queue.remove();
            totalCompletionTime += job.getProcessingTime();
            totalTime += totalCompletionTime;
            jobExecutionOrder.add(job.getId());
        }

//        StdOut.print("Execution order: " + jobExecutionOrder);

        // double for most accurate calculations with decimal if necessary
        double averageCompletionTime = (double) totalCompletionTime / jobCount;

        // printing array list will print brackets by default
        StdOut.println("Execution order: " + jobExecutionOrder);
        StdOut.println("Average completion time: " + averageCompletionTime);
    }
}
