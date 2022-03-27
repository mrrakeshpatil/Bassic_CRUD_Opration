package com.xadmin.SpringBootCurd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCurd.bean.Subject;
import com.xadmin.SpringBootCurd.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject>getAllSubjects()
	{
		List<Subject>subject=new ArrayList<>();
		
		subjectRepo.findAll().forEach(subject::add);
		
		return subject;
	}

	public void addSubject(Subject subject) 
	{
		System.out.println(subject.toString());
		subjectRepo.save(subject);
		
	}

	public Subject updateSubject(Subject subject) {
		return subjectRepo.save(subject);
	}

	public void deleteSubject(String id) {
		 subjectRepo.deleteById(id);
		
	}
  
}
