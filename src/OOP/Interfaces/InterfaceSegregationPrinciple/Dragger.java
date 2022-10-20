package OOP.Interfaces.InterfaceSegregationPrinciple;

public class Dragger {

    public void drag (UIWidget widget) {
        widget.drag();
        System.out.println("dragging done");
    }
}
