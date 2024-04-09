package com.Droid7X.DesignPatterns.State.Lesson;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
       currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }







    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
