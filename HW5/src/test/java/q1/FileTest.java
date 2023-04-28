package q1;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import q1.common.FileType;
import q1.fileImpl.GIFFile;
import q1.fileImpl.JPEGFile;
import q1.fileImpl.JPGFile;
import q1.fileImpl.PNGFile;
import q1.viewImpl.ViewGIF;
import q1.viewImpl.ViewJPEG;
import q1.viewImpl.ViewJPG;
import q1.viewImpl.ViewPNG;

public class FileTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Test
    public void testPerformViewJPEGFile() {
        File file = new JPEGFile();
        file.performView();
        String expectedPrint = "Viewing JPEG file.";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
    }

    @Test
    public void testPerformViewJPGFile() {
        File file = new JPGFile();
        file.performView();
        String expectedPrint = "Viewing JPG file.";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
    }

    @Test
    public void testPerformViewGIFFile() {
        File file = new GIFFile();
        file.performView();
        String expectedPrint = "Viewing GIF file.";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
    }

    @Test
    public void testPerformViewPNGFile() {
        File file = new PNGFile();
        file.performView();
        String expectedPrint = "Viewing PNG file.";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
    }

    @Test
    public void testPerformConvertPNGToJPGFile() {
        File file = new PNGFile();
        file.performConvert(FileType.JPG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewJPG);
    }

    @Test()
    public void testPerformConvertGIFToJPGFile() {
        File file = new GIFFile();
        file.performConvert(FileType.JPG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewJPG);
    }

    @Test()
    public void testPerformConvertJPEGToJPGFile() {
        File file = new JPGFile();
        file.performConvert(FileType.JPG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewJPG);
    }

    @Test
    public void testPerformConvertPNGToJPEGFile() {
        File file = new PNGFile();
        file.performConvert(FileType.JPEG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewJPEG);
    }

    @Test()
    public void testPerformConvertGIFToJPEGFile() {
        File file = new GIFFile();
        file.performConvert(FileType.JPEG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewJPEG);
    }

    @Test()
    public void testPerformConvertJPGToJPEGFile() {
        File file = new JPGFile();
        file.performConvert(FileType.JPEG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewJPEG);
    }

    @Test
    public void testPerformConvertPNGToGIFFile() {
        File file = new PNGFile();
        file.performConvert(FileType.GIF);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewGIF);
    }

    @Test()
    public void testPerformConvertJPEGToGIFFile() {
        File file = new JPEGFile();
        file.performConvert(FileType.GIF);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewGIF);
    }

    @Test()
    public void testPerformConvertJPGToGIFFile() {
        File file = new JPGFile();
        file.performConvert(FileType.GIF);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewGIF);
    }


    @Test
    public void testPerformConvertGIFToPNGFile() {
        File file = new GIFFile();
        file.performConvert(FileType.PNG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewPNG);
    }

    @Test()
    public void testPerformConvertJPEGToPNGFile() {
        File file = new JPEGFile();
        file.performConvert(FileType.PNG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewPNG);
    }

    @Test()
    public void testPerformConvertJPGToPNGFile() {
        File file = new JPGFile();
        file.performConvert(FileType.PNG);
        String expectedPrint = "Converting...\nDone!";
        Assert.assertEquals(expectedPrint, systemOutRule.getLog()
                .trim());
        Assert.assertTrue(file.getViewStrategy() instanceof ViewPNG);
    }
}
