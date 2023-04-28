package q1;

import q1.common.FileType;
import q1.fileImpl.JPEGFile;

public class PicasaStimulator {

    public static void main(String[] args) {
        File file = new JPEGFile();
        file.performView();
        file.performConvert(FileType.PNG);
        file.performView();
    }

}
