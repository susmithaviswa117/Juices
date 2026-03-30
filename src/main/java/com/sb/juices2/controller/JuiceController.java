package com.sb.juices2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sb.juices2.model.juice;
import com.sb.juices2.service.JuiceService;

@Controller
@CrossOrigin(origins = "*")
public class JuiceController {

    @Autowired
    private JuiceService service;

    // ✅ ROOT → redirect to home.html
    @GetMapping("/")
    public String root() {
        return "redirect:/index.html";
    }

    // ✅ /home → home.html
    @GetMapping("/home")
    public String home() {
        return "redirect:/index.html";
    }

    // ✅ /cart → cart.html
    @GetMapping("/cart")
    public String cart() {
        return "redirect:/cart.html";
    }

    // ✅ /bill → bill.html (with query param support)
    @GetMapping("/bill")
    public String bill(@RequestParam(defaultValue = "0") int total) {
        return "redirect:/bill.html?total=" + total;
    }

    // ✅ /contact → contact.html
    @GetMapping("/contact")
    public String contact() {
        return "redirect:/contact.html";
    }

    // ✅ GET /drink → JSON
    @GetMapping("/drink")
    @ResponseBody
    public List<juice> getAllDrinks() {
        return service.getAll();
    }

    // ✅ POST /drink → Add juice
    @PostMapping("/drink")
    @ResponseBody
    public juice addDrink(@RequestBody juice j) {
        return service.save(j);
    }

    // ✅ DELETE /drink/{id}
    @DeleteMapping("/drink/{id}")
    @ResponseBody
    public String deleteDrink(@PathVariable Long id) {
        service.delete(id);
        return "Deleted!";
    }
}