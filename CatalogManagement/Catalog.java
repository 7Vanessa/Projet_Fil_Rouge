package CatalogManagement;

import java.util.List;

public class Catalog {
    private int catalogId;
    private String catalogName;
    private List<Field> fieldsList;

    public Catalog(int catalogId, String catalogName, List<Field> fieldsList) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.fieldsList = fieldsList;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public List<Field> getFieldsList() {
        return fieldsList;
    }

    public void setFieldsList(List<Field> fieldsList) {
        this.fieldsList = fieldsList;
    }

    public String toString() {
        String fieldsString = "";
        for (Field field:fieldsList) {
            fieldsString += field.toString() + '\n';
        }
        return "Catalog n°" + catalogId + ": " + catalogName + '\n' + "Fields list of this catalog: " + fieldsString;
    }

}
