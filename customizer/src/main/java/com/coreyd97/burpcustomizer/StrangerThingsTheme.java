package com.coreyd97.burpcustomizer;

import com.formdev.flatlaf.IntelliJTheme;
import java.io.IOException;
import java.io.InputStream;

public class StrangerThingsTheme extends IntelliJTheme.ThemeLaf {
    public StrangerThingsTheme() {
        super(loadTheme());
    }

    private static IntelliJTheme loadTheme() {
        try (InputStream is = StrangerThingsTheme.class.getResourceAsStream("/StrangerThings.theme.json")) {
            if (is == null) {
                throw new RuntimeException("Theme file not found: /StrangerThings.theme.json");
            }
            return new IntelliJTheme(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
