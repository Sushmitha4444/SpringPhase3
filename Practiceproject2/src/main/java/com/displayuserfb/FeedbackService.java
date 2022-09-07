package com.displayuserfb;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FeedbackService {
        
    @Autowired
   FeedbackRepository feedbackRepository;//reference object of interface
    
    //get list of all records
    public List<FeedbackEntity> getAllFeedback(){
        return feedbackRepository.findAll();//findAll is a method of jparepository which returns all records in list
    }
        //call findById to get 1 product details
    public FeedbackEntity getFeedback(int id){
        return feedbackRepository.findById(id).get();
    }
        
    public void addFeedback(FeedbackEntity pe){
        feedbackRepository.save(pe);
    }
        
    public void updateFeedback(int id, FeedbackEntity pe){
        if(feedbackRepository.findById(id).isPresent()) {
            FeedbackEntity oldFeedbackEntity=feedbackRepository.findById(id).get();//fetch record from database
            oldFeedbackEntity.setUser(pe.getUser());
            oldFeedbackEntity.setFeedback(pe.getFeedback());
            feedbackRepository.save(oldFeedbackEntity);
        }
    }
        
    public void deleteProduct(int id){
        feedbackRepository.deleteById(id);       
    }
}