package org.asdfjkl.jfxchess.lib;

public class ColoredField {

    public int x = 0;
    public int y = 0;

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof ColoredField) {
            ColoredField other = (ColoredField) o;
            if(other.x == x && other.y == y) {
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
