package chattingapplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ChattingApplicationFrame extends javax.swing.JFrame implements Runnable {

    private String serverIp;
    private int serverPort;

    private Thread t;

    public ChattingApplicationFrame() {
        try {
            initComponents();
           
            InetAddress inet = InetAddress.getLocalHost();
            serverIp = inet.getHostAddress();

            serverPort = 9001;

            yourIPTextField.setText(serverIp);
            yourPortNoTextField.setText(serverPort + "");

            messageTextField.grabFocus();
             t = new Thread(this);

            t.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "ChattingApp", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        YourIPLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yourIPTextField = new javax.swing.JTextField();
        yourPortNoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        clientIPComboBox = new javax.swing.JComboBox<>();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chattingDetailTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        YourIPLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YourIPLabel.setText("Your IP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Your Port No");

        yourIPTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yourIPTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourIPTextFieldActionPerformed(evt);
            }
        });

        yourPortNoTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Chatting Detail");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Type Your Message & Select Your Client IP");

        messageTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        clientIPComboBox.setEditable(true);
        clientIPComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clientIPComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientIPComboBoxActionPerformed(evt);
            }
        });

        sendButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        chattingDetailTextArea.setColumns(20);
        chattingDetailTextArea.setRows(5);
        jScrollPane1.setViewportView(chattingDetailTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(YourIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yourIPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(127, 127, 127)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(yourPortNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(clientIPComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yourPortNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(YourIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yourIPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientIPComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        try {
            String clientIp = clientIPComboBox.getSelectedItem().toString();

            if (!clientIp.isEmpty()) {
                Socket s = new Socket(clientIp, 9001);
                OutputStream out = s.getOutputStream();
                String msg = messageTextField.getText();
                out.write(msg.getBytes());
                out.close();
                s.close();
                chattingDetailTextArea.append("you " + ":" + msg + "\n");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "chatting App", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_sendButtonActionPerformed

    private void clientIPComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientIPComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientIPComboBoxActionPerformed

    private void yourIPTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourIPTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yourIPTextFieldActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChattingApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChattingApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChattingApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChattingApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new ChattingApplicationFrame().setVisible(true);
    }

    @Override
    public void run() {
        try {
            while (true) {
                ServerSocket ss = new ServerSocket(9001);
                System.out.println("Server Waiting...");

                Socket s = ss.accept();
                InputStream in = s.getInputStream();
                byte[] b = new byte[100];
                in.read(b);

                String msg = new String(b);
                chattingDetailTextArea.append(s.getInetAddress().getHostAddress()+":"+msg+"\n");
                s.close();
                ss.close();

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "chatting App", JOptionPane.ERROR_MESSAGE);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel YourIPLabel;
    private javax.swing.JTextArea chattingDetailTextArea;
    private javax.swing.JComboBox<String> clientIPComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField yourIPTextField;
    private javax.swing.JTextField yourPortNoTextField;
    // End of variables declaration//GEN-END:variables
}
