package Creators;

import Elements.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-28.
 */
public class MagazineCreator {

    private List<Element> elementList;

    public static List<Element> createMagazineList(){

        ArrayList<Element> magzineList = new ArrayList<>();

        Brick brick0 = new Brick(ElementType.BRICK,"red");
        Brick brick1 = new Brick(ElementType.BRICK,"green");
        Pin pin0 = new Pin(ElementType.PIN,"black");
        Pin pin1 = new Pin(ElementType.PIN,"blue");
        Label label0 = new Label(ElementType.LABEL,"white");
        Label label1 = new Label(ElementType.LABEL,"yellow");

        magzineList.add(brick0);
        magzineList.add(brick1);
        magzineList.add(pin0);
        magzineList.add(pin1);
        magzineList.add(label0);
        magzineList.add(label1);

        return magzineList;

    }


}
