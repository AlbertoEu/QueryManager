package Screens.Frames;

import Access.LogUser;
import Screens.HomeScreen;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    
    private LogUser login;                 
    private JButton loginButton;
    private JButton forgotData;
    private JPasswordField password;
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

        usernameText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        forgotData = new javax.swing.JButton();
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la aplicación?", "Cerrar", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (x==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
                
        usernameText.setText("Username");
        usernameText.setAlignmentY(0.0F);

        passwordText.setText("Password");
        passwordText.setAlignmentY(0.0F);

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        forgotData.setText("No recuerdo mis datos");
        forgotData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotDataActionPerformed(evt);
            }
        });
        
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(loginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(password)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(forgotData)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(forgotData))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }                       
    
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        tryLogin();
    }  
    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tryLogin();
    }  
    
    private void forgotDataActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(this, "Contactar a Jesús Cárdenas para recuperar usuario");
    }                                        
    
    private void tryLogin() {
        if(login.login(username.getText(), password.getText())) {
            dispose();
            HomeScreen homeScreen = new HomeScreen(login);
        }
        else JOptionPane.showMessageDialog(this, "Datos incorrectos, por favor intente de nuevo", "Datos incorrectos", 0);
    }
}
