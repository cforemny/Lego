package Elements;

/**
 * Created by Cyprian on 2016-12-29.
 */
public class Serwo implements Element {


    private ElementType elementType;
    private String color;

    public Serwo(ElementType elementType, String color) {
        this.elementType = elementType;
        this.color = color;
    }

    @Override
    public ElementType getElementType() {
        return elementType;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
