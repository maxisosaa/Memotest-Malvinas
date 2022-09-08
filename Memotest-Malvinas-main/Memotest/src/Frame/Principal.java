package Frame;

import Methods.Match;
import Methods.Utilities;
import java.util.List;

public class Principal extends javax.swing.JFrame {

  
    int clic =0;
    
    Utilities u = new Utilities();
    
    List<Integer> next = u.rowsTableAll();
    
    public Principal() {
        initComponents();
        this.setTitle("Memotest Malvinas");
        this.setLocationRelativeTo(this);
        u.imgStart();
    }

   
    @SuppressWarnings("unchecked")
    

    private void btn01MouseClicked(java.awt.event.MouseEvent evt) {
        //u.evtBtn(btn01,evt,next.get(0));
        Match m = new Match();
        m.setBtn(btn01);
        m.setNumberBtn(1);
        m.setValueMatch(next.get(0));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn02MouseClicked(java.awt.event.MouseEvent evt) {
       
        Match m = new Match();
        m.setBtn(btn02);
        m.setNumberBtn(2);
        m.setValueMatch(next.get(1));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn03MouseClicked(java.awt.event.MouseEvent evt) {
        
        Match m = new Match();
        m.setBtn(btn03);
        m.setNumberBtn(3);
        m.setValueMatch(next.get(2));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn04MouseClicked(java.awt.event.MouseEvent evt) {
       Match m = new Match();
        m.setBtn(btn04);
        m.setNumberBtn(4);
        m.setValueMatch(next.get(3));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn05MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn05);
        m.setNumberBtn(5);
        m.setValueMatch(next.get(4));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn06MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn06);
        m.setNumberBtn(6);
        m.setValueMatch(next.get(5));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn07MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn07);
        m.setNumberBtn(7);
        m.setValueMatch(next.get(6));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }

    private void btn08MouseClicked(java.awt.event.MouseEvent evt) {
        Match m = new Match();
        m.setBtn(btn08);
        m.setNumberBtn(8);
        m.setValueMatch(next.get(7));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }
    
    public static void main(String args[]) {
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

     //variable imagenes
    public static javax.swing.JButton btn01;
    public static javax.swing.JButton btn02;
    public static javax.swing.JButton btn03;
    public static javax.swing.JButton btn04;
    public static javax.swing.JButton btn05;
    public static javax.swing.JButton btn06;
    public static javax.swing.JButton btn07;
    public static javax.swing.JButton btn08;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;

    private void initComponents() {
        throw new UnsupportedOperationException("Aún no es compatible"); 
    }
    
}


