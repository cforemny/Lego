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
    List<Element> magazineElement = MagazineCreator.createMagazineList();

    public void checkLists(Build build) {

        for (Element element : build.getElement()) {
            if (ElementsAnalizer.isMagazineHasBuildElements(element, magazineElement)) {
                System.out.println("Jest w magazynie: " + element.getElementType() + " " + element.getColor());
            } else {
                System.out.println("Nie ma w magazynie: " + element.getElementType() + " " + element.getColor());
            }
        }

    }







}
