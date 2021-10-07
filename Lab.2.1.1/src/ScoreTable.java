import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class ScoreTable extends JFrame {
    private int Milan;
    private int Madrid;

    private JButton firstTeam = new JButton("AC Milan");
    private JButton secondTeam = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + Milan + " X " + Madrid);
    private JLabel lastGoal = new JLabel("Last Scorer: NaN");
    private JPanel labels = new JPanel(new GridLayout(1,2));
    private JPanel button = new JPanel(new GridLayout(1,3));

    public ScoreTable() {
        super("Score table");
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Добавляем метки в панель меток
        labels.add(result);
        labels.add(lastGoal);

        //Добаляем кнопки в панель кнопок
        button. add(firstTeam);
        button.add(secondTeam);

        //Помещаем в контейнер и компоновка
        Container container = getContentPane();
        container.add(labels, BorderLayout.SOUTH);
        container.add(button, BorderLayout.CENTER);

        //Создание обработчиков события с присваиванием к элементам
        ActionListener   actionListenerFir = new GoalFromMilan();
        ActionListener actionListenerSec = new GoalFromMadrid();
        firstTeam.addActionListener(actionListenerFir);
        secondTeam.addActionListener(actionListenerSec);
    }
    //Обработка гола
    public void Winner() {
        if (Milan - Madrid == 5) {
            JOptionPane.showMessageDialog(this, "Milan AC won!", "Game over", JOptionPane.DEFAULT_OPTION);
            firstTeam .setEnabled(false);
            secondTeam.setEnabled(false);
        }
        else if (Madrid - Milan == 2) {
            JOptionPane.showMessageDialog(this, "Real Madrid won!", "Game over", JOptionPane.DEFAULT_OPTION);
            firstTeam .setEnabled(false);
            secondTeam.setEnabled(false);
        }
    }

    public class GoalFromMilan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Milan++;
            result.setText("Result: " + Milan + " X " + Madrid);
            lastGoal.setText("Last Scorer: AC Milan");
            Winner();
        }
    }

    public class GoalFromMadrid implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Madrid++;
            result.setText("Result: " + Milan + " X " + Madrid);
            lastGoal.setText("Last Scorer: Real Madrid");
            Winner();
        }
    }
}
