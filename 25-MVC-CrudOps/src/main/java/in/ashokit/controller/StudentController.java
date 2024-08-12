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
    public String loadForm(Model model) {
        model.addAttribute("student", new Student());
        return "form"; // Thymeleaf template name
    }

    @PostMapping("/formSubmit")
    public String submitForm(@ModelAttribute Student student, Model model) {
       boolean status = studentService.saveStudent(student);

        if (status) {
        	
             String success = "student record saved Successfully";
             model.addAttribute("student", new Student());
             return "form";
            
        } else {
            String failed = "Failed to save";
            model.addAttribute("student", new Student());
            return "form";
        }
        // Optionally, clear the form after submission
         // Redirect or return the same view to display the message
    }
    
    
}
