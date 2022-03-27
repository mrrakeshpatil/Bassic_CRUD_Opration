package com.xadmin.SpringBootCurd.controllre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCurd.bean.Subject;
import com.xadmin.SpringBootCurd.service.SubjectService;

@RestController
public class SubjectController {
 @Autowired
	private SubjectService subjectService;
 
 @RequestMapping("/getSubjects")
	public List<Subject> getAllSubjects()
	{
	 System.out.println("in get All");
	 List<Subject> s=subjectService.getAllSubjects();
	 System.out.println(s);
		return s;
	}
 
 @PostMapping("addSubject")//(method = RequestMethod.POST, value="/addSubject")
 public String addSubject(@RequestBody Subject subject)
 {
	 System.out.println("in add");
	 subjectService.addSubject(subject);
	 return "added";
 }
 
 @RequestMapping(method = RequestMethod.PUT, value="/updateSubject/{id}")
 public Subject updateSubject(@PathVariable String id,@RequestBody Subject subject)
 {
	return subjectService.updateSubject(subject);
 }
 
 @RequestMapping(method = RequestMethod.DELETE, value="/deleteSubject/{id}")
 public void DeletSubject(@PathVariable String id)
 {
	 subjectService.deleteSubject(id);
 }

}
