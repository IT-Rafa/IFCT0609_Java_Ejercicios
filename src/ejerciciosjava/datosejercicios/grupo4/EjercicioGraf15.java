/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo4;
import ejerciciosjava.datosejercicios.Ejercicio;

import java.awt.Color;
import java.text.DecimalFormat;
import itrafa.utils.CheckString;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class EjercicioGraf15 extends javax.swing.JFrame {

    /**
     * Creates new form EjercicioGraf12
     */
    public EjercicioGraf15() {
        int input = 0;

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

        inputTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sumaJButton = new javax.swing.JButton();
        serieJButton = new javax.swing.JButton();
        fiboJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));

        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar un número entero: ");
        jLabel1.setAlignmentY(0.0F);

        sumaJButton.setText("Suma Pares");
        sumaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaJButtonActionPerformed(evt);
            }
        });

        serieJButton.setText("Serie");
        serieJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieJButtonActionPerformed(evt);
            }
        });

        fiboJButton.setText("Fibonacci");
        fiboJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiboJButtonActionPerformed(evt);
            }
        });

        JTextArea.setColumns(20);
        JTextArea.setLineWrap(true);
        JTextArea.setRows(5);
        jScrollPane1.setViewportView(JTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(inputTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(87, 87, 87))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(sumaJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serieJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fiboJButton)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumaJButton)
                    .addComponent(serieJButton)
                    .addComponent(fiboJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaJButtonActionPerformed
        String inputSt = this.inputTextField.getText();
        if (CheckString.isPositiveInteger(inputSt)) {
            int input = Integer.parseInt(inputSt);
            if (input == 0) {
                this.JTextArea.setText("0 no válido");
                this.JTextArea.setForeground(Color.red);
            } else {
                this.JTextArea.setForeground(Color.black);
                this.JTextArea.setText(sumaParesHasta(input));
            }

        } else {
            this.JTextArea.setText("Número no válido");
            this.JTextArea.setForeground(Color.red);
        }
    }//GEN-LAST:event_sumaJButtonActionPerformed

    private void serieJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieJButtonActionPerformed
        String inputSt = this.inputTextField.getText();
        if (CheckString.isPositiveInteger(inputSt)) {
            int input = Integer.parseInt(inputSt);
            if (input == 0) {
                this.JTextArea.setText("0 no válido");
                this.JTextArea.setForeground(Color.red);
            } else {
                this.JTextArea.setForeground(Color.black);
                this.JTextArea.setText(serieHasta(input));
            }

        } else {
            this.JTextArea.setText("Número no válido");
            this.JTextArea.setForeground(Color.red);
        }
    }//GEN-LAST:event_serieJButtonActionPerformed

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed

    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void fiboJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiboJButtonActionPerformed
        String inputSt = this.inputTextField.getText();
        if (CheckString.isPositiveInteger(inputSt)) {
            int input = Integer.parseInt(inputSt);
            if (input == 0) {
                this.JTextArea.setText("0 no válido");
                this.JTextArea.setForeground(Color.red);
            } else {
                this.JTextArea.setForeground(Color.black);
                this.JTextArea.setText(sumaFibonaHasta(input));
            }

        } else {
            this.JTextArea.setText("Número no válido");
            this.JTextArea.setForeground(Color.red);
        }
    }//GEN-LAST:event_fiboJButtonActionPerformed

    private String sumaParesHasta(int num) {
        String resultado = "Sumamos pares\ndesde el 1 hasta el " + num + ":\n";
        int total = 0;
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                total += i;
                if (i != num) {
                    resultado += (i + " + ");

                } else {
                    resultado += (i);

                }
            }
        }
        return resultado += ("\nLa suma es " + total);
    }

    private String serieHasta(int num) {
        DecimalFormat formateador = new DecimalFormat("#.##");
        String resultado = "Sumamos 1/x siendo x los pares\ndesde el 1 hasta el " + num + ":\n";
        double total = 0;
        for (int i = 2; i <= num; i++) {
            ///(1/2)+(1/4)+(1/6)+(1/8)+(1/10)
            if (i % 2 == 0) {
                total += (double) 1 / i;
                if (i != num) {
                    resultado += ("1/" + i + " + ");

                } else {
                    resultado += ("1/" + i);

                }
            }
        }
        return resultado += ("\nLa suma es " + total);
    }

    private String sumaFibonaHasta(int num) {
        DecimalFormat formateador = new DecimalFormat("#.###");
        String resultado = "Sumamos los " + num + " de la progresión Fibonacci:\n";

        int numF = 2;
        int numFant1 = 1;
        int numFant2 = 1;
        int total = 0;

        /* cada término es la suma de los dos anteriores
         * 0º - 0 + (x + x) =0
         * 1º - 1 + ()
         * 2º - 1 +
         * 3º - 2 + 
         * 4º - 3 +
         * 5º - 5 + 
         * 6º - 8 +
         * 7º - 13 +
         * 8º - 21 +
         * 9º - 34 +
         *10º - 55
         
         */
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                numFant1 = 0;
                numFant2 = 0;

            } else if (i == 1) {
                numFant1 = 0;
                numFant2 = 1;

            } else if (i == 2) {
                numFant1 = 0;
                numFant2 = 1;
                numF = 1;
            } else if (i == 3) {
                numFant1 = 1;
                numFant2 = 1;
                numF = 2;
            } else {;}
            numF = numFant1 + numFant2;
            total += numF;
            if (i == num - 1) {
                numF = numFant1 + numFant2;
                total += numF;
                resultado += (numF);
            } else {
                resultado += (numF + " + ");
            }
            numFant2= numF;
            numFant1= numF;
            

        }
        return resultado += ("\nLa suma de la serie Fibonacci es " + total);
    }

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
            java.util.logging.Logger.getLogger(EjercicioGraf15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioGraf15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioGraf15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioGraf15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioGraf15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTextArea;
    private javax.swing.JButton fiboJButton;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton serieJButton;
    private javax.swing.JButton sumaJButton;
    // End of variables declaration//GEN-END:variables
}
