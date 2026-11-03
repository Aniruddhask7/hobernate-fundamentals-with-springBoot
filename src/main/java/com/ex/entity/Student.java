package com.ex.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "studenthb2")
public class Student {

    @Id
    private Long id;

    @Column(
            name = "student_name",
            nullable = false,
            length = 100
    )
    private String name;

    @Column(
            nullable = false,
            length = 100,
            unique = true,
            updatable = true,
            insertable = true
    )
    private String email;
    private int age;


    @ElementCollection
    @CollectionTable(
            name = "student_skills",
            joinColumns = @JoinColumn(name = "student_id")
    )
    //@Column(name = "skill")
    private Set<String> skills;

    public Student(Long id, String name, String email, int age, Set<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.skills = skills;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }


    //
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(
//                    name = "city",
//                    column = @Column(name = "current_city")
//            ),
//            @AttributeOverride(
//                    name = "house_no",
//                    column = @Column(name = "current_house_no")
//            ),
//            @AttributeOverride(
//                    name = "Street",
//                    column = @Column(name = "current_street")
//            ),
//            @AttributeOverride(
//                    name = "State",
//                    column = @Column(name = "current_state")
//            )
//    })
//    private Address currecnAddress;
//
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(
//                    name = "city",
//                    column = @Column(name = "permanant_city")
//            ),
//            @AttributeOverride(
//                    name = "house_no",
//                    column = @Column(name = "permanant_house_no")
//            ),
//            @AttributeOverride(
//                    name = "Street",
//                    column = @Column(name = "permanant_street")
//            ),
//            @AttributeOverride(
//                    name = "State",
//                    column = @Column(name = "permanant_state")
//            )
//    })
//    private Address permenantAddress;



//    public Student(Long id, String name, String email, int age, Address currecnAddress, Address permenantAddress) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.age = age;
//        this.currecnAddress = currecnAddress;
//        this.permenantAddress = permenantAddress;
//    }
//
//    public Student() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Address getCurrecnAddress() {
//        return currecnAddress;
//    }
//
//    public void setCurrecnAddress(Address currecnAddress) {
//        this.currecnAddress = currecnAddress;
//    }
//
//    public Address getPermenantAddress() {
//        return permenantAddress;
//    }
//
//    public void setPermenantAddress(Address permenantAddress) {
//        this.permenantAddress = permenantAddress;
//    }


    //    @Column(precision = 5,scale = 2)
//    private BigDecimal percentage;
//
//    private LocalDate dateOfBirth;
//
//
//    private LocalDateTime createdAt;



//    @Enumerated(EnumType.ORDINAL)
//    private StudentStatus status;
//
//
//    @Lob
//    private String profileDescription;
//
//    @Transient
//    private String DeiplayName;
//
//
//    @Convert(converter = BooleanToStringConverter.class)
//    private Boolean isMonitor;


//    public Student(Long id, String name, String email,
//                   int age, BigDecimal percentage, LocalDate dateOfBirth,
//                   LocalDateTime createdAt, StudentStatus status,
//                   String profileDescription , Boolean isMonitor) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.age = age;
//        this.percentage = percentage;
//        this.dateOfBirth = dateOfBirth;
//        this.createdAt = createdAt;
//        this.status = status;
//        this.profileDescription = profileDescription;
//        DeiplayName = deiplayName;
//        this.isMonitor = isMonitor;
//    }


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public BigDecimal getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(BigDecimal percentage) {
//        this.percentage = percentage;
//    }
//
//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public StudentStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(StudentStatus status) {
//        this.status = status;
//    }
//
//    public String getProfileDescription() {
//        return profileDescription;
//    }
//
//    public void setProfileDescription(String profileDescription) {
//        this.profileDescription = profileDescription;
//    }
//
//    public String getDeiplayName() {
//        return DeiplayName;
//    }
//
//    public void setDeiplayName(String deiplayName) {
//        DeiplayName = deiplayName;
//    }

//    public Boolean getMonitor() {
//        return isMonitor;
//    }
//
//    public void setMonitor(Boolean monitor) {
//        isMonitor = monitor;
//    }
}
