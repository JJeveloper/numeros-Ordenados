package main;

import controller.ViewController;
import view.FrmView;

/**
 *
 * @author JJeveloper
 */
public class Index {

    public static void main(String[] args) {

        FrmView view = new FrmView();
        view.setVisible(true);
        view.setResizable(true);
        view.setLocationRelativeTo(null);
        
        ViewController vC = new ViewController(view);
    }

}
