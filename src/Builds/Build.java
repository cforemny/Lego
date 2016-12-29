package Builds;

import Creators.BuildCreator;
import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class Build {

    private String name;
    private List<Element> element;

    public Build(String name, List<Element> element) {
        this.name = name;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public List<Element> getElement() {
        return element;
    }


}
