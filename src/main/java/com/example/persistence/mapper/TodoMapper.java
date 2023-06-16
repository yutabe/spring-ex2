package com.example.persistence.mapper;

import com.example.persistence.entity.Todo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("SELECT * FROM todos ORDER BY id")
    List<Todo> findAll();

    @Select("SELECT * FROM todos WHERE id = #{id}")
    Todo findById(Integer id);

    @Insert("INSERT INTO todos(description, deadline, done, createdAt, updatedAt)" +
            " VALUES(#{description}, #{deadline}, #{done}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(Todo todo);

    @Update("UPDATE todos SET description = #{description}, deadline = #{deadline}," +
            " done = #{done}, createdAt = #{createdAt}, updatedAt = #{updatedAt} WHERE id = #{id}")
    int update(Todo todo);

    @Delete("DELETE FROM todos WHERE id = #{id}")
    int delete(Integer id);
}
