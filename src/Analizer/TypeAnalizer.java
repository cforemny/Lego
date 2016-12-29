package Analizer;

import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class TypeAnalizer {

    public static boolean isTypeOfBuiltElementSameAsMagazineElement(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (element.getElementType() == buildElement.getElementType()) {
                return true;
            }
        }
        return false;
    }
}
