package Analizer;

import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class ColorAnalizer {

    public static boolean isColorOfBuiltElementSameAsMagazineElement(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (element.getColor().equals(buildElement.getColor())) {
                return true;
            }
        }
        return false;
    }
}
