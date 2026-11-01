package com.ex.repositery;

import com.ex.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class studentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // CREATE
    public void save(Student student) {
        entityManager.persist(student);
    }

    // READ BY ID
    public Student findById(Long id) {
        return entityManager.find(Student.class, id);
    }

    // READ ALL
    public List<Student> findAll() {
        return entityManager
                .createQuery("SELECT s FROM Student s", Student.class)
                .getResultList();
    }

    // DELETE
    public void remove(Student student) {
        entityManager.remove(student);
    }
}