package com.devpathlearning;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/course-search")
public class CourseSearchServlet extends HttpServlet {

    private static class Course {
        String code;
        String title;
        String description;
        String semester;
        int credits;
        String imageUrl;

        public Course(String code, String title, String description, String semester, int credits, String imageUrl) {
            this.code = code;
            this.title = title;
            this.description = description;
            this.semester = semester;
            this.credits = credits;
            this.imageUrl = imageUrl;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Course> courses = getCourses();
        request.setAttribute("courses", courses);
        request.getRequestDispatcher("course-search.html").forward(request, response);
    }

    private List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("CSC401", "Software Engineering", "Principles and practices of software development life cycle.", "Year 3, Sem 1", 4, "images/software-engineering.jpg"));
        courses.add(new Course("CSC402", "Data Structures", "Advanced data structures and algorithms.", "Year 2, Sem 2", 3, null)); // Missing image

        for (Course course : courses) {
            if (course.imageUrl == null || course.imageUrl.isEmpty()) {
                course.imageUrl = "images/placeholder.jpg"; // Set placeholder image
            }
        }

        return courses;
    }
}
