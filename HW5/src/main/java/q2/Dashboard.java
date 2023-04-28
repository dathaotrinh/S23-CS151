package q2;

import java.util.ArrayList;
import java.util.List;

public class Dashboard implements Subject{
    private List<Observer> observerList;
    private Job job;

    public Dashboard() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :
                observerList) {
            observer.update(job);
        }
    }

    public void setNewJob(Job job) {
        this.job = job;
        notifyObservers();
    }
}
