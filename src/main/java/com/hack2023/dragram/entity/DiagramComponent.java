package com.hack2023.dragram.entity;

import java.util.List;

public class DiagramComponent {

    private String id;
    private String type;
    private int width;
    private int height;

    private int x;
    private int y;
    private String name;
    private List<linksTo> linksTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<linksTo> getLinksTo() {
        return linksTo;
    }

    public void setLinksTo(List<linksTo> linksTo) {
        this.linksTo = linksTo;
    }
}
