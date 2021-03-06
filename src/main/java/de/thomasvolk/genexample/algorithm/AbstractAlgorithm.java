/**
 * Copyright (C) 2015 Thomas Volk
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.thomasvolk.genexample.algorithm;

import de.thomasvolk.genexample.model.Passenger;
import de.thomasvolk.genexample.model.Seat;
import de.thomasvolk.genexample.model.Wagon;
import de.thomasvolk.genexample.model.WagonAllocation;

public abstract class AbstractAlgorithm implements Algorithm {
    private final WagonAllocation wagonBelegung;

    public AbstractAlgorithm(WagonAllocation wagonBelegung) {
        this.wagonBelegung = wagonBelegung;
    }

    public Seat[] getSeatList() {
        return wagonBelegung.getSeatList();
    }

    public Passenger[] getPassagierListe() {
        return wagonBelegung.getPassagierListe();
    }

    public WagonAllocation getWagonAllocation() {
        return wagonBelegung;
    }
}
