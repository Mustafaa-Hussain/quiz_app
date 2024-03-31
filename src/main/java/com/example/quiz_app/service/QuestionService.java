package com.example.quiz_app.service;

import com.example.quiz_app.Question;
import com.example.quiz_app.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;


    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }


}
