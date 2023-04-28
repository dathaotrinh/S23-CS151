package q1.viewImpl;

import q1.behavior.ViewStrategy;

public class ViewJPEG implements ViewStrategy {

    @Override
    public void view() {
        System.out.println("Viewing JPEG file.");
    }
}
