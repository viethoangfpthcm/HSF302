package edu.fuhcm.lapshop.se678968.controller;

import edu.fuhcm.lapshop.se678968.entity.Computer;
import edu.fuhcm.lapshop.se678968.entity.Manufacturer;
import edu.fuhcm.lapshop.se678968.entity.User;
import edu.fuhcm.lapshop.se678968.service.ComputerService;
import edu.fuhcm.lapshop.se678968.service.ManuService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller()
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    ComputerService computerService;
@Autowired
ManuService manuService;
//    @GetMapping
//    public String laptop(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
//        User user = (User) session.getAttribute("acc");
//        if (user == null) {
//            redirectAttributes.addFlashAttribute("error", "You are not logged in");
//            return "redirect:/login";
//        }
//        List<Computer> list = computerService.getComputers();
//        model.addAttribute("laptops", list);
//        return "laptops";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteComputer(@PathVariable Integer id, HttpSession session, RedirectAttributes redirectAttributes) {
//        User us = (User) session.getAttribute("acc");
//        if (!us.getRole().equals("Admin")) {
//            redirectAttributes.addFlashAttribute("error", "You are not Admin");
//            return "redirect:/laptop";
//        }
//        //computerService.deleteComputer(id);
//        Computer computer = computerService.getComputer(id);
//        computerService.deleteComputer(computer);
//        return "redirect:/laptop";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String editComputer(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes, Model model, HttpSession session) {
//        User user = (User) session.getAttribute("acc");
//        if (user == null) {
//            redirectAttributes.addFlashAttribute("error", "You are not logged in");
//            return "redirect:/login";
//        }
//        if (!user.getRole().equals("Admin")) {
//            redirectAttributes.addFlashAttribute("error", "You are not Admin");
//            return "redirect:/laptop";
//        }
//        Computer co = computerService.getComputer(id);
//        List<Manufacturer> list = manuService.getManuList();
//        model.addAttribute("manufacturer",list);
//        model.addAttribute("objX", co);
//        model.addAttribute("formModel", "edit");
//        return "laptop-form";
//    }
//
//    @PostMapping("/save")
//    //form edit gửi lên có 2 cách nhận:
//    // 1. nhận lẻ từng field @RequestParam
//    // 2. nhận nguyên cục @ModelAttribute - object binding
//    // gửi xuống object gì thì nhận lên object đó
//    public String save(@Valid @ModelAttribute("objX") Computer co, BindingResult bindingResult, Model model, @RequestParam("formModel") String form) {
//        //bắt lỗi ngay khi binding, trước khi gọi repo để xuống table
//        //nếu có lỗi thì chửi ở màn hình form nhập
//        // chắc chắn phải có lệnh return lại form nhập nếu có lỗi
//        if (bindingResult.hasErrors()) {
//            //model.addAttribute("errors", bindingResult.getAllErrors());
//            List<Manufacturer> list = manuService.getManuList();
//            model.addAttribute("manufacturer",list);
//            model.addAttribute("objX", co);
//            model.addAttribute("formModel", form);
//            return "laptop-form";
//        }
//        try {
//            if("edit".equals(form)) {
//                computerService.updateComputer(co);
//
//            } else if ("new".equals(form)) {
//                computerService.createComputer(co);
//            }
//        } catch (Exception e) {
//            model.addAttribute("errorMessage", e.getMessage());
//            List<Manufacturer> list = manuService.getManuList();
//            model.addAttribute("manufacturer",list);
//            model.addAttribute("objX", co);
//            model.addAttribute("formModel", form);
//            return "laptop-form";
//        }
//        return "redirect:/laptop";
//    }
//
//    @GetMapping("/new")
//    public String newComputer(Model model) {
//
//
//        List<Manufacturer> list = manuService.getManuList();
//        model.addAttribute("manufacturer",list);
//        model.addAttribute("objX", new Computer());
//        model.addAttribute("formModel", "new");
//        return "laptop-form";
//    }
}
