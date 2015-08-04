package BigBang.element.Page;


import agilesites.annotations.Template;
import agilesites.api.Element;
import agilesites.api.Env;
import agilesites.api.Picker;

/**
 * Created by msciab on 14/06/15.
 */
// xxxx

@Template
public class BbContentLayout implements Element {

    @Override
    public String apply(Env e) {
        Picker p = e.pick("/blueprint/template.html");
        return p.html();
    }
}
