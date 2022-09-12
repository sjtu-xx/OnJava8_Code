package p_07_io_system;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author xuexuan
 * @date 2022-09-11 17:16:35
 */
public class LargeMappedFiles {
    static int length = 0x8000000; // 128MB

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile tdat = new RandomAccessFile("test.dat", "rw")) {
            MappedByteBuffer out = tdat.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
            for (int i = 0; i < length; i++) {
                out.put((byte) 'x');
            }

        }
    }
}
