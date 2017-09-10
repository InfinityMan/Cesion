/*
 * Copyright (C) 2017 Dmig
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ru.dmig.cesion.logic;

/**
 *
 * @author Dmig
 */
public class Producer {

    private double price;
    private double speed;
    
    private short length;
    private short width;

    private String name;

    public Producer(double price, double speed, short length, short width, String name) {
        if(price >= 0 && speed > 0 && length >= 0 && width >= 0) {
            this.price = price;
            this.speed = speed;
            this.length = length;
            this.width = width;
            this.name = name;
        } else throw new IllegalArgumentException();
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the value of speed
     *
     * @return the value of speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Set the value of speed
     *
     * @param speed new value of speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public short getLength() {
        return length;
    }

    /**
     * Set the value of length
     *
     * @param length new value of length
     */
    public void setLength(short length) {
        if(length > 0) {
            this.length = length;
        } else throw new IllegalArgumentException();
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public short getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(short width) {
        if(width > 0) {
            this.width = width;
        } else throw new IllegalArgumentException();
    }
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
