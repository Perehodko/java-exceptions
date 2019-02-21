//Перехват и обработка исключения, с использованием конструкции try-catch.
//Проверяется наличие директории, если она не существует, то создается директория и выводится сообщение
//"Каталог new_directory создан. Полный путь к катологу: /home/nper/Desktop/new_directory",
//если недостаточно прав для доступа к катологу, то выводится сообщение "У Вас нет доступа к этому катологу."
//Если директория существует, то выводится сообщение "Каталог new_directory по адресу /home/nper/Desktop/new_directory
//уже существует".

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Exception {
    public static void main(String[] args) throws IOException {
        String path = "/home/nper/Desktop/new_directory";
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