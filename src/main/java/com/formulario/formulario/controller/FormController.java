package com.formulario.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import com.formulario.formulario.models.Usuario;

import jakarta.validation.Valid;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("titulo","Formulario");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("titulo", "Resultado formulario");
        }
        return "resultado";
    }
}
