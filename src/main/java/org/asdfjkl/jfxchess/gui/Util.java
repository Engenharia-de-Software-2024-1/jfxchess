package org.asdfjkl.jfxchess.gui;

import java.security.SecureRandom;

public class Util {

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static String getRandomFilename() {

        StringBuilder filename = new StringBuilder();
        for(int i=0;i<8;i++) {
            char c = (char) (SECURE_RANDOM.nextInt(26) + 97);
            filename.append(c);
        }

        return filename.append(".tmp").toString();
    }

}
