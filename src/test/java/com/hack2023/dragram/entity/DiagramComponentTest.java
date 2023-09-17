package com.hack2023.dragram.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class DiagramComponentTest {
    private static Logger log = LoggerFactory.getLogger(DiagramComponentTest.class);

    @Test
    public void testEntity() throws IOException {
        DiagramComponent diagramComponent = new DiagramComponent();
        diagramComponent.setId("id-1");
        diagramComponent.setType("Event");
        diagramComponent.setWidth(50);
        diagramComponent.setHeight(50);
        diagramComponent.setX(450);
        diagramComponent.setY(150);
        diagramComponent.setName("Tim");
        linksTo linksTo = new linksTo();
        linksTo.setTarget("Jim");
        linksTo.setEdited(false);
        Position position = new Position();
        position.setX(0);
        position.setY(0);
        Position position2 = new Position();
        position2.setX(10);
        position2.setY(10);
        linksTo.setPosition(Arrays.asList(position, position2));
        diagramComponent.setLinksTo(Arrays.asList(linksTo));


        ObjectMapper objectMapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        objectMapper.writeValue(sw, diagramComponent);

        log.info(sw.toString());
    }

}
