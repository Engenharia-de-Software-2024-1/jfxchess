package org.asdfjkl.jfxchess.lib;

public class Arrow {

    public int xFrom = 0;
    public int yFrom = 0;
    public int xTo = 0;
    public int yTo = 0;

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Arrow) {
            Arrow other = (Arrow) o;
            if (other.xFrom == xFrom && other.yFrom == yFrom
                    && other.xTo == xTo && other.yTo == yTo) {
                result = true;
            } 
        } 
        return result;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
