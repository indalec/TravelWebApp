package dci.j24e01.TravelBlog.controller;

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

//    HELDER: this RequestMapping was catching all requests no matter the method
//          GET, POST, etc... and basically just showing the page again...
//          this is now being handled in the AdminController class
//    @RequestMapping("/admin_panel")
//    public String showAdminPanel() {
//
//        return "admin_panel";
//    }

    // Home page for the general user
    @GetMapping("/")
    public String index() {
        return "index";  // Your main page
    }
}
