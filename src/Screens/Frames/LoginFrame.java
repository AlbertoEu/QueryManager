package Screens.Frames;

import Access.LogUser;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    
    private LogUser login;                 
    private JButton jButton1;
    private JTextField password;
    private JLabel passwordText;
    private JTextField username;
    private JLabel usernameText;
    
    public LoginFrame() {
        super("Query Manager - Login");
        login = new LogUser();
        initComponents();
    }
    
     @SuppressWarnings("unchecked")
    
    private void initComponents() {

        usernameText = new JLabel();
        passwordText = new JLabel();
        username = new JTextField();
        password = new JTextField();
        jButton1 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameText.setText("Username");
        usernameText.setAlignmentY(0.0F);

        passwordText.setText("Password");
        passwordText.setAlignmentY(0.0F);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(password)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(login.login(username.getText(), password.getText())) {
            System.out.println("Bienvenido, " + username.getText());
            //Ir a siguiente pantalla
        }
        else System.out.println("Datos incorrectos, inténtelo de nuevo");
    }   
}
