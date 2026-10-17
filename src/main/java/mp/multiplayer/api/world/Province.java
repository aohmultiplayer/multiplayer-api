/*
 * Copyright (C) 2026 Aohmultiplayer contributors
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package mp.multiplayer.api.world;

import java.util.List;

public interface Province {
    int getId();
    String getName();

    int getOwnerId();
    void setOwner(int id);
    boolean isSea();
    boolean isWasteland();
    void setWasteland(boolean wasteland);

    int getPopulation();
    void setPopulation(int count);
    int getEconomy();
    void setEconomy(int count);
    int getDevelopment();
    int getHappiness();
    void setHappiness(boolean happy);
    int getValue(); //Game.getProvinceValue
    int getGrowthRate();

    int getArmy();
    void setArmy(int size);
    void addArmy(int count);
    boolean moveArmy(int toProvId, int units);

    boolean hasBuildings(String type);
    void addBuilding(String type);
    void removeBuilding(String type);
    int getPortLevel();

    List<Integer> getProvinceCores();
    void addCore(int civId);
    void removeCire(int civId);

    List<Integer> getNeighbours();
    List<Integer> getSeaNeighbours();
    boolean bordersWith(int provId);
    boolean isCapital();
    String getTerrain();
    int getContinentId();
    int getRegionId();
}
