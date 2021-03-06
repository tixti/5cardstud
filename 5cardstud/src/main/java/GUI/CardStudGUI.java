package GUI;


import fivecardstud.logic.Deck;
import java.util.ArrayList;
import javax.swing.JTextField;
import fivecardstud.logic.Card;
import fivecardstud.logic.Hand;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public final class CardStudGUI extends javax.swing.JFrame {

    /**
     * Creates new form CardStudGUI
     */
    ArrayList<JTextField> cardFields = new ArrayList();

    public CardStudGUI() {
        initComponents();
        card2.setVisible(false);
        messageField.setVisible(false);
        cardFields.add(card1);
        cardFields.add(card2);
        cardFields.add(card3);
        cardFields.add(card4);
        cardFields.add(card5);
        cardFields.add(card6);
        cardFields.add(card7);
        cardFields.add(card8);
        cardFields.add(card9);
        cardFields.add(card10);
        Deck deck = new Deck();
        deck.shuffle();
        potSizeField.setText("" + 2);
        playerChipField.setText("" + 49);
        AIChipField.setText("" + 49);
        drawTwoCards();
        drawTwoCards();
        drawButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawButton = new javax.swing.JButton();
        hiddenCard = new javax.swing.JTextField();
        card4 = new javax.swing.JTextField();
        card6 = new javax.swing.JTextField();
        card8 = new javax.swing.JTextField();
        card10 = new javax.swing.JTextField();
        card1 = new javax.swing.JTextField();
        card3 = new javax.swing.JTextField();
        card5 = new javax.swing.JTextField();
        card7 = new javax.swing.JTextField();
        card9 = new javax.swing.JTextField();
        AIChipField = new javax.swing.JTextField();
        playerChipField = new javax.swing.JTextField();
        potSizeField = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        foldButton = new javax.swing.JButton();
        betButton = new javax.swing.JButton();
        card2 = new javax.swing.JTextField();
        messageField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("5CardStud");

        drawButton.setText("Draw");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        hiddenCard.setEditable(false);
        hiddenCard.setBackground(new java.awt.Color(153, 153, 153));
        hiddenCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiddenCardActionPerformed(evt);
            }
        });

        card4.setEditable(false);

        card6.setEditable(false);

        card8.setEditable(false);

        card10.setEditable(false);

        card1.setEditable(false);
        card1.setBackground(new java.awt.Color(204, 204, 204));

        card3.setEditable(false);

        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });
        card5.setEditable(false);

        card7.setEditable(false);

        card9.setEditable(false);

        AIChipField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AIChipField.setEditable(false);

        playerChipField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerChipField.setEditable(false);

        potSizeField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        potSizeField.setEditable(false);

        checkButton.setBackground(new java.awt.Color(255, 255, 0));
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        foldButton.setBackground(new java.awt.Color(255, 51, 0));
        foldButton.setText("Fold");
        foldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldButtonActionPerformed(evt);
            }
        });

        betButton.setBackground(new java.awt.Color(51, 204, 0));
        betButton.setText("Bet 1");
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });

        messageField.setEditable(false);
        messageField.setBackground(new java.awt.Color(228, 228, 228));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(potSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(foldButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(betButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(playerChipField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(hiddenCard, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AIChipField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiddenCard, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AIChipField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(potSizeField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(messageField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerChipField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(betButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed

        for (JTextField f : cardFields) {
            f.setText("");
            f.setBackground(Color.white);
        }
        hiddenCard.setText("");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        messageField.setVisible(false);
        potSizeField.setText("" + 2);
        int playerChipCount = Integer.parseInt(playerChipField.getText()) - 1;
        int AIChipCount = Integer.parseInt(AIChipField.getText()) - 1;
        if (drawButton.getText().equals("New game")) {
            drawButton.setText("Draw");
            playerChipCount = 19;
            AIChipCount = 19;
        }
        playerChipField.setText("" + playerChipCount);
        AIChipField.setText("" + AIChipCount);
        card1.setBackground(Color.LIGHT_GRAY);
        hiddenCard.setBackground(Color.GRAY);
        drawTwoCards();
        drawTwoCards();
        drawButton.setVisible(false);     
        checkButton.setVisible(true);
        if (playerChipCount > 0 && AIChipCount > 0) {
            betButton.setVisible(true);
            foldButton.setVisible(true);
        }
    }//GEN-LAST:event_drawButtonActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_card5ActionPerformed

    private void foldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldButtonActionPerformed
        // TODO add your handling code here:
        try {
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        int AIChipCount = Integer.parseInt(AIChipField.getText()) + Integer.parseInt(potSizeField.getText());
        int i = 1;
        for (JTextField field : cardFields) {
            if (i % 2 == 1 && !field.getText().isEmpty()) {
                field.setBackground(Color.gray);
                field.setText("");
            }
            i++;
        }
        AIChipField.setText("" + AIChipCount);
        potSizeField.setText("");
        drawButton.setVisible(true);
        foldButton.setVisible(false);
        checkButton.setVisible(false);
        betButton.setVisible(false);
        messageField.setVisible(true);
        messageField.setText("AI wins");
        betButton.setText("Bet 1");
    }//GEN-LAST:event_foldButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        try {
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        if (card10.getText().isEmpty()) {
            drawTwoCards();
        } else {
            handleTheEndOfHand();
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void betButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betButtonActionPerformed
        try {
            Thread.sleep(75);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        // TODO add your handling code here:
        int potSize = Integer.parseInt(potSizeField.getText());
        int AIChips = Integer.parseInt(AIChipField.getText());
        int playerChips = Integer.parseInt(playerChipField.getText());
        int bet = Integer.parseInt(betButton.getText().replaceAll("[\\D]", ""));
        potSize += bet * 2;
        AIChips -= bet;
        playerChips -= bet;
        playerChipField.setText("" + playerChips);
        AIChipField.setText("" + AIChips);
        potSizeField.setText("" + potSize);
        if (potSize / 2 > AIChips || potSize / 2 > playerChips) {
            betButton.setText("Bet " + Math.min(AIChips, playerChips));
        } else {
            betButton.setText("Bet " + (potSize / 2));
        }
        if (Integer.parseInt(betButton.getText().replaceAll("[\\D]", "")) == 0) {
            betButton.setVisible(false);
            foldButton.setVisible(false);
        }
        if (card10.getText().isEmpty()) {
            drawTwoCards();
        } else {
            handleTheEndOfHand();
        }
    }//GEN-LAST:event_betButtonActionPerformed

    private void hiddenCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiddenCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hiddenCardActionPerformed

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
            java.util.logging.Logger.getLogger(CardStudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardStudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardStudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardStudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardStudGUI().setVisible(true);
            }
        });
    }

    public void handleTheEndOfHand() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Card AICard1 = new Card(card2.getText());
        Card AICard2 = new Card(card4.getText());
        Card AICard3 = new Card(card6.getText());
        Card AICard4 = new Card(card8.getText());
        Card AICard5 = new Card(card10.getText());
        Hand AIHand = new Hand(AICard1, AICard2, AICard3, AICard4, AICard5);
        Card playerCard1 = new Card(card1.getText());
        Card playerCard2 = new Card(card3.getText());
        Card playerCard3 = new Card(card5.getText());
        Card playerCard4 = new Card(card7.getText());
        Card playerCard5 = new Card(card9.getText());
        Hand playerHand = new Hand(playerCard1, playerCard2, playerCard3, playerCard4, playerCard5);
        messageField.setVisible(true);
        if (playerHand.compareTo(AIHand) > 0) {
            int playerChips = Integer.parseInt(playerChipField.getText());
            playerChips += Integer.parseInt(potSizeField.getText());
            potSizeField.setText("");
            playerChipField.setText("" + playerChips);
            messageField.setText("Player wins with " + playerHand.getRank());
        } else if (playerHand.compareTo(AIHand) < 0) {
            int AIChips = Integer.parseInt(AIChipField.getText());
            AIChips += Integer.parseInt(potSizeField.getText());
            potSizeField.setText("");
            AIChipField.setText("" + AIChips);
            messageField.setText("AI wins with " + AIHand.getRank());
        } else {
            int playerChips = Integer.parseInt(playerChipField.getText());
            playerChips += Integer.parseInt(potSizeField.getText()) / 2;
            playerChipField.setText("" + playerChips);
            int AIChips = Integer.parseInt(AIChipField.getText());
            AIChips += Integer.parseInt(potSizeField.getText()) / 2;
            AIChipField.setText("" + AIChips);
            messageField.setText("Tie");
        }
        hiddenCard.setText(card2.getText());
        if (hiddenCard.getText().contains("Hearts")) {
            hiddenCard.setForeground(Color.red);
        } else if (hiddenCard.getText().contains("Diamonds")) {
            hiddenCard.setForeground(Color.blue);
        } else if (hiddenCard.getText().contains("Clubs")) {
            hiddenCard.setForeground(Color.green);
        } else {
            hiddenCard.setForeground(Color.BLACK);
        }
        hiddenCard.setBackground(Color.WHITE);
        card1.setBackground(Color.WHITE);
        betButton.setText("Bet 1");
        drawButton.setVisible(true);
        foldButton.setVisible(false);
        checkButton.setVisible(false);
        betButton.setVisible(false);
        if (Integer.parseInt(playerChipField.getText()) == 0) {
            messageField.setText("You lost the game");
            drawButton.setText("New game");
        }
        if (Integer.parseInt(AIChipField.getText()) == 0) {
            messageField.setText("You won the game");
            drawButton.setText("New game");
        }
    }
    public void drawTwoCards() {
        Deck deck = new Deck();
        deck.shuffle();
        ArrayList<String> usedCards = new ArrayList();
        int i = 2;
        for (JTextField field : cardFields) {
            if (!field.getText().isEmpty()) {
                usedCards.add(field.getText());
            } else if (i > 0) {
                while (true) {
                    Card card = deck.dealCard();
                    if (!usedCards.contains(card.toString())) {
                        field.setText(card.toString());
                        break;
                    }
                }
                i--;
            }
            if (field.getText().contains("Hearts")) {
                field.setForeground(Color.red);
            } else if (field.getText().contains("Diamonds")) {
                field.setForeground(Color.blue);
            } else if (field.getText().contains("Clubs")) {
                field.setForeground(Color.green);
            } else {
                field.setForeground(Color.BLACK);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AIChipField;
    private javax.swing.JButton betButton;
    private javax.swing.JTextField card1;
    private javax.swing.JTextField card10;
    private javax.swing.JTextField card2;
    private javax.swing.JTextField card3;
    private javax.swing.JTextField card4;
    private javax.swing.JTextField card5;
    private javax.swing.JTextField card6;
    private javax.swing.JTextField card7;
    private javax.swing.JTextField card8;
    private javax.swing.JTextField card9;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton drawButton;
    private javax.swing.JButton foldButton;
    private javax.swing.JTextField hiddenCard;
    private javax.swing.JTextField messageField;
    private javax.swing.JTextField playerChipField;
    private javax.swing.JTextField potSizeField;
    // End of variables declaration//GEN-END:variables
}
