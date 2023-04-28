package q1.viewImpl;

import q1.behavior.ViewStrategy;

public class ViewJPG implements ViewStrategy {

    @Override
    public void view() {
        System.out.println("Viewing JPG file.");
    }
}
