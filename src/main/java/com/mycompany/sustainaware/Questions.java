/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sustainaware;

/**
 *
 * @author Yahya
 */
public class Questions {
    
    private String question;
    private String ans01;
    private String ans02;
    private String ans03;
    private String ans04;
    private String correctAns;
    
    private int count = 0;
    
    public Questions(){
        question = "Unexpected. There should be a question here.";
        ans01 = "answer one";
        ans02 = "answer two";
        ans03 = "answer three";
        ans04 = "answer four";
        correctAns = "answer one";
    }
    
    public Questions(String q, String a1, String a2, String a3, String a4, String c){
        question = q;
        ans01 = a1;
        ans02 = a2;
        ans03 = a3;
        ans04 = a4;
        correctAns = c;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the ans01
     */
    public String getAns01() {
        return ans01;
    }

    /**
     * @param ans01 the ans01 to set
     */
    public void setAns01(String ans01) {
        this.ans01 = ans01;
    }

    /**
     * @return the ans02
     */
    public String getAns02() {
        return ans02;
    }

    /**
     * @param ans02 the ans02 to set
     */
    public void setAns02(String ans02) {
        this.ans02 = ans02;
    }

    /**
     * @return the ans03
     */
    public String getAns03() {
        return ans03;
    }

    /**
     * @param ans03 the ans03 to set
     */
    public void setAns03(String ans03) {
        this.ans03 = ans03;
    }

    /**
     * @return the ans04
     */
    public String getAns04() {
        return ans04;
    }

    /**
     * @param ans04 the ans04 to set
     */
    public void setAns04(String ans04) {
        this.ans04 = ans04;
    }

    /**
     * @return the correctAns
     */
    public String getCorrectAns() {
        return correctAns;
    }

    /**
     * @param correctAns the correctAns to set
     */
    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }
    
    public String toString(){
        return "Question: " + question + "\nA: " + ans01 + "\nB: " + ans02 + "\nC: " + ans03 + "\nD: " + ans04;
    }
}
