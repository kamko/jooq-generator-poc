import java.nio.file.Files;
import java.nio.file.Path;

import org.jooq.codegen.GenerationTool;

public class JooqGen {
    public static void main(String[] args) throws Exception {
        var str = Files.readString(Path.of("./jooq-gen-conf.xml"));
        GenerationTool.generate(str);
    }
}
