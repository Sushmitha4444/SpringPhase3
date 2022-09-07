package com.displayuserfb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin") 
public class FeedbackController {
    
    @Autowired
    FeedbackService feedbackService;
    
    @GetMapping("/allfeedback")
    public List<FeedbackEntity> getAllFeedback(){
        return feedbackService.getAllFeedback();
    }
    
    @GetMapping("/feedback/{id}")
    public FeedbackEntity getFeedback(@PathVariable int id){
        return feedbackService.getFeedback(id);
    }
    
    @PostMapping("/feedback")   //@REquestBody is used to read object from browser
    public void addProduct(@RequestBody FeedbackEntity pe ) {
        feedbackService.addFeedback(pe);
    }
    
    @PutMapping("/feedback/{id}")
    public void updateFeedback(@PathVariable int id, @RequestBody FeedbackEntity pe ) {
        feedbackService.updateFeedback(id, pe);
    }   
}