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

public interface War {
    int declareWar(int aggressor, int defender);
    void makePeace(int civA, int civB);
    boolean areAtWar(int a, int b);
    boolean isAtPeace(int civId);

    int getWarsCount();
    int getWarId(int civA, int civB);
    List<Integer> getEnemies(int civ);
    List<Integer> getAllies(int civ);

    void transferProvince(int fromCiv, int toCiv, int provId);
    void releaseVassalAsPeace(int overlord, String newTag, List<Integer> provinces);
    void demandTribute(int winner, int loser);
}
