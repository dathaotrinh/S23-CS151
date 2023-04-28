package q1.fileImpl;

import q1.File;
import q1.viewImpl.ViewPNG;

public class PNGFile extends File {
    public PNGFile() {
        setViewStrategy(new ViewPNG());
    }

}
