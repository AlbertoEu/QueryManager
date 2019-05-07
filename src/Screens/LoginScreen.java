package Screens;

import Interfaces.Screen;
import Screens.Frames.LoginFrame;
import javax.swing.SwingUtilities;

public class LoginScreen implements Screen {
    
    public LoginScreen() {
        loadScreen();
    }
    
    @Override
    public void loadScreen() {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                new LoginFrame().setVisible(true);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }  
        });
    }
}
