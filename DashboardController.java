package com.sis.student_system.controller;

import com.sis.student_system.model.Student;
import com.sis.student_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private StudentService studentService;  // ✅ Make sure this matches the class name

    @GetMapping("/dashboard")
    public String viewDashboard(Model model) {
        List<Student> students = studentService.getAllStudents();  // ✅ Correct method

        model.addAttribute("totalStudents", students.size());
        model.addAttribute("recentStudents", students.stream().limit(5).toList());

        return "dashboard";  // ✅ Make sure dashboard.html exists
    }
}
