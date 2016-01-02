/**
 * 
 */
package hu.infokristaly.homework.taglibs.front;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author pzoli
 *  http://stackoverflow.com/questions/10778068/what-is-the-real-conceptual-difference-between-uidecorate-and-uiinclude
 */
@Named
@SessionScoped
public class PanelBean implements Serializable {

    private static final long serialVersionUID = -3973680363412718751L;
    
    private String input = "Enter value here";

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public void defaultBeanValue() {
        input = "Default bean value";
    }
}
