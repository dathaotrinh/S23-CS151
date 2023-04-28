package q2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DashboardTest {
    Dashboard dashboard;
    InternObserver intern;
    FulltimeObserver fulltime;
    @Before
    public void init() {
        dashboard = new Dashboard();
        intern = new InternObserver(dashboard);
        fulltime = new FulltimeObserver(dashboard);
    }

    @Test
    public void testOneNewFullTimeJobAdded() {
        Job newJob = new Job("Software Engineer Associate", "Sunnyvale", JobType.FULLTIME, 70.9);
        dashboard.setNewJob(newJob);
        Assert.assertEquals(0, intern.getAppliedList().size());
        Assert.assertEquals(1, fulltime.getAppliedList().size());
    }

    @Test
    public void testOneNewInternJobAdded() {
        Job newJob = new Job("Software Engineer Intern", "Mountain View", JobType.INTERNSHIP, 50.9);
        dashboard.setNewJob(newJob);
        Assert.assertEquals(1, intern.getAppliedList().size());
        Assert.assertEquals(0, fulltime.getAppliedList().size());
    }

    @Test
    public void testTwoJobsAdded() {
        Job newJob1 = new Job("Software Engineer Associate", "Sunnyvale", JobType.FULLTIME, 70.9);
        Job newJob2 = new Job("Software Engineer Intern", "Mountain View", JobType.INTERNSHIP, 50.9);
        dashboard.setNewJob(newJob1);
        dashboard.setNewJob(newJob2);
        Assert.assertEquals(1, intern.getAppliedList().size());
        Assert.assertEquals(1, fulltime.getAppliedList().size());
    }
}
