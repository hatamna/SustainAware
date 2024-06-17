/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sustainaware;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Yahya
 */
public class InitiativesModule extends javax.swing.JFrame {

    int nextButtonCount = 0;
    int questionCount = 0;
    ArrayList<String> lesson = new ArrayList<>();
    
    int questionSet = 1;
    
    /**
     * Creates new form InitiativesModule
     */
    public InitiativesModule() {
        initComponents();
        backButton.setVisible(false);
        finalLabel.setVisible(false);
        answerField.setVisible(false);
        SubButton.setVisible(false);
        rightLabel1.setVisible(false);
        wrongLabel1.setVisible(false);
        rightLabel2.setVisible(false);
        wrongLabel2.setVisible(false);
        rightLabel3.setVisible(false);
        wrongLabel3.setVisible(false);
        q1.setVisible(false);
        q2.setVisible(false);
        q3.setVisible(false);
        lesson.add("PART ONE: PERSONAL - Reducing our impact on the environment:");
        lesson.add("Since most homes around the world are powered by non-renewable energy, saving electricity can be a major \nway not only to reduce cost of living but also our environmental impact. This can be done through several different \nactions such as turning off lights when we don't need them, washing more clothes at the same time to reduce both \nelectricity and water use, etc.");
        lesson.add("According to the Canadian government website, 21% of nitrogen oxide emissions are caused by cars. So it would \nhave a huge impact if more and more people used bikes and buses rather than their cars as much as they can. This \ncan save a lot of money that would be spent on gas which has significantly risen in price these past few years");
        lesson.add("Another point related to cars is to plan for your next car to be electric or hybrid. Models using this \ntechnology have had major price cuts recently, now having a negligible price difference when including the government \nincentives most would receive after buying one");
        lesson.add("The most obvious way to reduce our impact is the tried and true ‘reduce, reuse, recycle’. Did you know that \nthe average clothing item is now worn 7 times during its life? With a lot of clothes being made from polyester and \nother plastic based materials, this isn’t good for the environment. A way to make a big impact is to only buy \nclothes made from 100% clean materials such as cotton, and to wear them for longer periods of time.");
        lesson.add("Other than clothes, we can try to buy less food items packages in large amounts of plastic as that is one \nof the largest sources of plastic waste. This includes candies with wrapper but also fruits and vegetables that come \nin plastic bags and even water bottles (try to drink from the sink more often). This will also help you stay \nhealthier as you would ingest less microplastics, which are known to cause serious health problems.");
        lesson.add("Food waste leads to needing to buy more food than we need which by consequence leads to an increase in over \nfarming and over hunting, which are both really bad for multiple ecosystems around the world");
        lesson.add("The last point to be made is to vote with your money. Support local companies and those who are making an \neffort to reduce their carbon footprint, and reduce the amount of products you buy that are bad for the environment \nand from companies who do not care.");
        lesson.add("PART TWO: PERSONAL - Reducing the impact on us:");
        lesson.add("The age groups seeing the largest negative impacts of tech are children under the age of 5 and teenagers, and \nboth need to use different strategies.");
        lesson.add("For children, those under the age of 18 months should not be using electronic devices altogether as they need \nto be interacting with real world toys and objects to develop basic human senses. Those older than that should \nwatch TV and use devices such as iPads in moderation and under heavy monitoring, parents should know and choose \nwhat their kids watch or do online due to the dangers of the internet. These parents should also limit the \namount of time kids spend with tech as it can be very addictive if not used properly.");
        lesson.add("For teenagers, however, it gets a little more difficult. For many people, having a device with them at all \ntimes is necessary for work, school, and social life. Social media apps have taken advantage of this by making \naddictive apps that bundle entertainment with messaging to maximize the time spent on their apps. When looking \nthrough social media, one can see what seems to be other people’s perfect lives, but it is not that easy to \nrealize that those people also have issues but choose to only share the good part of their lives to the internet. This \nis one of the major phenomena that causes teenagers to feel like they aren’t living a good life, leading to increased depression and suicide rates.");
        lesson.add("Despite that many think, it is necessary for teens to limit their screen time to what experts say should be \naround 2 hours a day. For many this goal seems unachievable, but it can be done over the course of a long time \nusing specific strategies.");
        lesson.add("The first of these is to spend more time with family and friends without you devices on you. Many people only \ncommunicate with others through text but this is more harmful than it may seem as we humans need to see and hear \nother humans often. This means gathering in person and maybe playing board games or in general talking and \ndiscussing");
        lesson.add("Another way it to use your phone’s built in app limit to reduce the amount you spend on specific apps you deem \nto be harmful to you");
        lesson.add("A good idea would be to find new hobbies, especially if they require you to go outside more often. The \npositive effects this can have on mental health are often very underestimated");
        lesson.add("Personal Computers have a very specific downside, related to the way most chose to use them. When used while \nsitting down, the proper posture is often not achieved, causing damage to many bones in our bodies including the \nspine, which can later lead to fatigue or in some cases carpal tunnel and other possible issues. We can reduce \nthis by using standing desks where possible, this reduces the time spent sitting down as the user can split \nthe time between sitting and standing whenever they start feeling uncomfortable. Another item to consider would be \nergonomic peripherals such as mice and keyboards to reduce arm and hand related injuries. Finally, when sitting down, \nit is highly recommended to follow ergonomic standards, which include: Your chair should help rest your lower back, your \nfeet should be fully touching the floor, while your thighs should be parallel to it, your monitor should be about an arm’s \nlength away from your eyes, and finally, your hands and elbows should be at the same height.");
        lesson.add("PART THREE: GENERAL - Programs and Initiatives");
        lesson.add("We are lucky here in Ottawa to have a good amount of recycling centers, each for different purposes.");
        lesson.add("One of these, which is specific to tech, is RecycleMyElectronics, which has 6 locations all across Ottawa to \nmake it easier to recycle. Their mission is to reduce the amount of e-waste going into canadian landfills, but due \nto their knowledge of electronics, they also offer services such as making sure a hard drive is completely \nerased before being potentially reused");
        lesson.add("Another one, specifically in Merivale is Quantum Life Recycling, who achieve a very similar goal as the \nprevious example.");
        lesson.add("Very similar to the other two is ERA Canada, any of these if fine so choose the closest or more convenient \none to you");
        lesson.add("Sustainable Development Technology Canada is a government organization who focuses on providing the proper \nfunding and help to canadian organizations whose goal is to develop sustainable technologies or to reduce Canada’s \ncarbon footprint");
        lesson.add("The Ottawa Climate Action Fund (OCAF) is also a similar organization, whose goal is to discuss with people \nand communities around Ottawa about ways of reducing our cities carbon footprint. Their ultimate goal is to achieve \na carbon-neutral ottawa.");
        lesson.add("Electronics Product Stewardship Canada is a non-profit and focuses on making sure electronics are being \ndisposed of properly so the dangerous and valuable metals within them do not end up in our landfills or water supplies.");
    }
    Questions firstQ_Set3 = new Questions("What is a major reason for recycling electronics?", "Because they contain both rare and toxic metals that cause damage to our environment", "Because big companies need to save money", "To reduce the need for new devices ", "All of the above", "a");
    Questions secondQ_Set3 = new Questions("What is a major reason for giving your old or broken electronics to a recycling center?", "So that electronic and its parts can be reused", "To free up space in canadian landfills", "Because it sometimes comes with discounts for new technology", "All of the above", "d");
    Questions thirdQ_Set3 = new Questions("How many recycling centers are in Ottawa?", "1", "2", "Many", "None", "c");
    
    Questions firstQ_Set2 = new Questions("Which age group should not use a mobile device on a regular basis?", "2-5 year olds", "1.5 year olds and under", "5-12 year olds", "Teenagers", "b");
    Questions secondQ_Set2 = new Questions("Why should parents supervise their children while they are using devices connected to the internet?", "To prevent addiction", "To protect against malicious strangers", "To prevent them from viewing potentially disturbing material", "All of the above", "d");
    Questions thirdQ_Set2 = new Questions("What is the recommended screen time for teenagers?", "1 hour", "2 hours", "3 hours", "4 hours", "b");
    
    Questions firstQ_Set1 = new Questions("Which action can be taken to reduce our electricity usage at home?", "Washing more clothes at the same time", "Leaving lights on as much as possible", "Using more air conditioning in the summer", "Taking longer showers", "a");
    Questions secondQ_Set1 = new Questions("Which of the following are methods of transportation that can be used to reduce nitrogen oxide emissions?", "Buses", "Cars", "Trucks", "Planes", "a");
    Questions thirdQ_Set1 = new Questions("What is the benefit of wasting less food?", "Lower electricity consumption", "Lower water consumption", "Reducing over farming and over hunting", "Reducing air pollution ", "c");
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextLabel = new javax.swing.JTextArea();
        SubButton = new javax.swing.JButton();
        finalLabel = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        wrongLabel1 = new javax.swing.JLabel();
        wrongLabel2 = new javax.swing.JLabel();
        wrongLabel3 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        rightLabel1 = new javax.swing.JLabel();
        rightLabel2 = new javax.swing.JLabel();
        rightLabel3 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Module Three: Responsible use, Reducing the impact, and Initiatives");

        mainTextLabel.setColumns(20);
        mainTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainTextLabel.setRows(5);
        mainTextLabel.setText("PRESS \"NEXT\" TO START");
        jScrollPane1.setViewportView(mainTextLabel);

        SubButton.setText("SUBMIT");
        SubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubButtonActionPerformed(evt);
            }
        });

        finalLabel.setText("Type in your answer (letter) here:");

        wrongLabel1.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel1.setText("WRONG! +0 XP");

        wrongLabel2.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel2.setText("WRONG! +0 XP");

        wrongLabel3.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel3.setText("WRONG! +0 XP");

        q1.setText("Q1: ");

        q2.setText("Q2:");

        q3.setText("Q3:");

        rightLabel1.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel1.setText("RIGHT! +25 XP");

        rightLabel2.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel2.setText("RIGHT! +25 XP");

        rightLabel3.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel3.setText("RIGHT! +25 XP");

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(finalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SubButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q2)
                                    .addComponent(q3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rightLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wrongLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(rightLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wrongLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q1)
                                .addGap(18, 18, 18)
                                .addComponent(rightLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wrongLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubButton)
                    .addComponent(finalLabel)
                    .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q1)
                            .addComponent(rightLabel1)
                            .addComponent(wrongLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q2)
                            .addComponent(rightLabel2)
                            .addComponent(wrongLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q3)
                            .addComponent(rightLabel3)
                            .addComponent(wrongLabel3)))
                    .addComponent(nextButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(814, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       ModuleSelect screen = new ModuleSelect();
        screen.setVisible(true);
        screen.toFront();
        ModuleSelect.IniButton.setEnabled(false);
        ModuleSelect.IniCompletionLabel.setForeground(Color.green);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        System.out.println(nextButtonCount);
        try{
            if (nextButtonCount == 8){
                nextButton.setVisible(false);
                finalLabel.setVisible(true);
                answerField.setVisible(true);
                SubButton.setVisible(true);
                mainTextLabel.setText(firstQ_Set1.toString());
            } else if (nextButtonCount == 17){
                questionCount = 0;
                questionSet = 2;
                nextButton.setVisible(false);
                finalLabel.setVisible(true);
                answerField.setVisible(true);
                SubButton.setVisible(true);
                mainTextLabel.setText(firstQ_Set2.toString());
            } else if (nextButtonCount == 25){
                questionCount = 0;
                questionSet = 2;
                nextButton.setVisible(false);
                finalLabel.setVisible(true);
                answerField.setVisible(true);
                SubButton.setVisible(true);
                mainTextLabel.setText(firstQ_Set3.toString());
            } else if (nextButtonCount == 26){
                mainTextLabel.setText("Module 3 Finished. You may go back to the main menu.");
                backButton.setVisible(true);
                ModuleSelect.iniComp = 100;
            } else {
                mainTextLabel.setText(lesson.get(nextButtonCount));
            }
            nextButtonCount += 1;
        } catch (IndexOutOfBoundsException e){
            System.out.println("...");
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void SubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubButtonActionPerformed
        if (questionSet == 1){
            switch (questionCount){
                case 0:
                    System.out.println("CASE 0");
                    mainTextLabel.setText(secondQ_Set1.toString());
                    q1.setVisible(true);
                    if (answerField.getText().toLowerCase().equals(firstQ_Set1.getCorrectAns())){
                        System.out.println("RIGHT");
                        rightLabel1.setVisible(true);
                        ModuleSelect.XP += 25;
                    } else {
                        System.out.println("WRONG");
                        wrongLabel1.setVisible(true);
                    }
                    questionCount += 1;
                    answerField.setText("");
                    break;
                case 1:
                    System.out.println("CASE 1");
                    mainTextLabel.setText(thirdQ_Set1.toString());
                    q2.setVisible(true);
                    if (answerField.getText().toLowerCase().equals(secondQ_Set1.getCorrectAns())){
                        System.out.println("RIGHT");
                        ModuleSelect.XP += 25;
                        rightLabel2.setVisible(true);
                    } else {
                        System.out.println("WRONG");
                        wrongLabel2.setVisible(true);
                    }
                    questionCount += 1;
                    answerField.setText("");
                    break;
                case 2:
                    System.out.println("CASE 2");
                    mainTextLabel.setText("");
                    q3.setVisible(true);
                    if (answerField.getText().toLowerCase().equals(thirdQ_Set1.getCorrectAns())){
                        System.out.println("RIGHT");
                        ModuleSelect.XP += 25;
                        rightLabel3.setVisible(true);
                    } else {
                        System.out.println("WRONG");
                        wrongLabel3.setVisible(true);
                    }
                    questionCount += 1;
                    answerField.setText("");

                    nextButton.setVisible(true);
                    finalLabel.setVisible(false);
                    answerField.setVisible(false);
                    SubButton.setVisible(false);
                    q1.setVisible(false);
                    q2.setVisible(false);
                    q3.setVisible(false);
                    rightLabel1.setVisible(false);
                    rightLabel2.setVisible(false);
                    rightLabel3.setVisible(false);
                    wrongLabel1.setVisible(false);
                    wrongLabel2.setVisible(false);
                    wrongLabel3.setVisible(false);
                    mainTextLabel.setText(lesson.get(nextButtonCount - 1));
                    break;
                default:
                    System.out.print("Error.");
            }
        } else if (questionSet == 2){
            switch (questionCount){
            case 0:
                q1.setVisible(true);
                q2.setVisible(true);
                q3.setVisible(true);
                mainTextLabel.setText(secondQ_Set2.toString());
                if (answerField.getText().toLowerCase().equals(firstQ_Set2.getCorrectAns())){
                    System.out.println("RIGHT");
                    ModuleSelect.XP += 25;
                    rightLabel1.setVisible(true);
                } else {
                    System.out.println("WRONG");
                    wrongLabel1.setVisible(true);
                }
                questionCount += 1;
                answerField.setText("");
                break;
            case 1:
                mainTextLabel.setText(thirdQ_Set2.toString());
                if (answerField.getText().toLowerCase().equals(secondQ_Set2.getCorrectAns())){
                    System.out.println("RIGHT");
                    ModuleSelect.XP += 25;
                    rightLabel2.setVisible(true);
                } else {
                    System.out.println("WRONG");
                    wrongLabel2.setVisible(true);
                }
                questionCount += 1;
                answerField.setText("");
                break;
            case 2:
                if (answerField.getText().toLowerCase().equals(thirdQ_Set2.getCorrectAns())){
                    System.out.println("RIGHT");
                    ModuleSelect.XP += 25;
                    rightLabel3.setVisible(true);
                } else {
                    System.out.println("WRONG");
                    wrongLabel3.setVisible(true);
                }
                questionCount += 1;
                answerField.setText("");
                
                nextButton.setVisible(true);
                finalLabel.setVisible(false);
                answerField.setVisible(false);
                SubButton.setVisible(false);
                q1.setVisible(false);
                q2.setVisible(false);
                q3.setVisible(false);
                rightLabel1.setVisible(false);
                rightLabel2.setVisible(false);
                rightLabel3.setVisible(false);
                wrongLabel1.setVisible(false);
                wrongLabel2.setVisible(false);
                wrongLabel3.setVisible(false);
                break;
            default:
                System.out.print("IDK");
            }
        } else {
            switch (questionCount){
            case 0:
                q1.setVisible(true);
                q2.setVisible(true);
                q3.setVisible(true);
                mainTextLabel.setText(secondQ_Set3.toString());
                if (answerField.getText().toLowerCase().equals(firstQ_Set3.getCorrectAns())){
                    System.out.println("RIGHT");
                    ModuleSelect.XP += 25;
                    rightLabel1.setVisible(true);
                } else {
                    System.out.println("WRONG");
                    wrongLabel1.setVisible(true);
                }
                questionCount += 1;
                answerField.setText("");
                break;
            case 1:
                mainTextLabel.setText(thirdQ_Set3.toString());
                if (answerField.getText().toLowerCase().equals(secondQ_Set3.getCorrectAns())){
                    System.out.println("RIGHT");
                    ModuleSelect.XP += 25;
                    rightLabel2.setVisible(true);
                } else {
                    System.out.println("WRONG");
                    wrongLabel2.setVisible(true);
                }
                questionCount += 1;
                answerField.setText("");
                break;
            case 2:
                if (answerField.getText().toLowerCase().equals(thirdQ_Set3.getCorrectAns())){
                    System.out.println("RIGHT");
                    ModuleSelect.XP += 25;
                    rightLabel3.setVisible(true);
                } else {
                    System.out.println("WRONG");
                    wrongLabel3.setVisible(true);
                }
                questionCount += 1;
                answerField.setText("");
                
                nextButton.setVisible(true);
                finalLabel.setVisible(false);
                answerField.setVisible(false);
                SubButton.setVisible(false);
                break;
            default:
                System.out.print("IDK");
            }
        }
    }//GEN-LAST:event_SubButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InitiativesModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitiativesModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitiativesModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitiativesModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitiativesModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubButton;
    private javax.swing.JTextField answerField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel finalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mainTextLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel rightLabel1;
    private javax.swing.JLabel rightLabel2;
    private javax.swing.JLabel rightLabel3;
    private javax.swing.JLabel wrongLabel1;
    private javax.swing.JLabel wrongLabel2;
    private javax.swing.JLabel wrongLabel3;
    // End of variables declaration//GEN-END:variables
}
