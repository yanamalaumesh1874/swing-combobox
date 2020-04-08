import javax.swing.*;    
public class combbx {    
JFrame f;    
combbx()
{    
    f=new JFrame("COMBO BOX");    
    String courses[]={"JAVA","PYTHON","C LANG","C++","HTML"};        
    JComboBox cb=new JComboBox(courses);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);         
}    
public static void main(String[] args) {    
    new combbx();         
}    
}   
