package com.hack2023.dragram.entity;

import java.util.List;

public class linksTo {
    String target;
    boolean edited;
    List<Position> points;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public boolean getEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public boolean isEdited() {
        return edited;
    }

    public List<Position> getPosition() {
        return points;
    }

    public void setPosition(List<Position> points) {
        this.points = points;
    }
}
