package com.example.dvdrental.controllers;


import com.example.dvdrental.entities.Customer;
import com.example.dvdrental.entities.Rental;
import com.example.dvdrental.repositories.CustomerRepository;
import com.example.dvdrental.repositories.MovieRepository;
import com.example.dvdrental.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import static java.lang.Integer.parseInt;

@Controller
public class InvoiceController {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    RentalRepository rentalRepository;


    @RequestMapping("/home")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/list")
    public String invoicePage(Model model, @RequestParam String rentalId) {

        Integer rentalIdConverted = parseInt(rentalId);
        String result = "No Rentals Found";

        Iterable<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            for (Rental rental : customer.getRentals()) {
                if (rental.getId().equals(rentalIdConverted)) {
                    result = customer.statement();
                }
            }
        }
            model.addAttribute("result", result);

        System.out.println(result);
            return "invoice";
    }

}


