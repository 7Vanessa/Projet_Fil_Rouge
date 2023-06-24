package data;

public enum CatalogEnum {
    CATALOG1(1, "Catalog1"),
    CATALOG2(2, "Catalog2");

    private final int catalogID;
    private final String catalogName;

    CatalogEnum(int catalogID, String catalogName) {
        this.catalogID = catalogID;
        this.catalogName = catalogName;
    }

    public int getCatalogID() {
        return catalogID;
    }

    public String getCatalogName() {
        return catalogName;
    }
}
