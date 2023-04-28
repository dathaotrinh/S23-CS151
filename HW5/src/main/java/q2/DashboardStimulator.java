package q2;

public class DashboardStimulator {

    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        InternObserver intern = new InternObserver(dashboard);
        FulltimeObserver fulltime = new FulltimeObserver(dashboard);

        Job newJob1 = new Job("Software Engineer Associate", "Sunnyvale", JobType.FULLTIME, 70.9);
        dashboard.setNewJob(newJob1);

        intern.showAppliedJobs();
        fulltime.showAppliedJobs();


        Job newJob2 = new Job("Software Engineer Intern", "Mountain View", JobType.INTERNSHIP, 50.9);
        dashboard.setNewJob(newJob2);

        intern.showAppliedJobs();
        fulltime.showAppliedJobs();

        Job newJob3 = new Job("Software Engineer Intern", "Mountain View", JobType.INTERNSHIP, 50.9);
        dashboard.setNewJob(newJob3);

        intern.showAppliedJobs();
        fulltime.showAppliedJobs();

    }
}
