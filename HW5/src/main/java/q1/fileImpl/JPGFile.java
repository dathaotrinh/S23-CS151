package q1.fileImpl;

import q1.File;
import q1.viewImpl.ViewJPG;

public class JPGFile extends File {
    public JPGFile() {
        setViewStrategy(new ViewJPG());
    }

}
