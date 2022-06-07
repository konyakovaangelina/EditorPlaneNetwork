package com.example.editornetworkplan.Model;


import com.example.editornetworkplan.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.Serializable;

/**
 * Класс для элемента ПК
 */
public class PC extends Element implements Serializable {
    /**
     * Коструктор
     * @param x x
     * @param y y
     * @param id id
     * @param workspace pane
     */
    public PC(double x, double y, int id, Pane workspace) {
        super(x, y, id, workspace);
    }

    /**
     * Функция для отображения зображения
     * @param node ImageView
     */
    @Override
    protected void markSetting(ImageView node)
    {
        super.getContainer().setId(String.valueOf(super.getId()));
        node.setImage(new Image(String.valueOf(Application.class.getResource("img/pc.png"))));
        node.setFitWidth(50);
        node.setFitHeight(50);
        super.getContainer().setLayoutX(super.getX());
        super.getContainer().setLayoutY(super.getY());
    }
}