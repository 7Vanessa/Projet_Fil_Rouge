package dao;

import CatalogManagement.Field;
import data.FieldEnum;

import java.util.ArrayList;
import java.util.List;

public class FieldDAO extends DAO<Field> {
    private List<Field> fields;
    private ThemeDAO themeDAO;

    public FieldDAO() {
        themeDAO = new ThemeDAO();
        fields = new ArrayList<>();
        initializeFields();
    }

    private void initializeFields() {
        for (FieldEnum fieldEnum : FieldEnum.values()) {
            Field field = new Field(
                    fieldEnum.getFieldID(),
                    fieldEnum.getCatalogID(),
                    fieldEnum.getFieldName(),
                    themeDAO.getAllThemesByFieldId(fieldEnum.getFieldID())
            );
            fields.add(field);
        }
    }

    public List<Field> getAllFields() {
        return fields;
    }

    public List<Field> getFieldsByCatalogId(int catalogId) {
        List<Field> result = new ArrayList<>();
        for (Field field: fields ) {
            if(field.getCatalogId()==catalogId) {
                result.add(field);
            }
        }
        return result;
    }

    @Override
    public Field find(int id) {
        for (Field field : fields) {
            if (field.getFieldId() == id) {
                return field;
            }
        }
        return null;
    }

    @Override
    public void create(Field field) {
        fields.add(field);
    }

    @Override
    public void update(Field field) {
        for (int i = 0; i < fields.size(); i++) {
            if (fields.get(i).getFieldId() == field.getFieldId()) {
                fields.set(i, field);
                break;
            }
        }
    }

    @Override
    public void delete(Field field) {
        fields.remove(field);
    }
}
