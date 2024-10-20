package TodoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ToDoListManger extends JFrame implements ActionListener {
    private JTextField taskField;
    private JList<String> taskList;
    private JButton addTaskButton, removeTaskButton, clearAllButton;
    private ArrayList<String> tasks;

    public ToDoListManger() {
        this.tasks = new ArrayList<>();
        this.initializeComponents();
        this.addComponents();
        this.setVisible(true);
    }

    private void initializeComponents() {
        this.setTitle("To-Do List Manager");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        taskField = new JTextField(25);
        taskList = new JList<>();
        addTaskButton = new JButton("Add Task");
        removeTaskButton = new JButton("Remove Task");
        clearAllButton = new JButton("Clear All");

        addTaskButton.addActionListener(this);
        removeTaskButton.addActionListener(this);
        clearAllButton.addActionListener(this);
    }

    private void addComponents() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(new JLabel("Task:"));
        topPanel.add(taskField);
        topPanel.add(addTaskButton);

        this.add(topPanel, BorderLayout.NORTH);
        this.add(new JScrollPane(taskList), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(removeTaskButton);
        bottomPanel.add(clearAllButton);

        this.add(bottomPanel, BorderLayout.SOUTH);
    }

    private void updateTaskList() {
        String[] taskArray = tasks.toArray(new String[0]);
        taskList.setListData(taskArray);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addTaskButton) {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                tasks.add(task);
                updateTaskList();
                taskField.setText("");
            }
        } else if (e.getSource() == removeTaskButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                tasks.remove(selectedIndex);
                updateTaskList();
            }
        } else if (e.getSource() == clearAllButton) {
            tasks.clear();
            updateTaskList();
        }
    }
}
