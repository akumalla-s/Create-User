/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.io.*;
import javax.imageio.ImageIO;
/**
 *
 * @author srinredd
 */
public class User {  
    private String firstName;
    private String lastName;
    private String dob;
    private int age;
    private long telephoneNumber;
    private String email;
    private String streetLine1;
    private String streetLine2;
    private String city;
    private String country;
    private String affiliation;
    private String major;
    private String career;
    private String degree1;
    private String degree1_Start;
    private String degree1_End;
    private String degree2;
    private String degree2_Start;
    private String degree2_End;
    
    private File imagePath;
    public File getImagePath() {
        return imagePath;
    }
    public void setImagePath(File imagePath) {
        this.imagePath = imagePath;
    } 
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getDegree1() {
        return degree1;
    }

    public void setDegree1(String degree1) {
        this.degree1 = degree1;
    }

    public String getDegree1_Start() {
        return degree1_Start;
    }

    public void setDegree1_Start(String degree1_Start) {
        this.degree1_Start = degree1_Start;
    }

    public String getDegree1_End() {
        return degree1_End;
    }

    public void setDegree1_End(String degree1_End) {
        this.degree1_End = degree1_End;
    }

    public String getDegree2() {
        return degree2;
    }

    public void setDegree2(String degree2) {
        this.degree2 = degree2;
    }

    public String getDegree2_Start() {
        return degree2_Start;
    }

    public void setDegree2_Start(String degree2_Start) {
        this.degree2_Start = degree2_Start;
    }

    public String getDegree2_End() {
        return degree2_End;
    }

    public void setDegree2_End(String degree2_End) {
        this.degree2_End = degree2_End;
    }

    

    
    
    
    
    
}
