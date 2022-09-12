package p_07_io_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

/**
 * @author xuexuan
 * @date 2022-09-11 14:22:29
 */
public class ChannelCopy {

    private static int CAPACITY = 1024;

    public static void main(String[] args) {
        System.out.println(Paths.get(".").toAbsolutePath());
        String file1 = "src/p_07_io_system/1.txt";
        String file2 = "src/p_07_io_system/2.txt";
        try {
            FileChannel inputChannel = new FileInputStream(file1).getChannel();
            FileChannel outputChannel = new FileOutputStream(file2).getChannel();
            // 方法1： 手动读写
            ByteBuffer byteBuffer = ByteBuffer.allocate(CAPACITY);
            while (inputChannel.read(byteBuffer) != -1) {
                byteBuffer.flip(); // 准备写
                outputChannel.write(byteBuffer);
                byteBuffer.clear(); // 准备读
            }

            // 方法2： transferTo 和 transferFrom
            inputChannel.transferTo(0, inputChannel.size(), outputChannel);
            // 或
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
