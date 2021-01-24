package org.dynmap.worldguard;

import java.util.Comparator;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;

public class RegionComparator implements Comparator<ProtectedRegion> {
    @Override
    public int compare(ProtectedRegion o1, ProtectedRegion o2) {
        // This is inverted because the list gets processed in reverse order,
        // saves us a Collections.reverse() call
        return -Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
