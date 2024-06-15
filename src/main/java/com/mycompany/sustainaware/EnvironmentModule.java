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
public class EnvironmentModule extends javax.swing.JFrame {
    
    int nextButtonCount = 0;
    int questionCount = 0;
    ArrayList<String> lesson = new ArrayList<>();
    
    int questionSet = 1;
   
    
    /**
     * Creates new form EnvironmentModule
     */
    public EnvironmentModule() {
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
        lesson.add("PART ONE: POSITIVE IMPACTS");
        lesson.add("Although technology when seen since the beginning can seem like a net negative for the environment \ndue to the studies that keep coming out about how we live in the hottest the Earth \nhas ever been, as tech advances and improves, we have seen a huge shift towards renewable \nenergy and less harmful ways of producing the parts that are historically the worse towards the \nenvironment such as batteries which are moving from Lithium Ion to new tech such as graphite which are \nsolid state, meaning they are also at a lower risk of leaking harmful chemicals or catching on fire");
        lesson.add("There have equally been improvements in the way we get rid of old and/or damaged tech. Not only are \nthere specific centers to bring damaged parts such as batteries, but we also have \nimproved the way we can recycle these parts to reduce the amount of mining for new parts");
        lesson.add("This recycling technology is also getting much more affordable due to the amount of research and \ndevelopment put every year towards making this goal more attainable ");
        lesson.add("Another huge source of pollution and negative impacts towards our environment comes from our own \nhouses which are often very inefficient as we forget to turn off wasteful appliances. \nFor example, smart thermostats save a lot of energy and reduce waste by controlling the \ntemperature based on your behavior and when you leave and enter the house. Another point is that \nthe appliances themselves are getting more efficient, such as dishwashers and washing machines \nwhich are smarter at using water, deducing the amount that is used per cycle. Finally is appliances that \ncan self diagnose, reducing the need to buy new appliances but rather fixing your existing ones");
        lesson.add("Tech’s increased use in school and work environments significantly reduces the amount of paper and \npen waste by turning activities that involve these tool digital");
        lesson.add("As more and more people work from home due to advancements in communication technology, less cars \nare on the road leading to a reduces amount of pollution ");
        lesson.add("Farming is another sector involving a lot of pollution and waste that technology is helping render \nless harmful. There are new companies focusing on AIs that can be trained to reduce \nthe amount of harmful chemicals and pesticides used by targeting only infested or at risk \nareas, or more recently by using lasers. ");
        lesson.add("Question Break!");
        lesson.add("PART TWO: NEGATIVE IMPACTS");
        lesson.add("Since the introduction of new technologies, the medical field has seen an unbelievable amount of progress. \nWhereas a few decades ago, people died of causes yet unknown, we now have the \ntechnology required not only to detect and identify the problem someone may be having, \nbut also a way to help them using machines with minimal precision");
        lesson.add("Think for a moment about the importance of X-Rays, MRIs and other tools such as fitness trackers with heart \nrate and blood glucose monitors and how essential they are towards our health \nin the modern day. This is especially true for people with conditions such as diabetes \nwhich use glucometers and people with other disabilities who would not be able to survive without \nmodern technology. An example of this is people who require a pacemaker for example, these \npeople get to live better and enjoy more things for longer due to technology");
        lesson.add("Using technology and modern math, doctors are also able to tell the likeliness of someone having a specific \nillness, allowing for better and earlier preventative measures for genetically \ninherited diseases");
        lesson.add("The internet is also a big player in this space as people can now search up symptoms and have a better idea \nof what they are dealing with while waiting for a doctors help (it is not recommended \nto take the internets conclusion as medical advice)");
        lesson.add("Apps on our phones and smartwatches among other devices encourage people to be healthier and more active \nusing notifications");
        lesson.add("Doctors and other health professionals are also more accessible than ever as appoints are easier to make \nby phone call or online, and doctors appointments themselves can be done over long \ndistances in case of emergencies ");
        lesson.add("");
    }
    
    Questions firstPositiveQ = new Questions("How has technology improved the efficiency of people’s households to reduce waste?", "By introducing new, more wasteful appliances packed with new features", "By introducing new features aimed at optimizing and reducing the amount of resources these appliances use", "By promoting the use of disposable and one-time use plastics", "By intentionally making appliances last a shorter time (planned obsolescence)", "b");
    Questions secondPositiveQ = new Questions("What impact did the increase of use of electronic devices have on schools and workplaces?", "It reduced the amount of paper used in favor of reusable tablets and computers using programs such as spreadsheets", "It had no significant impact", "This promotes the use of even more pen and paper waste", "None of the above", "a");
    Questions thirdPositiveQ = new Questions("How is new technology used to make farming better for the environment?", "By reducing the need for food, and therefore less farming", "New electric tractors reduce significantly a farm’s carbon footprint", "Less pesticides can be used in favor of more precise laser removal of unwanted plants and bugs", "By COMPLETELY removing the need for pesticides using AI technology", "c");
    
    Questions firstNegativeQ = new Questions("How do factories contribute to global warming?", "They often support local initiatives for reducing carbon emissions", "They release harmful chemicals and minerals into the air", "They pollute the surrounding water", "B and C", "d");
    Questions secondNegativeQ = new Questions("What is the biggest impact mining minerals often has on the environment?", "Air pollution", "Water pollution", "Deforestation and destruction of habitats", "None of the above", "c");
    Questions thirdNegativeQ = new Questions("What type of energy are we going to lose at some point in the future?", "Renewable energy", "Minerals", "Lithium", "Non-Renewable", "d");
    

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
        nextButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextLabel = new javax.swing.JTextArea();
        answerField = new javax.swing.JTextField();
        finalLabel = new javax.swing.JLabel();
        SubButton = new javax.swing.JButton();
        rightLabel1 = new javax.swing.JLabel();
        wrongLabel1 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        rightLabel2 = new javax.swing.JLabel();
        wrongLabel2 = new javax.swing.JLabel();
        rightLabel3 = new javax.swing.JLabel();
        wrongLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Module 1: Environmental Impact");

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        mainTextLabel.setColumns(20);
        mainTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainTextLabel.setRows(5);
        mainTextLabel.setText("PRESS \"NEXT\" TO START");
        mainTextLabel.setFocusable(false);
        mainTextLabel.setHighlighter(null);
        jScrollPane1.setViewportView(mainTextLabel);

        finalLabel.setText("Type your answer (letter) here: ");

        SubButton.setText("SUBMIT");
        SubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubButtonActionPerformed(evt);
            }
        });

        rightLabel1.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel1.setText("RIGHT! +25 XP");

        wrongLabel1.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel1.setText("WRONG! +0 XP");

        q1.setText("Q1:");

        q2.setText("Q2:");

        q3.setText("Q3:");

        rightLabel2.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel2.setText("RIGHT! +25 XP");

        wrongLabel2.setForeground(new java.awt.Color(251, 51, 51));
        wrongLabel2.setText("WRONG +0 XP");

        rightLabel3.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel3.setText("RIGHT! +25 XP");

        wrongLabel3.setForeground(new java.awt.Color(251, 51, 51));
        wrongLabel3.setText("WRONG! +0 XP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 286, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(q3)
                        .addGap(18, 18, 18)
                        .addComponent(rightLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(wrongLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q1)
                                .addGap(18, 18, 18)
                                .addComponent(rightLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(wrongLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q2)
                                .addGap(18, 18, 18)
                                .addComponent(rightLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(wrongLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalLabel)
                            .addComponent(SubButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
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
                            .addComponent(wrongLabel3))))
                .addGap(25, 25, 25))
        );

        setSize(new java.awt.Dimension(814, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ModuleSelect screen = new ModuleSelect();
        screen.setVisible(true);
        screen.toFront();
        ModuleSelect.EnvButton.setEnabled(false);
        ModuleSelect.EnvCompletionLabel.setForeground(Color.green);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        System.out.println(nextButtonCount);
        try{
            if (nextButtonCount == 9){
                nextButton.setVisible(false);
                finalLabel.setVisible(true);
                answerField.setVisible(true);
                SubButton.setVisible(true);
                mainTextLabel.setText(firstPositiveQ.toString());
            } else if (nextButtonCount == 16){
                questionCount = 0;
                questionSet = 2;
                nextButton.setVisible(false);
                finalLabel.setVisible(true);
                answerField.setVisible(true);
                SubButton.setVisible(true);
                mainTextLabel.setText(firstNegativeQ.toString());
            } else if (nextButtonCount == 17){
                mainTextLabel.setText("Module 1 Finished. You may go back to the main menu.");
                backButton.setVisible(true);
                ModuleSelect.envComp = 100;
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
            java.util.logging.Logger.getLogger(EnvironmentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnvironmentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnvironmentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnvironmentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnvironmentModule().setVisible(true);
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
