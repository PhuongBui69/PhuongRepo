/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author HP
 */
public class ThemTaiLieuFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThemTaiLieuFrame
     */
    public ThemTaiLieuFrame() {
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

        jpnViewThemTaiLieu = new javax.swing.JPanel();
        jpnThemTaiLieu = new javax.swing.JPanel();
        jlbBookID = new javax.swing.JLabel();
        jlbBookTitle = new javax.swing.JLabel();
        jlbBookAuthor = new javax.swing.JLabel();
        jlbCopiesAvailable = new javax.swing.JLabel();
        jlbBookCategory = new javax.swing.JLabel();
        jlbBookReleaseYear = new javax.swing.JLabel();
        ButtonReset = new javax.swing.JButton();
        jTextFieldBookTitle = new javax.swing.JTextField();
        jTextFieldBookID = new javax.swing.JTextField();
        jTextFieldBookAuthor = new javax.swing.JTextField();
        jTextFieldReleaseYear = new javax.swing.JTextField();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldCopiesAvailable = new javax.swing.JTextField();
        ButtonSaveBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnViewThemTaiLieu.setBackground(new java.awt.Color(214, 239, 216));

        jpnThemTaiLieu.setBackground(new java.awt.Color(128, 175, 129));
        jpnThemTaiLieu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tài liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnThemTaiLieu.setForeground(new java.awt.Color(255, 255, 255));
        jpnThemTaiLieu.setName(""); // NOI18N

        jlbBookID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbBookID.setForeground(new java.awt.Color(255, 255, 255));
        jlbBookID.setText("ID         ");

        jlbBookTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbBookTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbBookTitle.setText("Tiêu đề");

        jlbBookAuthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbBookAuthor.setForeground(new java.awt.Color(255, 255, 255));
        jlbBookAuthor.setText("Tác giả");

        jlbCopiesAvailable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbCopiesAvailable.setForeground(new java.awt.Color(255, 255, 255));
        jlbCopiesAvailable.setText("Số lượng");

        jlbBookCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbBookCategory.setForeground(new java.awt.Color(255, 255, 255));
        jlbBookCategory.setText("Thể loại");

        jlbBookReleaseYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbBookReleaseYear.setForeground(new java.awt.Color(255, 255, 255));
        jlbBookReleaseYear.setText("Năm xuất bản");

        ButtonReset.setBackground(new java.awt.Color(80, 141, 78));
        ButtonReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        jTextFieldReleaseYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReleaseYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThemTaiLieuLayout = new javax.swing.GroupLayout(jpnThemTaiLieu);
        jpnThemTaiLieu.setLayout(jpnThemTaiLieuLayout);
        jpnThemTaiLieuLayout.setHorizontalGroup(
            jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThemTaiLieuLayout.createSequentialGroup()
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnThemTaiLieuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbBookID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbBookAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbBookReleaseYear, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jlbBookCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbCopiesAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBookTitle)
                            .addComponent(jTextFieldBookID)
                            .addComponent(jTextFieldBookAuthor)
                            .addComponent(jTextFieldReleaseYear)
                            .addComponent(jTextFieldCategory)
                            .addComponent(jTextFieldCopiesAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                    .addGroup(jpnThemTaiLieuLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(ButtonReset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThemTaiLieuLayout.setVerticalGroup(
            jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThemTaiLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBookReleaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReleaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCopiesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCopiesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(ButtonReset)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        ButtonSaveBook.setBackground(new java.awt.Color(80, 141, 78));
        ButtonSaveBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSaveBook.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSaveBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logoSaveAS.png"))); // NOI18N
        ButtonSaveBook.setText("Lưu dữ liệu");

        javax.swing.GroupLayout jpnViewThemTaiLieuLayout = new javax.swing.GroupLayout(jpnViewThemTaiLieu);
        jpnViewThemTaiLieu.setLayout(jpnViewThemTaiLieuLayout);
        jpnViewThemTaiLieuLayout.setHorizontalGroup(
            jpnViewThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThemTaiLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnViewThemTaiLieuLayout.createSequentialGroup()
                .addContainerGap(512, Short.MAX_VALUE)
                .addComponent(ButtonSaveBook)
                .addContainerGap())
        );
        jpnViewThemTaiLieuLayout.setVerticalGroup(
            jpnViewThemTaiLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnViewThemTaiLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonSaveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnThemTaiLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnThemTaiLieu.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnViewThemTaiLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnViewThemTaiLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void jTextFieldReleaseYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReleaseYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReleaseYearActionPerformed

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
            java.util.logging.Logger.getLogger(ThemTaiLieuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTaiLieuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTaiLieuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTaiLieuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemTaiLieuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonSaveBook;
    private javax.swing.JTextField jTextFieldBookAuthor;
    private javax.swing.JTextField jTextFieldBookID;
    private javax.swing.JTextField jTextFieldBookTitle;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldCopiesAvailable;
    private javax.swing.JTextField jTextFieldReleaseYear;
    private javax.swing.JLabel jlbBookAuthor;
    private javax.swing.JLabel jlbBookCategory;
    private javax.swing.JLabel jlbBookID;
    private javax.swing.JLabel jlbBookReleaseYear;
    private javax.swing.JLabel jlbBookTitle;
    private javax.swing.JLabel jlbCopiesAvailable;
    private javax.swing.JPanel jpnThemTaiLieu;
    private javax.swing.JPanel jpnViewThemTaiLieu;
    // End of variables declaration//GEN-END:variables
}
