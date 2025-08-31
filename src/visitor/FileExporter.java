package visitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileExporter {

    /**
     * Writes generated code to a file with the given type (css, html, js).
     *
     * @param code     The generated code as a string
     * @param fileType The type of file: "css", "html", or "js"
     */
    public static void exportToFile(String code, String fileType) {
        // Ensure lowercase type
        String type = fileType.toLowerCase();

        // Validate allowed file types
        if (!type.equals("css") && !type.equals("html") && !type.equals("js")) {
            throw new IllegalArgumentException("Unsupported file type: " + fileType);
        }

        File dir = new File("generated");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String fileName = "generated/output_" + timestamp + "." + type;

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(code);
            System.out.println("✅ Code written to " + fileName);
        } catch (IOException e) {
            System.err.println("❌ Failed to write file: " + e.getMessage());
        }
    }
}
