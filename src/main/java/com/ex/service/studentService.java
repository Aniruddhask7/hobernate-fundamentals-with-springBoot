package com.ex.service;

import com.ex.entity.Student;
import com.ex.repositery.studentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    private final studentRepository studRepo;

    public studentService(studentRepository studRepo) {
        this.studRepo = studRepo;
    }

    // CREATE
    @Transactional
    public void createStudent(Student student) {
        studRepo.save(student);
    }

    // READ BY ID
    public Student studentGetById(Long id) {
        Student student = studRepo.findById(id);

        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        return student;
    }

    // UPDATE
    @Transactional
    public Student updateStudent(Student request, Long id) {
        Student existingStudent = studRepo.findById(id);

        if (existingStudent == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        existingStudent.setName(request.getName());
        existingStudent.setEmail(request.getEmail());
        existingStudent.setAge(request.getAge());

        return existingStudent;
    }

    // DELETE
    @Transactional
    public void deleteStudentId(Long id) {
        Student student = studRepo.findById(id);

        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        studRepo.remove(student);
    }

    // READ ALL
    public List<Student> getAllStudent() {
        return studRepo.findAll();
    }
}