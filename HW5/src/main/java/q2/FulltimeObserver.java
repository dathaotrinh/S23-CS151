package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FulltimeObserver implements Observer {
    private List<Job> appliedList;
    private Dashboard dashboard;

    public FulltimeObserver(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.appliedList = new ArrayList<>();
        this.dashboard.registerObserver(this);
    }

    @Override
    public void update(Job job) {
        System.out.println("Fulltime received a new job alert.");
        apply(job);
    }

    @Override
    public void apply(Job job) {
        if(job.getJobType().equals(JobType.FULLTIME)) {
            appliedList.add(job);
        }
    }

    public void showAppliedJobs() {
        System.out.println("List of applied jobs: " + Arrays.toString(appliedList.toArray()));
    }

    public List<Job> getAppliedList() {
        return appliedList;
    }
}
