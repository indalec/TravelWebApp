package dci.j24e01.TravelBlog.controller;

import dci.j24e01.TravelBlog.model.Location;
import dci.j24e01.TravelBlog.model.PendingLocation;
import dci.j24e01.TravelBlog.repository.LocationRepository;
import dci.j24e01.TravelBlog.repository.PendingLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin_panel")
public class AdminController {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private PendingLocationRepository pendingLocationRepository;

    @GetMapping
    public String adminPanel(Model model) {
        List<Location> locations = locationRepository.findAll();
        List<PendingLocation> pendingLocations = pendingLocationRepository.findAll();
        model.addAttribute("locations", locations);
        model.addAttribute("pendingLocations", pendingLocations);
        return "admin_panel";
    }

    // Other mappings for approving, rejecting, editing locations
}
