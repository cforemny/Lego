import Analizer.BuildAndMagazineAnalizer;
import Builds.BuildList;
import Creators.BuildCreator;
import Builds.Build;
import Elements.Element;
import Magazine.Magazine;

/**
 * Created by Cyprian on 2016-12-28.
 */
public class mainLego {
    public static void main(String[] args) {

        BuildList buildList = BuildCreator.createBuildList();
        Build build0 = buildList.getBuildList().get(0);
        Build build1 = buildList.getBuildList().get(1);

        BuildList.showBuilds();
        System.out.println();
        Magazine.showMagazineList();
        System.out.println();

        BuildAndMagazineAnalizer buildAndMagazineAnalizer = new BuildAndMagazineAnalizer();
        System.out.println("Sprawdzamy czesci 1 konstrukcji: " + build0.getName());
        buildAndMagazineAnalizer.checkLists(build0);
        System.out.println();
        System.out.println("Sprawdzamy czesci 2 kosntrukcji: " + build1.getName());
        buildAndMagazineAnalizer.checkLists(build1);


    }
}
