package demo.model.page;

import agilesites.annotations.*;
import demo.model.Page;

@FindStartMenu("Find Content Page")
@NewStartMenu("New Content Page")
@ContentDefinition
public class DmSection extends Page {

    @Attribute(required = true)
    private String title;

    @Attribute(required = true, editor = "DmRichTextEditor")
    private String subtitle;

    @Attribute
    private String summary;

    @Attribute(editor = "DmRichTextEditor")
    private String detail;

    @Attribute
    private BlobAttribute image;

    @Attribute
    private String[] teaserTitle;

    @Attribute
    private String[] teaserText;

    @Attribute(multiple = true)
    private AssetAttribute<Page>[] related;

    @Attribute(multiple = true)
    private AssetAttribute<Page>[] seeAlso;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getSummary() {
        return summary;
    }

    public String getDetail() {
        return detail;
    }

    public BlobAttribute getImage() {
        return image;
    }

    public String[] getTeaserTitle() {
        return teaserTitle;
    }

    public String[] getTeaserText() {
        return teaserText;
    }

    public String getTeaserTitle(int n) {
        if (n < teaserTitle.length) return "";
        return teaserTitle[n];
    }


    public String getTeaserText(int n) {
        if (n < teaserText.length) return "";
        return teaserTitle[n];
    }

    public AssetAttribute<Page>[] getRelated() {
        return related;
    }


    public AssetAttribute<Page>[] getSeeAlso() {
        return seeAlso;
    }
}
