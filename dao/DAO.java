package dao;

public abstract class DAO<T> {
    /**
     * Get an object by its id
     * @param id
     * @return
     */
    public abstract T find(int id);

    /**
     * Insert an object in database
     * @param obj
     */
    public abstract void create(T obj);

    /**
     * Update object's data in database
     * @param obj
     */
    public abstract void update(T obj);

    /**
     * Delete an object in database
     * @param obj
     */
    public abstract void delete(T obj);
}
