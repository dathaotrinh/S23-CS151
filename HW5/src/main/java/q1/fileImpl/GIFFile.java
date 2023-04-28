package q1.fileImpl;

import q1.File;
import q1.viewImpl.ViewGIF;

public class GIFFile extends File {
    public GIFFile() {
        setViewStrategy(new ViewGIF());
    }
}
