package Builds;

import Creators.BuildCreator;
import Elements.Element;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class BuildList {

    private List<Build> buildList;

    public BuildList(List<Build> buildList) {
        this.buildList = buildList;
    }

    public List<Build> getBuildList() {
        return buildList;
    }

    public static void showBuilds(){

        for (Build build : BuildCreator.createBuildList().getBuildList() ) {
            System.out.println(build.getName() + " wymaga do zbudowania:");
            for (Element element : build.getElement() ) {
                System.out.println(element.getElementType() + " " + element.getColor());

            }



        }
    }
}
