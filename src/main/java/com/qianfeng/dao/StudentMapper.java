package com.qianfeng.dao;

import com.qianfeng.entity.Student;
import com.qianfeng.entity.Teacher;

import java.util.List;

/**
 * 完成学生的增删改查
 */
public interface StudentMapper {
    /**
     * 检查老师的数据库，看是否存在
     */
    Teacher cheakTeacher(Teacher teacher);
    /**
     * 增加学生的数据
     */
    Student add(Student student);
    /**
     * 查询学生的信息通过id
     */
    Student query(int id);
    /**
     * 修改学生的信息
     */
    void update(Student student);
    /**
     * 删除学生的信息
     */
    void delete(Student student);
    /**
     * 查询学生信息所有
     */
    List<Student> queryList();

}
