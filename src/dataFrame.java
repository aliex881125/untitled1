import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dataFrame extends JFrame {
    private Container cp;

    //上方按鈕放置
    private JPanel jpnN = new JPanel(new GridLayout(1,6,2,2));
    private JButton all = new JButton("All");
    private JButton add = new JButton("Add");
    private JButton del = new JButton("Del");
    private JButton search = new JButton("Search");


    //中間Area放置
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane();


    //下放按鈕放置
    private  JPanel jpnS = new JPanel(new GridLayout(1,8,2,2));
    private JLabel light = new JLabel();
    private JButton connect = new JButton("Connect");
    private JLabel space = new JLabel();
    private JLabel space1 = new JLabel();
    private JButton exit = new JButton("Exit");

    private int n =0;




    public dataFrame(){
        init();
    }
    public void init(){
        cp=this.getContentPane();
        this.setLayout(new BorderLayout(3,3));
        this.setBounds(50,50,800,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //按鈕放置
        cp.add(jpnN,BorderLayout.NORTH);
        jpnN.add(all);
        jpnN.add(add);
        jpnN.add(del);
        jpnN.add(search);

        cp.add(jsp,BorderLayout.CENTER);
        jta.add(jsp);
        jta.setBackground(new Color(23,255,200));
        jta.setOpaque(true);

        cp.add(jpnS,BorderLayout.SOUTH);
        jpnS.add(light);
        light.setBackground(new Color(255,0,0));
        light.setOpaque(true);
        jpnS.add(connect);
        jpnS.add(space);
        jpnS.add(space1);
        jpnS.add(exit);

        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n==0) {
                    connect.setText("disconnect");
                    light.setBackground(new Color(255,0,0));
                    n+=1;
                }else if(n==1){
                    connect.setText("connect");
                    light.setBackground(new Color(0,0,255));
                    n-=1;
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
