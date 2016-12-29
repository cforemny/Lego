package Creators;

import Builds.Build;
import Builds.BuildList;
import Elements.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-28.
 */
public class BuildCreator {

    public static BuildList createBuildList() {

        ArrayList<Build> buildList = new ArrayList<>();
        Build firstBuild = new Build("Domek",BuildCreator.createFirstBuild());
        Build secondBuild = new Build("Samochod",BuildCreator.createSecondtBuild());
        buildList.add(firstBuild);
        buildList.add(secondBuild);

        return new BuildList(buildList);

    }

    public static List<Element> createFirstBuild() {

        ArrayList<Element> buildList = new ArrayList<>();

        Serwo serwo0 = new Serwo(ElementType.SERVOMOTOR, "White");
        Brick brick1 = new Brick(ElementType.BRICK, "green");
        Pin pin0 = new Pin(ElementType.PIN, "black");

        buildList.add(serwo0);
        buildList.add(brick1);
        buildList.add(pin0);

        return buildList;


    }

    public static List<Element> createSecondtBuild() {

        ArrayList<Element> buildList = new ArrayList<>();

        Serwo serwo0 = new Serwo(ElementType.SERVOMOTOR, "White");
        Brick brick1 = new Brick(ElementType.CABLE, "green");
        Pin pin0 = new Pin(ElementType.PIN, "brown");

        buildList.add(serwo0);
        buildList.add(brick1);
        buildList.add(pin0);

        return buildList;


    }



}

