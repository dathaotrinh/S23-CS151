package q1.viewImpl;

import q1.behavior.ViewStrategy;

public class ViewGIF implements ViewStrategy {

    @Override
    public void view() {
        System.out.println("Viewing GIF file.");
    }
}
