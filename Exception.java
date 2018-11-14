import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Exception {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Надя\\Desktop\\new_directory";
        File directory = new File(path);
        if (!directory.exists()) {
            try {
                Files.createDirectory(Paths.get(path));
                System.out.println("Каталог new_directory создан. Полный путь к катологу: " + directory);
            } catch (AccessDeniedException e) {
                System.out.println("У Вас нет доступа к этому катологу.");
            }
        }
        else {
            System.out.printf("Каталог new_directory по адресу %s уже существует", directory);
        }
    }
}