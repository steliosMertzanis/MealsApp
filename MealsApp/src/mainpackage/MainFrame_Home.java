/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainpackage;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainFrame_Home extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame_Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 12), new java.awt.Dimension(0, 12), new java.awt.Dimension(32767, 12));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanelTitle = new javax.swing.JPanel();
        jButtonDisplayData = new javax.swing.JButton();
        jButtonDisplayList = new javax.swing.JButton();
        jButtonDisplayStats = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(18, 0), new java.awt.Dimension(18, 0), new java.awt.Dimension(18, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 32767));
        jMenuBar = new javax.swing.JMenuBar();
        jMenuSystem = new javax.swing.JMenu();
        jMenuItemR2 = new javax.swing.JMenuItem();
        jMenuItemR3 = new javax.swing.JMenuItem();
        jMenuItemR4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCredits = new javax.swing.JMenuItem();
        jSeparator = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("iMeals ™ 2023");
        setBounds(new java.awt.Rectangle(120, 120, 800, 600));
        setLocation(new java.awt.Point(120, 120));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("mainframe"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "   Εφαρμογή Προβολής Πληροφοριών Γευμάτων  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jButtonDisplayData.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonDisplayData.setText("Προβολή δεδομένων γευμάτων");
        jButtonDisplayData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayDataActionPerformed(evt);
            }
        });

        jButtonDisplayList.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonDisplayList.setText("Προβολή λίστας γευμάτων ανά κατηγορία γεύματος");
        jButtonDisplayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayListActionPerformed(evt);
            }
        });

        jButtonDisplayStats.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonDisplayStats.setText("Προβολή στατιστικών δεδομένων γευμάτων / Eκτύπωση σε αρχείο pdf");
        jButtonDisplayStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayStatsActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonExit.setText("Έξοδος");
        jButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDisplayList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDisplayData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDisplayStats, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanelTitleLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonDisplayData, jButtonDisplayList, jButtonDisplayStats, jButtonExit});

        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addComponent(jButtonDisplayData, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDisplayList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDisplayStats, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(filler6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTitleLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonDisplayData, jButtonDisplayList, jButtonDisplayStats, jButtonExit});

        jMenuSystem.setText("Meals");

        jMenuItemR2.setText("Προβολή δεδομένων γευμάτων");
        jMenuItemR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemR2ActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemR2);

        jMenuItemR3.setText("Προβολή γευμάτων ανά κατηγορία");
        jMenuItemR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemR3ActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemR3);

        jMenuItemR4.setText("Προβολή στατιστικών / Eκτύπωση αρχείου PDF");
        jMenuItemR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemR4ActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemR4);
        jMenuSystem.add(jSeparator1);

        jMenuItemCredits.setText("Συντελεστές");
        jMenuItemCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreditsActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemCredits);
        jMenuSystem.add(jSeparator);

        jMenuItemExit.setText("'Εξοδος");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemExit);

        jMenuBar.add(jMenuSystem);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int option = JOptionPane.showConfirmDialog(MainFrame_Home.this,
                "Σίγουρα θέλετε να κλείσετε την εφαρμογή;",
                "Επιβεβαίωση",
                JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);}
    }//GEN-LAST:event_formWindowClosing

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        int option = JOptionPane.showConfirmDialog(MainFrame_Home.this,
                "Σίγουρα θέλετε να κλείσετε την εφαρμογή;",
                "Επιβεβαίωση",
                JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);}
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        int option = JOptionPane.showConfirmDialog(MainFrame_Home.this,
                "Σίγουρα θέλετε να κλείσετε την εφαρμογή;",
                "Επιβεβαίωση",
                JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);}
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreditsActionPerformed
        // Display credits
        JOptionPane.showMessageDialog(this,
                    "ΑΝΑΛΥΣΗ - ΣΧΕΔΙΑΣΗ - ΥΛΟΠΟΙΗΣΗ \n"
                            +"\n"
                            +"\tScrum Team 6 \n"
                            +"\n"
                            +"      ΜΕΡΤΖΑΝΗΣ ΣΤΥΛΙΑΝΟΣ.std150490       (Scrum Master)\n"
                            +"      ΛΑΜΠΑΚΗΣ ΗΛΙΑΣ.std068796                  (Developer)\n"
                            +"      ΠΟΛΥΧΡΟΝΙΔΗΣ ΓΙΩΡΓΟΣ.std016027      (Developer)"
                            +"\n",
                "Συντελεστές", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemCreditsActionPerformed

    private void jButtonDisplayDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayDataActionPerformed
        this.setVisible(false);
        R2Frame r2 = new R2Frame();
        r2.setVisible(true);
    }//GEN-LAST:event_jButtonDisplayDataActionPerformed

    private void jButtonDisplayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayListActionPerformed
        this.setVisible(false);
        R3Frame r3 = new R3Frame();
        r3.setVisible(true);
    }//GEN-LAST:event_jButtonDisplayListActionPerformed

    private void jButtonDisplayStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayStatsActionPerformed
        this.setVisible(false);
        R4Frame r4 = new R4Frame();
        r4.setVisible(true);
    }//GEN-LAST:event_jButtonDisplayStatsActionPerformed

    private void jMenuItemR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemR2ActionPerformed
        this.setVisible(false);
        R2Frame r2 = new R2Frame();
        r2.setVisible(true);
    }//GEN-LAST:event_jMenuItemR2ActionPerformed

    private void jMenuItemR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemR3ActionPerformed
        this.setVisible(false);
        R3Frame r3 = new R3Frame();
        r3.setVisible(true);
    }//GEN-LAST:event_jMenuItemR3ActionPerformed

    private void jMenuItemR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemR4ActionPerformed
        this.setVisible(false);
        R4Frame r4 = new R4Frame();
        r4.setVisible(true);
    }//GEN-LAST:event_jMenuItemR4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Set the LookAndFeel enviroment
        FlatDarculaLaf.setup();
        UIManager.put( "Button.arc", 888 );
        UIManager.put( "Component.arc", 888 );
        UIManager.put( "TextComponent.arc", 888 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jButtonDisplayData;
    private javax.swing.JButton jButtonDisplayList;
    private javax.swing.JButton jButtonDisplayStats;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemCredits;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemR2;
    private javax.swing.JMenuItem jMenuItemR3;
    private javax.swing.JMenuItem jMenuItemR4;
    private javax.swing.JMenu jMenuSystem;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPopupMenu.Separator jSeparator;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
