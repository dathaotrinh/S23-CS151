package q1;

import q1.behavior.ViewStrategy;
import q1.common.Common;
import q1.common.FileType;

public abstract class File {
    private ViewStrategy viewStrategy;

    public void performView() {
        viewStrategy.view();
    }

    public void performConvert(FileType fileType) {
        System.out.println("Converting...");
        setViewStrategy(Common.checkFile(fileType));
        System.out.println("Done!");
    }

    public void setViewStrategy(ViewStrategy viewStrategy) {
        this.viewStrategy = viewStrategy;
    }

    public ViewStrategy getViewStrategy() {
        return viewStrategy;
    }
}
