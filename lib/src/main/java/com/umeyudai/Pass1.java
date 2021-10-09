package com.umeyudai;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pass1 {

    public static void main(String[] args) {
        Path p1 = Paths.get("text/note.txt");
        Path p2 = Paths.get("books");
        Path p3 = Paths.get("books/pdf/ref.pdf");
        Path p4 = Paths.get("hello.html");
        try {
            Files.createFile(p4);
            Files.createDirectory(Paths.get("html"));

            Files.move(p4, Paths.get("html/hello.html"));
            System.out.println(Paths.get("").toAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}