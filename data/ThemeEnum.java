package data;

public enum ThemeEnum {
    THEME_1(1, "Theme1", 1),
    THEME_2(2, "Theme2", 1),
    THEME_3(3, "Theme3", 1),
    THEME_4(4, "Theme4", 2),
    THEME_5(5, "Theme5", 2),
    THEME_6(6, "Theme6", 3),
    THEME_7(7, "Theme7", 4),
    THEME_8(8, "Theme8", 5);

    private final int themeID;
    private final String themeName;
    private final int fieldID;

    ThemeEnum(int themeID, String themeName, int fieldID) {
        this.themeID = themeID;
        this.themeName = themeName;
        this.fieldID = fieldID;
    }

    public int getThemeID() {
        return themeID;
    }

    public String getThemeName() {
        return themeName;
    }

    public int getFieldID() {
        return fieldID;
    }
}
