package grump;

import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ExamplesMain {

    public static void main(String[] args) throws Exception {
        
        
        File sketchDir = new File("src/test/resources/grump/example");

        Files.walkFileTree(sketchDir.toPath(), new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                final JustPrintTheErrors errorListener = new JustPrintTheErrors();
                
                if (file.toString().endsWith(".grump")) {
                    try (FileInputStream in = new FileInputStream(file.toFile())) {
                        GrumPLexer lexer = new GrumPLexer(new ANTLRInputStream(in));
                        GrumPParser parser = new GrumPParser(new CommonTokenStream(lexer));

                        parser.addParseListener(new GrumPParseTree());
                        parser.addErrorListener(new ConsoleErrorListener());
                        
                        parser.addErrorListener(errorListener);
                        System.out.println(file);
                        parser.grump();
                        System.out.println(errorListener.isError() ? "error": "");
                        System.out.println();
                    }
                }
                
                return errorListener.isError() ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
            }
        });


    }

}
