package q1.fileImpl;

import q1.File;
import q1.viewImpl.ViewJPEG;

public class JPEGFile extends File {
    public JPEGFile() {
        setViewStrategy(new ViewJPEG());
    }




}
