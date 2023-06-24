package CatalogManagement;

import java.util.List;

public class Field {
    private int fieldId;
    private int catalogId;
    private String fieldName;
    private List<Theme> themeList;

    public Field(int fieldId, int catalogId, String fieldName, List<Theme> themeList) {
        this.fieldId = fieldId;
        this.catalogId = catalogId;
        this.fieldName = fieldName;
        this.themeList = themeList;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<Theme> getThemeList() {
        return themeList;
    }

    public void setThemeList(List<Theme> themeList) {
        this.themeList = themeList;
    }

    public String toString() {
        String themesString = "";
        for (Theme theme : themeList) {
            themesString += theme.toString() + '\n';
        }
        return "Field n°" + fieldId + ": " + fieldName + '\n' + "Theme list of this field: " + themesString;
    }
}
