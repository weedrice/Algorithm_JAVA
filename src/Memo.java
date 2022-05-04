import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Memo extends JFrame implements ActionListener {
    JTextArea ta;
    JMenuBar bar;
    JMenu fileMenu, editMenu, formMenu, viewMenu, helpMenu;
    JMenuItem itemNew, itemOpen, itemSave, itemExit;

    public Memo() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("메모장 - 제목 없음");
        setSize(400, 300);

        bar = new JMenuBar();
        setJMenuBar(bar);
        fileMenu = new JMenu("파일");
        editMenu = new JMenu("편집");
        formMenu = new JMenu("폼");
        viewMenu = new JMenu("보기");
        helpMenu = new JMenu("도움말");
        bar.add(fileMenu);
        bar.add(editMenu);
        bar.add(formMenu);
        bar.add(viewMenu);
        bar.add(helpMenu);

        itemNew = new JMenuItem("새로 만들기");
        itemOpen = new JMenuItem("열기");
        itemSave = new JMenuItem("저장");
        itemExit = new JMenuItem("끝내기");
        fileMenu.add(itemNew);
        fileMenu.add(itemOpen);
        fileMenu.add(itemSave);
        fileMenu.addSeparator();
        fileMenu.add(itemExit);

        itemNew.addActionListener(this);
        itemOpen.addActionListener(this);
        itemSave.addActionListener(this);
        itemExit.addActionListener(this);

        ta = new JTextArea();
        JScrollPane pane = new JScrollPane(ta);
        add(pane);

        setVisible(true);
    }

    public static void main(String[] args) {
        Memo m = new Memo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("e = " + e);
        if(e.getSource() == itemNew) {
            System.out.println("itemNew Clicked");
        } else if(e.getSource() == itemExit) {
            System.out.println("itemExit Clicked");
            dispose();
        } else if(e.getSource() == itemOpen) {
            System.out.println("itemOpen Clicked");
        } else if(e.getSource() == itemSave) {
            System.out.println("itemSave Clicked");
        }
    }
}
