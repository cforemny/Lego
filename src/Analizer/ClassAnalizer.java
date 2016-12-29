package Analizer;

import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class ClassAnalizer {

    public static boolean isClassOfBuiltElementSameAsMagazineElement(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (element.getClass().equals(buildElement.getClass()) ) {
                return true;
            }
        }
        return false;
    }
}
