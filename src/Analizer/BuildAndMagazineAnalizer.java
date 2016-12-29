package Analizer;

import Builds.Build;
import Creators.MagazineCreator;
import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class BuildAndMagazineAnalizer {

    public BuildAndMagazineAnalizer() {
    }

    public void checkLists(Build build) {

        for (Element element : build.getElement()) {
            if (isMagazineHasBuildElements(element, MagazineCreator.createMagazineList())) {
                System.out.println("Jest w magazynie: " + element.getElementType() + " " + element.getColor());
            } else {
                System.out.println("Nie ma w magazynie: " + element.getElementType() + " " + element.getColor());
            }
        }

    }

    private boolean isMagazineHasBuildElements(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (isClassOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) && isColorOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) && isTypeOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) ) {
                return true;
            }
        }
        return false;
    }


    private boolean isClassOfBuiltElementSameAsMagazineElement(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (element.getClass().equals(buildElement.getClass()) ) {
                return true;
            }
        }
        return false;
    }
    private boolean isTypeOfBuiltElementSameAsMagazineElement(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (element.getElementType() == buildElement.getElementType()) {
                return true;
            }
        }
        return false;
    }
    private boolean isColorOfBuiltElementSameAsMagazineElement(Element buildElement, List<Element> magazineElement) {
        for (Element element : magazineElement) {
            if (element.getColor().equals(buildElement.getColor())) {
                return true;
            }
        }
        return false;
    }
}
