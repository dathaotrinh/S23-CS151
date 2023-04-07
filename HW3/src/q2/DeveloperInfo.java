package q2;

public interface DeveloperInfo {
    int DEV_MONTHLY_SALARY = 15000;
    int INTERN_MONTHLY_HOURS_WORKED = 150;
    int STOCKS_PER_MONTH = 2000;

    default String name() {
        return "A";
    }
}
