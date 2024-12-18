package dci.j24e01.TravelBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    // Display the login page when accessing "/admin"
    @GetMapping("/admin")
    public String showLoginPage() {
        return "admin";  // The name of the Thymeleaf template
    }

    // Redirect to the admin panel after a successful login (handled by Spring Security)
    @RequestMapping("/admin_panel")
    public String showAdminPanel() {
        // If you have an admin panel page, return its name here
        return "admin_panel";  // Redirect to the admin panel page
    }

    // Home page for the general user
    @GetMapping("/")
    public String index() {
        return "index";  // Your main page
    }
}
