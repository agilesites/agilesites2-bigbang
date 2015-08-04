package BigBang.element;

import agilesites.annotations.CSElement;
import agilesites.annotations.SiteEntry;
import agilesites.api.Asset;
import agilesites.api.Env;
import agilesites.api.Element;

@SiteEntry
@CSElement
public class BbWrapper implements Element {
    public String apply(Env e) {
        Asset a = e.getAsset();
        return a.call(a.getTemplate());
    }
}
