package example;

/**
 * Created by ly on 12/21/2017.
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Index {

    private StringProperty term;
    private StringProperty path;

    public Index(String term, String path) {
        this.term = new SimpleStringProperty(term);
        this.path = new SimpleStringProperty(path);
    }

    public Index() {}

    public String getTerm() {
        return term.get();
    }

    public void setTerm(String term) {
        this.term.set(term);
    }

    public String  getPath() {
        return path.get();
    }

    public void setPath(String path) {
        this.path.set(path);
    }

}
