package Elements;

/**
 * Created by Cyprian on 2016-12-28.
 */
public class Label implements Element{

    private ElementType elementType;
    private String color;

    public Label(ElementType elementType, String color) {
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
