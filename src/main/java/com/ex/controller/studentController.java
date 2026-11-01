package com.ex.controller;

import com.ex.entity.Student;
import com.ex.service.studentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class studentController {

    private studentService studServ;

    public studentController(studentService studServ){
        this.studServ = studServ;
    }


    @PostMapping
   public ResponseEntity<String>  createStudent(@RequestBody Student student){
              studServ.createStudent(student);
          return ResponseEntity.status(HttpStatus.CREATED).body("Student Created Successfully");
    }

    @GetMapping

    public ResponseEntity<List<Student>>getAllStudent(){
         List<Student> student =  studServ.getAllStudent();

         return ResponseEntity.ok(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
       Student student =  studServ.studentGetById(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")

    public ResponseEntity<String> updateStudent(@RequestBody Student student , @PathVariable Long id){
     studServ.updateStudent(student , id);
        return ResponseEntity.ok("DONE");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentID(@PathVariable Long id){
        studServ.deleteStudentId(id);
        return ResponseEntity.ok("Deleted Successfully");

    }


}
