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
        lesson.add("Since most homes around the world are powered by non-renewable energy, saving electricity can be a major way not only to reduce cost of living but also our environmental impact. This can be done through several different actions such as turning off lights when we don't need them, washing more clothes at the same time to reduce both electricity and water use, etc.");
        lesson.add("According to the Canadian government website, 21% of nitrogen oxide emissions are caused by cars. So it would have a huge impact if more and more people used bikes and buses rather than their cars as much as they can. This can save a lot of money that would be spent on gas which has significantly risen in price these past few years");
        lesson.add("Another point related to cars is to plan for your next car to be electric or hybrid. Models using this technology have had major price cuts recently, now having a negligible price difference when including the government incentives most would receive after buying one");
        lesson.add("The most obvious way to reduce our impact is the tried and true ‘reduce, reuse, recycle’. Did you know that the average clothing item is now worn 7 times during its life? With a lot of clothes being made from polyester and other plastic based materials, this isn’t good for the environment. A way to make a big impact is to only buy clothes made from 100% clean materials such as cotton, and to wear them for longer periods of time.");
        lesson.add("Other than clothes, we can try to buy less food items packages in large amounts of plastic as that is one of the largest sources of plastic waste. This includes candies with wrapper but also fruits and vegetables that come in plastic bags and even water bottles (try to drink from the sink more often). This will also help you stay healthier as you would ingest less microplastics, which are known to cause serious health problems.");
        lesson.add("Food waste leads to needing to buy more food than we need which by consequence leads to an increase in over farming and over hunting, which are both really bad for multiple ecosystems around the world");
        lesson.add("The last point to be made is to vote with your money. Support local companies and those who are making an effort to reduce their carbon footprint, and reduce the amount of products you buy that are bad for the environment and from companies who do not care.");
        lesson.add("PART TWO: PERSONAL - Reducing the impact on us:");
        lesson.add("The age groups seeing the largest negative impacts of tech are children under the age of 5 and teenagers, and both need to use different strategies.");
        lesson.add("For children, those under the age of 18 months should not be using electronic devices altogether as they need to be interacting with real world toys and objects to develop basic human senses. Those older than that should watch TV and use devices such as iPads in moderation and under heavy monitoring, parents should know and choose what their kids watch or do online due to the dangers of the internet. These parents should also limit the amount of time kids spend with tech as it can be very addictive if not used properly.");
        lesson.add("For teenagers, however, it gets a little more difficult. For many people, having a device with them at all times is necessary for work, school, and social life. Social media apps have taken advantage of this by making addictive apps that bundle entertainment with messaging to maximize the time spent on their apps. When looking through social media, one can see what seems to be other people’s perfect lives, but it is not that easy to realize that those people also have issues but choose to only share the good part of their lives to the internet. This is one of the major phenomena that causes teenagers to feel like they aren’t living a good life, leading to increased depression and suicide rates.");
        lesson.add("Despite that many think, it is necessary for teens to limit their screen time to what experts say should be around 2 hours a day. For many this goal seems unachievable, but it can be done over the course of a long time using specific strategies.");
        lesson.add("The first of these is to spend more time with family and friends without you devices on you. Many people only communicate with others through text but this is more harmful than it may seem as we humans need to see and hear other humans often. This means gathering in person and maybe playing board games or in general talking and discussing");
        lesson.add("Another way it to use your phone’s built in app limit to reduce the amount you spend on specific apps you deem to be harmful to you");
        lesson.add("A good idea would be to find new hobbies, especially if they require you to go outside more often. The positive effects this can have on mental health are often very underestimated");
        lesson.add("Personal Computers have a very specific downside, related to the way most chose to use them. When used while sitting down, the proper posture is often not achieved, causing damage to many bones in our bodies including the spine, which can later lead to fatigue or in some cases carpal tunnel and other possible issues. We can reduce this by using standing desks where possible, this reduces the time spent sitting down as the user can split the time between sitting and standing whenever they start feeling uncomfortable. Another item to consider would be ergonomic peripherals such as mice and keyboards to reduce arm and hand related injuries. Finally, when sitting down, it is highly recommended to follow ergonomic standards, which include: Your chair should help rest your lower back, your feet should be fully touching the floor, while your thighs should be parallel to it, your monitor should be about an arm’s length away from your eyes, and finally, your hands and elbows should be at the same height.");
        lesson.add("PART THREE: GENERAL - Programs and Initiatives");
        lesson.add("We are lucky here in Ottawa to have a good amount of recycling centers, each for different purposes.");
        lesson.add("One of these, which is specific to tech, is RecycleMyElectronics, which has 6 locations all across Ottawa to make it easier to recycle. Their mission is to reduce the amount of e-waste going into canadian landfills, but due to their knowledge of electronics, they also offer services such as making sure a hard drive is completely erased before being potentially reused");
        lesson.add("Another one, specifically in Merivale is Quantum Life Recycling, who achieve a very similar goal as the previous example.");
        lesson.add("Very similar to the other two is ERA Canada, any of these if fine so choose the closest or more convenient one to you");
        lesson.add("Sustainable Development Technology Canada is a government organization who focuses on providing the proper funding and help to canadian organizations whose goal is to develop sustainable technologies or to reduce Canada’s carbon footprint");
        lesson.add("The Ottawa Climate Action Fund (OCAF) is also a similar organization, whose goal is to discuss with people and communities around Ottawa about ways of reducing our cities carbon footprint. Their ultimate goal is to achieve a carbon-neutral ottawa.");
        lesson.add("Electronics Product Stewardship Canada is a non-profit and focuses on making sure electronics are being disposed of properly so the dangerous and valuable metals within them do not end up in our landfills or water supplies.");
    }
    Questions firstPositiveQ = new Questions("How do fitness trackers and fitness apps on mobile devices help people stay active?", "By notifying them when they have eaten too much", "By entertaining them", "By diagnosing diseases ", "By keeping track of heart rate, blood glucose, and kilometers walked", "d");
    Questions secondPositiveQ = new Questions("What is the biggest positive role the internet has had on improving the medical field?", "It provides final and definitive medical conclusions", "It replaces doctors and removes the need for them completely", "It allows people to search up possible symptoms to get a general idea of what's going on", "All of the above", "c");
    Questions thirdPositiveQ = new Questions("What should be heavily considered if searching for medical advice on the internet?", "The information is often inaccurate and sometimes misleading, so it is important to take that information with a heavy grain of salt", "It should be taken as definitive advice", "Many diseases and conditions share symptoms, meaning it is impossible for the internet to know what’s going on in someone’s specific case", "A and C", "d");
    
    Questions firstNegativeQ = new Questions("What health side effects does sitting at a desk for extended periods of time cause?", "Improved mental health", "More physical activity ", "Obesity along with complications such as heart issues", "None of the above", "c");
    Questions secondNegativeQ = new Questions("What impact on children’s human health has the increase in use of mobile devices do?", "Major positive impact", "Minor positive impact", "Minor negative impact", "Major negative impact", "d");
    Questions thirdNegativeQ = new Questions("How does being near a factory affect the people typically living in developing countries?", "It gives them access to better healthcare ", "It decreases the amount of jobs in the area", "They often have high rates of cancer due to the air and water pollution caused by some factories", "They have fewer health issues", "c");
    
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
                mainTextLabel.setText(firstPositiveQ.toString());
            } else if (nextButtonCount == 17){
                questionCount = 0;
                questionSet = 2;
                nextButton.setVisible(false);
                finalLabel.setVisible(true);
                answerField.setVisible(true);
                SubButton.setVisible(true);
                mainTextLabel.setText(firstNegativeQ.toString());
            } else if (nextButtonCount == 18){
                mainTextLabel.setText("Module 2 Finished. You may go back to the main menu.");
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
                    mainTextLabel.setText(secondPositiveQ.toString());
                    q1.setVisible(true);
                    if (answerField.getText().toLowerCase().equals(firstPositiveQ.getCorrectAns())){
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
                    mainTextLabel.setText(thirdPositiveQ.toString());
                    q2.setVisible(true);
                    if (answerField.getText().toLowerCase().equals(secondPositiveQ.getCorrectAns())){
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
                    if (answerField.getText().toLowerCase().equals(thirdPositiveQ.getCorrectAns())){
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
        } else {
            switch (questionCount){
            case 0:
                q1.setVisible(true);
                q2.setVisible(true);
                q3.setVisible(true);
                mainTextLabel.setText(secondNegativeQ.toString());
                if (answerField.getText().toLowerCase().equals(firstNegativeQ.getCorrectAns())){
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
                mainTextLabel.setText(thirdNegativeQ.toString());
                if (answerField.getText().toLowerCase().equals(secondNegativeQ.getCorrectAns())){
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
                if (answerField.getText().toLowerCase().equals(thirdNegativeQ.getCorrectAns())){
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
