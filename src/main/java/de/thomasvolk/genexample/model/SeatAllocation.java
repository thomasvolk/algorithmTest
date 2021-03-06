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
package de.thomasvolk.genexample.model;

public class SeatAllocation {
    private final Seat sitzplatz;
    private final Passenger passagier;

    public SeatAllocation(Seat sitzplatz, Passenger passagier) {
        this.sitzplatz = sitzplatz;
        this.passagier = passagier;
    }

    public double getHappinessFaktor() {
        if(getPassagier().getMaximaleHappiness() == 0) {
            return -1;
        }
        else {
            return ((double) getHappiness()) / ((double) getPassagier().getMaximaleHappiness());
        }
    }

    public int getHappiness() {
        int value = 0;
        if(sitzplatz.isCabin()) {
            value += passagier.getRequest().getCabin();
        }
        if(sitzplatz.isFenster()) {
            value += passagier.getRequest().getWindowSeat();
        }
        if(sitzplatz.isInFahrtrichtung()) {
            value += passagier.getRequest().getDrivingDirection();
        }
        return value;
    }

    public Seat getSitzplatz() {
        return sitzplatz;
    }

    public Passenger getPassagier() {
        return passagier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeatAllocation that = (SeatAllocation) o;

        return sitzplatz.equals(that.sitzplatz);

    }

    @Override
    public int hashCode() {
        return sitzplatz.hashCode();
    }

    @Override
    public String toString() {
        return "SitzplatzVergabe{" +
                "sitzplatz=" + sitzplatz.getNumber() +
                ", passagier=" + passagier.getId() +
                ", happiness=" + getHappiness() +
                '}';
    }
}
