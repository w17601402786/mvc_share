package com.management.mapper;

import com.management.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    // 增加一位教师
    int addTeacher(Teacher teacher);

    // 删除一个教师
    int deleteTeacherById(Integer id);

    // 修改一个教师的信息
    int updateTeacher(Teacher teacher);

    // 查询所有教师信息
    List<Teacher> getAllTeachers();

    // 根据id查询一位教师的信息
    Teacher getTeacherById(Integer id);

    // 根据教师号查询一位教师的信息
    Teacher getTeacherByTeacherId(String teacherId);
}
