package org.asdfjkl.jfxchess.gui;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;

public class Util {

    public static String getRandomFilename() {

        Date date = new Date();
        long timeInMilliseconds = date.getTime();
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(timeInMilliseconds);
        byte[] seed = buffer.array();
        SecureRandom random = new SecureRandom(seed);

        String filename = "";
        for(int i=0;i<8;i++) {
            char c = (char) (random.nextInt(26) + 97);
            filename += c;
        }

        return filename + ".tmp";
    }

}
