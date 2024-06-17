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
public class HealthModule extends javax.swing.JFrame {

    int nextButtonCount = 0;
    int questionCount = 0;
    ArrayList<String> lesson = new ArrayList<>();
    
    int questionSet = 1;
    
    /**
     * Creates new form HealthModule
     */
    public HealthModule() {
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
        lesson.add("Since the introduction of new technologies, the medical field has seen an unbelievable amount of \nprogress. Whereas a few decades ago, people died of causes yet unknown, we now have the technology required \nnot only to detect and identify the problem someone may be having, but also a way to help them \nusing machines with minimal precision");
        lesson.add("Think for a moment about the importance of X-Rays, MRIs and other tools such as fitness trackers with \nheart rate and blood glucose monitors and how essential they are towards our health in the modern day. \nThis is especially true for people with conditions such as diabetes which use glucometers and \npeople with other disabilities who would not be able to survive without modern technology. An example of \nthis is people who require a pacemaker for example, these people get to live better and enjoy more things for longer due to technology");
        lesson.add("Using technology and modern math, doctors are also able to tell the likeliness of someone having a \nspecific illness, allowing for better and earlier preventative measures for genetically inherited diseases");
        lesson.add("The internet is also a big player in this space as people can now search up symptoms and have a better \nidea of what they are dealing with while waiting for a doctors help (it is not recommended to take the \ninternets conclusion as medical advice)");
        lesson.add("Apps on our phones and smartwatches among other devices encourage people to be healthier and more active \nusing notifications");
        lesson.add("Doctors and other health professionals are also more accessible than ever as appoints are easier to make \nby phone call or online, and doctors appointments themselves can be done over long distances in case \nof emergencies");
        lesson.add("QUESTION TIME!");
        lesson.add("PART TWO: NEGATIVE IMPACTS:");
        lesson.add("Effects on the mind: Due to the accessibility, ease of use, and the entertaining nature of mobile devices \nand personal computers, they are often prone to be overused which can be detrimental for mental health \nleading to feelings of depression due to the way they overstimulate the brain with dopamine \nrelease and a feeling of isolation especially when the parasocial relationships some have with online \npersonalities such as streamers and youtubers");
        lesson.add("Cyberbullying is also a big threat that has come to existence due to technology. According to JAAPL, nearly \n15 percent of teenagers have experienced cyberbullying in the past. This has resulted in the number \nof teen suicide increasing dramatically these past couple of decades");
        lesson.add("Linking back to the first module, animals and plants aren’t the only being affected by the pollution of air \nand water sources as the people living near the aforementioned factories often have high rates of \ncancer, leading often to premature death as these places are often not as wealthy and therefore \ndo not have the best access to healthcare.");
        lesson.add("This also affects people living in wealthier countries, however, as air and water circulate, bringing a \nlesser concentration of chemicals to other places in the world. Many of these chemicals stay in the water \nno matter the quality of the water treatment plants, leading to many different types of \ndiseases");
        lesson.add("In kids, many studies have shown that the use of digital devices for entertainment has had a major negative \nimpact on children’s attention spans and levels of concentration");
        lesson.add("The nature of TVs and PCs cause people to be sitting or laying down for large periods of time, resulting in \nless movement and activity during the day which causes many diseases and most commonly obesity, which \ncan lead to complications such as heart problems and diabetes among many others.");
        lesson.add("The overuse of screens and devices with screens also results in a number of issues such as sleep problems \nwhich is proven by many researchers such as one by the NIH which also found that 60% of people use devices \nin the out before bedtime, which can also lead to long term brain-related problems");
        lesson.add("The effect these screens have on our eyes also cannot be underestimated as the number of people needing glasses \nhas gone up from roughly 25% to over 40% in the span of a few decades, that number being much bigger \nin regions such as parts of asia, where up to 80% of people require glasses");
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
        nextButton = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        rightLabel1 = new javax.swing.JLabel();
        rightLabel2 = new javax.swing.JLabel();
        rightLabel3 = new javax.swing.JLabel();
        wrongLabel1 = new javax.swing.JLabel();
        wrongLabel2 = new javax.swing.JLabel();
        wrongLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Module 2: Impacts on human health");

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

        finalLabel.setText("Type you answer (letter) here:");

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        q1.setText("Q1: ");

        q2.setText("Q2:");

        q3.setText("Q3:");

        rightLabel1.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel1.setText("RIGHT! +25 XP");

        rightLabel2.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel2.setText("RIGHT! +25 XP");

        rightLabel3.setForeground(new java.awt.Color(51, 153, 0));
        rightLabel3.setText("RIGHT! +25 XP");

        wrongLabel1.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel1.setText("WRONG! +0 XP");

        wrongLabel2.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel2.setText("WRONG! +0 XP");

        wrongLabel3.setForeground(new java.awt.Color(255, 51, 51));
        wrongLabel3.setText("WRONG! +0 XP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                                        .addComponent(wrongLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(489, 489, 489)
                        .addComponent(nextButton)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(finalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SubButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 222, Short.MAX_VALUE)
                        .addComponent(nextButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubButton)
                            .addComponent(finalLabel)
                            .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(51, 51, 51))
        );

        setSize(new java.awt.Dimension(814, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ModuleSelect screen = new ModuleSelect();
        screen.setVisible(true);
        screen.toFront();
        ModuleSelect.healthButton.setEnabled(false);
        ModuleSelect.HealthCompletionLabel.setForeground(Color.green);
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
                ModuleSelect.healthComp = 100;
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
            java.util.logging.Logger.getLogger(HealthModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthModule().setVisible(true);
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
