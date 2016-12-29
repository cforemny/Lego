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
            if (ClassAnalizer.isClassOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) &&
                    ColorAnalizer.isColorOfBuiltElementSameAsMagazineElement(buildElement,magazineElement) &&
                        TypeAnalizer.isTypeOfBuiltElementSameAsMagazineElement(buildElement,magazineElement))  {
                return true;
            }
        }
        return false;
    }





}
