package q1.common;

import q1.behavior.ViewStrategy;
import q1.viewImpl.ViewGIF;
import q1.viewImpl.ViewJPEG;
import q1.viewImpl.ViewJPG;
import q1.viewImpl.ViewPNG;

public class Common {
    public static ViewStrategy checkFile(FileType fileType) {
        if (fileType.equals(FileType.PNG)) {
            return new ViewPNG();
        } else if (fileType.equals(FileType.JPG)) {
            return new ViewJPG();
        } else if (fileType.equals(FileType.GIF)) {
            return new ViewGIF();
        } else {
            return new ViewJPEG();
        }
    }
}
