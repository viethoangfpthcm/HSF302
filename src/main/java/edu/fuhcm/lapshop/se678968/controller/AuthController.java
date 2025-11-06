package edu.fuhcm.lapshop.se678968.controller;

import edu.fuhcm.lapshop.se678968.entity.User;
import edu.fuhcm.lapshop.se678968.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {
@Autowired
    UserService userService;
    @GetMapping({"/", "/login", "/ngoctrinh"})
    public String login(@ModelAttribute("acc")User user, Model model) {
        model.addAttribute("acc",user);
        return "login";
    }

//    @PostMapping("/doLogin")
//    public String doLogin(@ModelAttribute("acc")User user, RedirectAttributes redirectAttributes, HttpSession session, Model model) {
//        User us = userService.getByEmail(user.getEmail());
//        if(us == null){
//            redirectAttributes.addFlashAttribute("error","email is incorrect");
//            return "redirect:/login";
//        }
//        if(!us.getPassword().equals(user.getPassword())){
//            redirectAttributes.addFlashAttribute("error","password is incorrect");
//            redirectAttributes.addFlashAttribute("acc", user);
//            return "redirect:/login";
//        }
//        if(!us.getRole().equals("Admin") && !us.getRole().equals("Staff")){
//            redirectAttributes.addFlashAttribute("error","You don’t have permission to access this function!");
//            return "redirect:/login";
//        }
//        session.setAttribute("acc",us);
//        return "redirect:/laptop";
//    }
//
//    @GetMapping("/logout")
//    public String logout(RedirectAttributes redirectAttributes, HttpSession session) {
//        session.removeAttribute("acc");
//        session.invalidate();
//        redirectAttributes.addFlashAttribute("acc", new User());
//        return "redirect:/login";
//    }
}
