package Analizer;

import Creators.MagazineCreator;
import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class ElementsAnalizer {


    public static boolean isMagazineHasBuildElements(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (ClassAnalizer.isClassOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) &&
                    ColorAnalizer.isColorOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) &&
                    TypeAnalizer.isTypeOfBuiltElementSameAsMagazineElement(buildElement,magazineElement))  {
                return true;
            }
        }
        return false;
    }
}
