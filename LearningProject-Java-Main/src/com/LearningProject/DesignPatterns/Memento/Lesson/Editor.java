package com.LearningProject.DesignPatterns.Memento.Lesson;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private List<String> contentHistory = new ArrayList<>();

    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore (EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

    }
}
