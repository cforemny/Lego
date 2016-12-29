package Magazine;

import Creators.MagazineCreator;
import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class Magazine {
    private List<Element> magazineList;

    public Magazine(List<Element> magazineList) {
        this.magazineList = magazineList;
    }

    public List<Element> getMagazineList() {
        return magazineList;
    }

    public static void showMagazineList(){

        List<Element> magazineList = MagazineCreator.createMagazineList();
        System.out.println("W magazynie mamy nastepujące części:");
        for (Element element : magazineList) {
            System.out.println(element.getElementType() + " " + element.getColor());

        }

    }
}
