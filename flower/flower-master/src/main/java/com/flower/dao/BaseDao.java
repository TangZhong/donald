package com.flower.dao;


import java.util.List;
import java.util.Map;


public interface BaseDao<T> {
    /**
     * 添加
     * @param t
     * @return
     */
    int create(T t);

    /**
     * 批量添加
     * @param t
     * @return
     */
    int creates(List<T> t);

    /**
     * 删除根据id
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 修改根据javaBean
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    T load(Long id);

    List<T> loads(List<Long> ids);

    /**
     * 获取全部数据
     * @return
     */
    List<T> getAll();

    /**
     * 根据条件查询
     * @param criteria
     * @return
     */
    List<T> list(Map<String, Object> criteria);

    /**
     * 分页查询 具体根据mapper进行区别
     * @param criteria
     * @return
     */
    List<T> paging(Map<String, Object> criteria);

    /**
     * 根据条件获取对应记录条数
     * @param criteria
     * @return
     */
    Integer count(Map<String, Object> criteria);
}
