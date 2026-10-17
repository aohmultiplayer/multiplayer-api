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

public interface Diplomacy {
    float getRelations(int civA, int civB);
    void setRelations(int civA, int civB, float rel);
    void improveRelations(int civA, int civB, int amount);

    boolean hasNonAggressionPact(int civA, int civB);
    void setNonAggressionPact(int civA, int civB, int turns);
    boolean hasDefensivePact(int civA, int civB);
    int getTruce(int civA, int civB);
    void setTruce(int civA, int civB, int turns);
    boolean hasMilitaryAccess(int civA, int civB);
    boolean hasGuarantee(int civA, int civB);

    void makeVassal(int vassalId, int overlordId);
    void createAlliance(String name, List<Integer> civIds);
    void disbandAlliance(int allianceId);
    boolean areAllied(int a, int b);


}
