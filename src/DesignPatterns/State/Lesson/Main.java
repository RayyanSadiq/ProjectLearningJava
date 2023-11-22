package DesignPatterns.State.Lesson;

public class Main { // the open closed principle means that our classes should be open for extension but closed for modification
    // we can add new classes but we should not modify existing classes
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();


    }
}
