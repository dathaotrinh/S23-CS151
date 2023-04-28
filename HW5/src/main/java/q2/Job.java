package q2;

public class Job {
    private String jobTitle;
    private String location;
    private JobType jobType;
    private double hourlyPay;

    public Job(String jobTitle, String location, JobType jobType, double hourlyPay) {
        this.jobTitle = jobTitle;
        this.location = location;
        this.jobType = jobType;
        this.hourlyPay = hourlyPay;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", location='" + location + '\'' +
                ", jobType=" + jobType +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}
