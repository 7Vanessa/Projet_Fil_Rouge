package dao;

import CatalogManagement.Catalog;
import data.CatalogEnum;

import java.util.ArrayList;
import java.util.List;

public class CatalogDAO extends DAO<Catalog> {
    private List<Catalog> catalogs;

    private FieldDAO fieldDAO;
    private ThemeDAO themeDAO;
    private TopicDAO topicDAO;
    private CourseDAO courseDAO;

    public CatalogDAO() {
        fieldDAO = new FieldDAO();
        themeDAO = new ThemeDAO();
        topicDAO = new TopicDAO();
        courseDAO = new CourseDAO();
        catalogs = new ArrayList<>();
        initializeCatalogs();
    }

    private void initializeCatalogs() {
        for (CatalogEnum catalogEnum : CatalogEnum.values()) {
            Catalog catalog = new Catalog(
                    catalogEnum.getCatalogID(),
                    catalogEnum.getCatalogName(),
                    fieldDAO.getFieldsByCatalogId(catalogEnum.getCatalogID()));
            catalogs.add(catalog);
        }
    }

    public CourseDAO getCourseDAO() {
        return courseDAO;
    }

    public FieldDAO getFieldDAO() {
        return fieldDAO;
    }

    public ThemeDAO getThemeDAO() {
        return themeDAO;
    }

    public TopicDAO getTopicDAO() {
        return topicDAO;
    }

    public List<Catalog> getAllCatalogs() {
        return catalogs;
    }

    @Override
    public Catalog find(int id) {
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogId() == id) {
                return catalog;
            }
        }
        return null;
    }

    @Override
    public void create(Catalog catalog) {
        catalogs.add(catalog);
    }

    @Override
    public void update(Catalog catalog) {
        for (int i = 0; i < catalogs.size(); i++) {
            if (catalogs.get(i).getCatalogId() == catalog.getCatalogId()) {
                catalogs.set(i, catalog);
                break;
            }
        }
    }

    @Override
    public void delete(Catalog catalog) {
        catalogs.remove(catalog);
    }
}
