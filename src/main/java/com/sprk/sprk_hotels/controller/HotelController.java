package com.sprk.sprk_hotels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sprk.sprk_hotels.model.Listing;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HotelController {

    @GetMapping("/listings/add")
    public String showAddForm(Model model) {
        Listing listing = new Listing();
        model.addAttribute("listing", listing);
        return "listing-form";
    }

    @PostMapping("/listings")
    public String saveListing(@Valid @ModelAttribute Listing listing, BindingResult bindingResult) {
        // Handling Server Side validation
        if (bindingResult.hasErrors()) {
            System.out.println(listing);
            return "listing-form";
        }

        return "index";
    }

}
