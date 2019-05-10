package Screens;

import Access.LogUser;
import Interfaces.Screen;
import Screens.Frames.ConnectionFrame;
import java.awt.EventQueue;

public class ConnectionScreen implements Screen {
    
    LogUser session;
    
    public ConnectionScreen(LogUser session) {
        this.session=session;
        loadScreen();
    }

    @Override
    public void loadScreen() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                new ConnectionFrame(session);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }  
        });
    }
}
