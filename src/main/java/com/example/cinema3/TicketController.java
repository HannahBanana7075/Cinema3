package com.example.cinema3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    CinemaRepository rep;

    @PostMapping("/addTicket")
    public ResponseEntity<String> addTicket(@RequestBody AllTickets ticket){
        rep.addTicket(ticket);
        return ResponseEntity.ok("Ticket added successfully");
    }


    @GetMapping("/getTickets")
    public List<AllTickets> getTickets(){
        List<AllTickets> ticket = rep.getTickets();
        return ticket;
    }

   // @PostMapping("/deleteAll")
    //public void deleteAll()


}
