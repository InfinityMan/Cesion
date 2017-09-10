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
public class Product {
    
    private double unitsNeed;
    
    private String name;
    
    private double price;

    public Product(double unitsNeed, String name, double price) {
        this.unitsNeed = unitsNeed;
        this.name = name;
        this.price = price;
    }

    /**
     * Get the value of unitsNeed
     *
     * @return the value of unitsNeed
     */
    public double getUnitsNeed() {
        return unitsNeed;
    }

    /**
     * Set the value of unitsNeed
     *
     * @param unitsNeed new value of unitsNeed
     */
    public void setUnitsNeed(double unitsNeed) {
        this.unitsNeed = unitsNeed;
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

    
}
