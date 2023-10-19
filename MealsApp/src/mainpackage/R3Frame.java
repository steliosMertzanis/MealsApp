/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainpackage;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class R3Frame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public R3Frame() {
        initComponents();
        
        // try-catch block 
        try {
            
            // δημιουργούμε URL για κλήση του MealDB API
            // για αναζήτηση των κατηγοριών των γευμάτων 
            String urlToCall = "https://www.themealdb.com/api/json/v1/1/categories.php";

            // Δημιουργούμε ένα αντικείμενο (instance) της κλάσης OkHttpClient
            // που θα χρησιμοποιήσουμε για την υποβολή αιτημάτων HTTP
            OkHttpClient oc = new OkHttpClient();

            // Δημιουργούμε ένα νέο αίτημα HTTP χρησιμοποιώντας τη διεύθυνση URL
            // που δημιουργήσαμε παραπάνω 
            // και την εκχωρούμε σε μια μεταβλητή που ονομάζουμε "request"
            Request request = new Request.Builder().url(urlToCall).build();

            // Ξεκινάμε νέο try-catch block 
            // και δημιουργούμε ένα νέο αντικείμενο απόκρισης HTTP που ονομάζουμε "response"
            // ο χρήστης στέλνει το αίτημα HTTP και περιμένει απάντηση
            try (okhttp3.Response response = oc.newCall(request).execute()) {
                
                // Ελέγχουμε εάν η απάντηση είναι επιτυχής 
                // και εάν η απόκριση έχει "σώμα"
                if (response.isSuccessful() && response.body() != null) {

                    //Καταχωρούμε σε ένα String το αποτέλεσμα
                    // Ανακτούμε το σώμα της απόκρισης  
                    // και το εκχωρoούμε στην μεταβλητή (String) που ονομάζουμε "responseString"
                    String responseString = response.body().string();
                    
                    // Δημιουργούμε ένα νέο αντικείμενο Gson
                    // Διαμόρφωση PrettyPrinting() κατά τη μετατροπή του JSON σε συμβολοσειρά
                    GsonBuilder builder = new GsonBuilder();
                    builder.setPrettyPrinting();
                    Gson gson = builder.create();

                    // Μετατρέπουμε το String απόκρισης σε JsonObject 
                    // και το εκχωρούμε σε μια μεταβλητή που ονομάζουμε "jsnOb" 
                    JsonObject jsnOb = gson.fromJson(responseString, JsonObject.class);
                    // Εκτύπωση στην κονσόλα για τυχόν εντοπισμό σφαλμάτων
                    // System.out.println(jsnOb);

                    // Δημιουργούμε έναν πίνακα JSON από το JsonObject 
                    // και τον εκχωρούμε σε μια μεταβλητή που ονομάζουμε "categoriesArray"
                    JsonArray categoriesArray = jsnOb.get("categories").getAsJsonArray();
                    // Εκτύπωση στην κονσόλα για τυχόν εντοπισμό σφαλμάτων
                    // System.out.println(categoriesArray);

                    //Δημιουργούμε ένα νέο νέο DefaultComboBoxModel
                    // που θα παρέχει τα δεδομένα στο jComboBox
                    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();

                    // Διαπερνούμε κάθε στοιχείο του πίνακα "categoriesArray"
                    // ανακτούμε το όνομα κάθε κατηγορίας 
                    // και το προσθέτουμε στο "cbModel"
                    // Ετοιμάζουμε τα δεδομένα που θα εμφανιστούν στο jComboBox
                    for (JsonElement jsonElement : categoriesArray) {
                        JsonObject j = jsonElement.getAsJsonObject();
                        String category = j.get("strCategory").getAsString();
                        // Εκτύπωση στην κονσόλα για τυχόν εντοπισμό σφαλμάτων
                        // System.out.println(name);
                        cbModel.addElement(category);
                    }
                    // Εκχωρούμε το "cbModel" στο jComboBox
                    // το οποίο εμφανίζει τα ονόματα των γευμάτων στον χρήστη
                    jComboBox.setModel(cbModel);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "An error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                        "An error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
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
        jLabelCategory = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jButtonDisplay = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 12), new java.awt.Dimension(0, 12), new java.awt.Dimension(32767, 12));
        jLabelCategory1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuSystem = new javax.swing.JMenu();
        jSeparator = new javax.swing.JPopupMenu.Separator();
        jMenuItemR2 = new javax.swing.JMenuItem();
        jMenuItemR4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemHome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iMeals ™ 2023");
        setBounds(new java.awt.Rectangle(140, 140, 800, 600));
        setLocation(new java.awt.Point(140, 140));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("mainframe"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "   Προβολή λίστας γευμάτων ανά κατηγορία γεύματος  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabelCategory.setText("Κατηγορία γεύματος :");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category" }));

        jButtonDisplay.setText("Εμφάνιση");
        jButtonDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayActionPerformed(evt);
            }
        });

        jLabelCategory1.setText("Διαθέσιμα γεύματα :");

        jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Meals" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList);

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCategory1)
                            .addGroup(jPanelTitleLayout.createSequentialGroup()
                                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                                        .addComponent(jLabelCategory)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 289, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDisplay))
                .addGap(18, 18, 18)
                .addComponent(jLabelCategory1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuSystem.setText("Meals");
        jMenuSystem.add(jSeparator);

        jMenuItemR2.setText("Προβολή δεδομένων γευμάτων");
        jMenuItemR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemR2ActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemR2);

        jMenuItemR4.setText("Προβολή στατιστικών / Eκτύπωση αρχείου PDF");
        jMenuItemR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemR4ActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemR4);
        jMenuSystem.add(jSeparator1);

        jMenuItemHome.setText("Αρχική οθόνη");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenuSystem.add(jMenuItemHome);

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
        dispose();
        MainFrame_Home r1 = new MainFrame_Home();
        r1.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed
        dispose();
        MainFrame_Home r1 = new MainFrame_Home();
        r1.setVisible(true);
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jButtonDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayActionPerformed
        // try-catch block 
        try {
            // ανακτούμε το κείμενο από το jTextFieldMeal
            // και το αποθηκεύουμε σε μια μεταβλητή String που ονοματίζουμε "meal"
            String category = jComboBox.getSelectedItem().toString();
            
            // δημιουργούμε URL για κλήση του MealDB API
            // για αναζήτηση της κατηγορίας γευμάτων με το όνομα που καθορίζεται στη μεταβλητή "category"
            String urlToCall = "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + category;

            // Δημιουργούμε ένα αντικείμενο (instance) της κλάσης OkHttpClient
            // που θα χρησιμοποιήσουμε για την υποβολή αιτημάτων HTTP
            OkHttpClient oc = new OkHttpClient();

            // Δημιουργούμε ένα νέο αίτημα HTTP χρησιμοποιώντας τη διεύθυνση URL
            // που δημιουργήσαμε παραπάνω 
            // και την εκχωρούμε σε μια μεταβλητή που ονομάζουμε "request"
            Request request = new Request.Builder().url(urlToCall).build();

            // Ξεκινάμε νέο try-catch block 
            // και δημιουργούμε ένα νέο αντικείμενο απόκρισης HTTP που ονομάζουμε "response"
            // ο χρήστης στέλνει το αίτημα HTTP και περιμένει απάντηση
            try (okhttp3.Response response = oc.newCall(request).execute()) {
                
                // Ελέγχουμε εάν η απάντηση είναι επιτυχής 
                // και εάν η απόκριση έχει "σώμα"
                if (response.isSuccessful() && response.body() != null) {

                    //Καταχωρούμε σε ένα String το αποτέλεσμα
                    // Ανακτούμε το σώμα της απόκρισης  
                    // και το εκχωρoούμε στην μεταβλητή (String) που ονομάζουμε "responseString"
                    String responseString = response.body().string();
                    
                    // Δημιουργούμε ένα νέο αντικείμενο Gson
                    // Διαμόρφωση PrettyPrinting() κατά τη μετατροπή του JSON σε συμβολοσειρά
                    GsonBuilder builder = new GsonBuilder();
                    builder.setPrettyPrinting();
                    Gson gson = builder.create();

                    // Μετατρέπουμε το String απόκρισης σε JsonObject 
                    // και το εκχωρούμε σε μια μεταβλητή που ονομάζουμε "jsnOb" 
                    JsonObject jsnOb = gson.fromJson(responseString, JsonObject.class);
                    // Εκτύπωση στην κονσόλα για τυχόν εντοπισμό σφαλμάτων
                    // System.out.println(jsnOb);

                    // Δημιουργούμε έναν πίνακα JSON από το JsonObject 
                    // και τον εκχωρούμε σε μια μεταβλητή που ονομάζουμε "mealsArray"
                    JsonArray mealsArray = jsnOb.get("meals").getAsJsonArray();
                    // Εκτύπωση στην κονσόλα για τυχόν εντοπισμό σφαλμάτων
                    // System.out.println(mealsArray);

                    //Δημιουργούμε ένα νέο νέο DefaultListModel
                    // που θα παρέχει τα δεδομένα στο jList
                    DefaultListModel lModel = new DefaultListModel();

                    // Διαπερνούμε κάθε στοιχείο του πίνακα "mealsArray"
                    // ανακτούμε το όνομα κάθε γεύματος 
                    // και το προσθέτουμε στο "lModel"
                    // Ετοιμάζουμε τα δεδομένα που θα εμφανιστούν στο jList
                    for (JsonElement jsonElement : mealsArray) {
                        JsonObject j = jsonElement.getAsJsonObject();
                        String mealCategory = j.get("strMeal").getAsString();
                        // Εκτύπωση στην κονσόλα για τυχόν εντοπισμό σφαλμάτων
                        // System.out.println(mealCategory);
                        lModel.addElement(mealCategory);
                    }
                    // Εκχωρούμε το "lModel" στο jlist
                    // το οποίο εμφανίζει τα ονόματα των γευμάτων στον χρήστη
                    jList.setModel(lModel);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "An error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                        "An error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDisplayActionPerformed

    private void jMenuItemR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemR2ActionPerformed
        this.dispose();
        R2Frame r2 = new R2Frame();
        r2.setVisible(true);
    }//GEN-LAST:event_jMenuItemR2ActionPerformed

    private void jMenuItemR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemR4ActionPerformed
        this.dispose();
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
                new R3Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JButton jButtonDisplay;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCategory1;
    private javax.swing.JList<String> jList;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenuItem jMenuItemR2;
    private javax.swing.JMenuItem jMenuItemR4;
    private javax.swing.JMenu jMenuSystem;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
