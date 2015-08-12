package demo.model.dmparent;

import agilesites.annotations.Attribute;
import agilesites.annotations.FindStartMenu;
import agilesites.annotations.NewStartMenu;
import agilesites.annotations.ParentDefinition;
import demo.model.DmParent;

@FindStartMenu("Find Content Page")
@NewStartMenu("New Content Page")
@ParentDefinition
public class DmGallery extends DmParent {

    @Attribute
    private String categoryString;

    public String getCategoryString() {
        return categoryString;
    }
}
