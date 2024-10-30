package com.stelluchchka.t1.controllers;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.stelluchchka.t1.dao.PollDAO;
import com.stelluchchka.t1.models.*;

@RestController
@RequestMapping("/polls")
public class PollController {

    private final PollDAO pollDAO;

    private final ObjectMapper objectMapper;

    @Autowired
    public PollController(PollDAO pollDAO) {
        this.pollDAO = pollDAO;
        this.objectMapper = new ObjectMapper();
    }

    @GetMapping("/")
    public ResponseEntity<String> getAllPolls() {
        try {
            List<Poll> polls = pollDAO.index();
            String json = objectMapper.writeValueAsString(polls);

            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка при сериализации JSON");
        }
    }



//    @PostMapping()
//    public String create(@ModelAttribute("poll") Poll poll,
//                         BindingResult bindingResult) {
//        if (bindingResult.hasErrors())
//            return "polls/new";
//
//        pollDAO.save(poll);
//        return "redirect:/polls";
//    }
}

