package net.bigboo.apollotest;

import net.bigboo.apollo.common.io.FileIO;

/**
 * Created by rao on 16-7-20.
 */
public class FileIOTest {
    public static void main(String[] args) {
        String tmp = "ccc";
        FileIO.f_write("tstFile.txt", tmp);
    }
}
