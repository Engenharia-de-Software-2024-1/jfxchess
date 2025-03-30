/* JerryFX - A Chess Graphical User Interface
 * Copyright (C) 2020 Dominik Klein
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.asdfjkl.jfxchess.gui;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {        
        String dir = System.getProperty("user.home");
        File fDir = new File(dir);
        File file = new File(fDir, "x43890423_jry.lock");
        if (!lockInstance(file.getAbsolutePath())) {
            LOGGER.log(Level.SEVERE, "Another instance of the application is already running.");
            System.exit(1);
        }
        App.main(args);
    }

    private static boolean lockInstance(final String lockFile) {
        final File file = new File(lockFile);    
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
             FileChannel fileChannel = randomAccessFile.getChannel()) {
             
            FileLock fileLock = fileChannel.tryLock();
            if (fileLock == null) {
                return false;
            }
    
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    fileLock.release();
                    Files.deleteIfExists(file.toPath()); 
                } catch (Exception e) {
                    LOGGER.log(Level.SEVERE, "Error releasing file lock!", e);
                }
            }));
            return true;
        } catch (OverlappingFileLockException | IOException e) {
            LOGGER.log(Level.SEVERE, "File is already locked by another process.", e);
            return false;
        }
    }

}
