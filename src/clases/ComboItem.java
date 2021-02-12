/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author tavo
 */
public class ComboItem {
    private int value;
    private String label;

    /**
     *
     * @param value
     * @param label
     */
    public ComboItem(int value, String text) {
        this.value = value;
        this.label = text;
    }

    public int getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return label;
    }
}