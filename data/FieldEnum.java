package data;

public enum FieldEnum {
    FIELD_1(1, "Field1", 1),
    FIELD_2(2, "Field2", 1),
    FIELD_3(3, "Field3", 1),
    FIELD_4(4, "Field4", 2),
    FIELD_5(5, "Field5", 2);

    private final int fieldID;
    private final String fieldName;
    private final int catalogID;

    FieldEnum(int fieldID, String fieldName, int catalogID) {
        this.fieldID = fieldID;
        this.fieldName = fieldName;
        this.catalogID = catalogID;
    }

    public int getFieldID() {
        return fieldID;
    }

    public String getFieldName() {
        return fieldName;
    }

    public int getCatalogID() {
        return catalogID;
    }
}
