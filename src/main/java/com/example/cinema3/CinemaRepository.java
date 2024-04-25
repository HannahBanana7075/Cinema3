package com.example.cinema3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaRepository {

    //CRUD

    @Autowired
    private JdbcTemplate db;

    //save tickets
    public void addTicket(AllTickets newTicket){
        String sql ="INSERT INTO tickets(movie, amount, firstName, lastName, phoneNumber, email) VALUES(?,?,?,?,?,?)";
        db.update(sql,newTicket.getMovie(),newTicket.getAmount(), newTicket.getFirstName(),newTicket.getLastName(),
                newTicket.getPhoneNumber(),newTicket.getEmail());
    }

    //read tickets
    public List<AllTickets> getTickets() {
        String sql = "SELECT * FROM tickets";
        List<AllTickets> getTickets =
                db.query(sql, new BeanPropertyRowMapper<>(AllTickets.class));
        return getTickets;
    }
/*
    //edit select
    public void editTicket(){
        String sql = "UPDATE * FROM CinemaTickets(movie, amount, firstName, lastName, phoneNumber, email) VALUES(?,?,?,?,?,?)";
        db.update(sql);
    }

    //delete select
    public void deleteSelect(long id){
        String sql = "DELETE FROM myTickets WHERE id = ?";
        db.update(sql, id);
    }
*/
    //delete all
    public void deleteAll(){
        String sql = "DELETE FROM tickets";
        db.update(sql);
    }
}
