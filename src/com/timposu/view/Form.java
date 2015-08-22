/*
* dibuat oleh Ucup Timposu
* Blog: www.timposu.com
* Email : ucup.timposu@gmail.com
* Silahkan kode ini dipelajari dan dikembangkan..
*
**/
package com.timposu.view;

/**
 *
 * @author ucup
 */
public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelForm1 = new com.timposu.view.PanelForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(panelForm1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.timposu.view.PanelForm panelForm1;
    // End of variables declaration//GEN-END:variables

}
