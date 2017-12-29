package com.practise.springboot.service;

import com.practise.springboot.response.ResponseEntity;
import com.practise.springboot.controller.dto.Topic;
import com.practise.springboot.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 26/12/17.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private ResponseEntity<List<Topic>> responseEntity =  new ResponseEntity<List<Topic>>(new ArrayList<Topic>(Arrays.asList(
            new Topic("test1"),
                new Topic("test2")

        )));



    public ResponseEntity<List<Topic>> getAllTopics(){
       // return responseEntity;
        topicRepository.findAll().forEach(responseEntity.getResults() :: add);
        return responseEntity;
    }

    public ResponseEntity<Topic> getTopic(String id){
       // return new ResponseEntity<Topic>(new Topic(id));

        return  new ResponseEntity<Topic>(topicRepository.findOne(id));
    }

    public void addTopic(Topic topic){

        topicRepository.save(topic);
    }
}
