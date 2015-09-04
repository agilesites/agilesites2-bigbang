package demo.model.dmparent;

import agilesites.annotations.*;
import demo.model.DmParent;

@FindStartMenu("Find Content Page")
@NewStartMenu("New Content Page")
@ParentDefinition
@Parent("DmGallery")
public class DmFolder extends DmParent {

    @Attribute
    @Required
    private String categoryString;

    @Attribute
    private String testAttribute;

    public String getCategoryString() {
        return categoryString;
    }
}
