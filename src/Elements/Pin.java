package Elements;

/**
 * Created by Cyprian on 2016-12-28.
 */
public class Pin implements Element {

    private ElementType elementType;
    private String color;

    public Pin(ElementType elementType, String color) {
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
