package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {
	
	private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/form")
    public String saveData(@ModelAttribute("student") Student student, Model model) {
        studentService.saveStudent(student);
        model.addAttribute("message", "Form data saved");
        return "result";
    }

    @GetMapping("/msg")
    public String getMsg(Model model) {
        model.addAttribute("msg1", "Welcome to the browser");
        return "msg";
    }

}
