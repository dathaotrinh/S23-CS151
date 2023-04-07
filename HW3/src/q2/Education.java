package q2;

public class Education {
    private String degree;
    private String major;

    public Education() {
    }

    public Education(String degree, String major) {
        this.degree = degree;
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
