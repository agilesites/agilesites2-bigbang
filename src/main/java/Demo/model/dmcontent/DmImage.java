package demo.model.dmcontent;

import agilesites.annotations.*;
import demo.model.DmContent;

@NewStartMenu("New Image")
@FindStartMenu("Find Image")
@ContentDefinition
public class DmImage extends DmContent {

    @Attribute("Large Image")
    private BlobAttribute largeImage;

    @Attribute("Medium Image")
    private BlobAttribute mediumImage;

    @Attribute("Small Image")
    private BlobAttribute smallImage;

    @Attribute("Alt Text Image")
    private String altTextImageString;

    public BlobAttribute getLargeImage() {
        return largeImage;
    }

    public BlobAttribute getMediumImage() {
        return mediumImage;
    }

    public BlobAttribute getSmallImage() {
        return smallImage;
    }

    public String getAltTextImageString() {
        return altTextImageString;
    }
}
