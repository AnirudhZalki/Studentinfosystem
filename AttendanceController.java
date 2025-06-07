package com.sis.student_system.controller;

import com.sis.student_system.model.Attendance;
import com.sis.student_system.model.Student;
import com.sis.student_system.repository.AttendanceRepository;
import com.sis.student_system.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {

    private final StudentRepository studentRepo;
    private final AttendanceRepository attendanceRepo;

    public AttendanceController(StudentRepository studentRepo, AttendanceRepository attendanceRepo) {
        this.studentRepo = studentRepo;
        this.attendanceRepo = attendanceRepo;
    }

    @GetMapping("/mark")
    public String showAttendanceForm(Model model) {
        model.addAttribute("students", studentRepo.findAll());
        model.addAttribute("date", LocalDate.now());
        return "attendance_form";
    }

    @PostMapping("/submit")
    public String submitAttendance(@RequestParam("studentIds") Long[] studentIds) {
        for (Long id : studentIds) {
            Student student = studentRepo.findById(id).orElse(null);
            Attendance attendance = new Attendance();
            attendance.setStudent(student);
            attendance.setDate(LocalDate.now());
            attendance.setPresent(true);
            attendanceRepo.save(attendance);
        }
        return "redirect:/";
    }
}
