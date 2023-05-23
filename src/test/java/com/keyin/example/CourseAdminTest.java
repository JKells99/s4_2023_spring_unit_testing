package com.keyin.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseAdminTest {
    @Test
    @DisplayName("Test Course List")
    public void testGetCourseListByStudent(){
        CourseAdmin courseAdmin = new CourseAdmin();

        Student student = new Student();

        student.setId(1);
        student.setName("Jordan");

        Course course = new Course();

        course.setId(1);
        course.setName("SWDAT");

        courseAdmin.addCourseToStudent(student,course);

        Student studentToFind = new Student();
        studentToFind.setId(1);
        studentToFind.setName("Jordan");

        Course courseToFind = new Course();
        courseToFind.setId(1);
        courseToFind.setName("SWDAT");

        Assertions.assertTrue(courseAdmin.getCourseListByStudent(studentToFind).contains(courseToFind));


    }


    @Test
    @DisplayName("Test Course List")
    public void testGetCourseListByStudent_Failing(){
        CourseAdmin courseAdmin = new CourseAdmin();

        Student student = new Student();

        student.setId(1);
        student.setName("Jordan");

        Course course = new Course();

        course.setId(1);
        course.setName("SWDAT");

        courseAdmin.addCourseToStudent(student,course);

        Student studentToFind = new Student();
        studentToFind.setId(1);
        studentToFind.setName("Jordan");

        Course courseToFind = new Course();
        courseToFind.setId(1);
        courseToFind.setName("JavaScript");

        Assertions.assertTrue(courseAdmin.getCourseListByStudent(studentToFind).contains(courseToFind));


    }
}
