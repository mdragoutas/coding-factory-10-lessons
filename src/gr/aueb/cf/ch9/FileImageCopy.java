package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Αντιγράφει μία εικόνα από ένα αρχείο σε ένα άλλο
 */
public class FileImageCopy {

    public static void main(String[] args) {
        Path source = Path.of("C:/Users/User/Desktop/ΕΓΩ");
        Path targer = Path.of("C:");
    }

    public static void copyImage(Path sourcepath, Path destPath) {
        try (var sourceStream = Files.newInputStream(sourcepath);
            var targetStream = Files.newOutputStream(destPath)) {
            sourceStream.transferTo(targetStream);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
    }
}
