package q1.viewImpl;

import q1.behavior.ViewStrategy;

public class ViewPNG implements ViewStrategy {

    @Override
    public void view() {
        System.out.println("Viewing PNG file.");
    }
}
