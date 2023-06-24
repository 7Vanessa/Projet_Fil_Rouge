package dao;

import CatalogManagement.Theme;
import data.ThemeEnum;

import java.util.ArrayList;
import java.util.List;

public class ThemeDAO extends DAO<Theme> {
    private List<Theme> themes;
    private TopicDAO topicDAO;

    public ThemeDAO() {
        topicDAO = new TopicDAO();
        themes = new ArrayList<>();
        initializeThemes();
    }

    private void initializeThemes() {
        for (ThemeEnum themeEnum : ThemeEnum.values()) {
            Theme theme = new Theme(
                    themeEnum.getThemeID(),
                    themeEnum.getFieldID(),
                    themeEnum.getThemeName(),
                    topicDAO.getAllTopicsByThemeId(themeEnum.getThemeID())
            );
            themes.add(theme);
        }
    }

    public List<Theme> getAllThemes() {
        return themes;
    }

    public List<Theme> getAllThemesByFieldId(int fieldId) {
        List<Theme> result = new ArrayList<>();
        for (Theme theme : themes) {
            if (theme.getFieldId() == fieldId) {
                result.add(theme);
            }
        }
        return result;
    }

    @Override
    public Theme find(int id) {
        for (Theme theme : themes) {
            if (theme.getThemeId() == id) {
                return theme;
            }
        }
        return null;
    }

    @Override
    public void create(Theme theme) {
        themes.add(theme);
    }

    @Override
    public void update(Theme theme) {
        for (int i = 0; i < themes.size(); i++) {
            if (themes.get(i).getThemeId() == theme.getThemeId()) {
                themes.set(i, theme);
                break;
            }
        }
    }

    @Override
    public void delete(Theme theme) {
        themes.remove(theme);
    }
}
