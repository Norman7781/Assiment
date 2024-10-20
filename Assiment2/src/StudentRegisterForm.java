
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegisterForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField, phoneField;
    private JLabel nameLabel, emailLabel, phoneLabel, genderLabel, courseLabel;
    private JRadioButton maleRadio, femaleRadio;
    private JCheckBox termsCheckBox;
    private JComboBox<String> courseBox;
    private JButton submitButton;
    private  ButtonGroup genderGroup;
    private JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

    public StudentRegisterForm(){
        this.initializeUIComponent();
        this.addUIComponent();
        this.setVisible(true);
    }

    private void addUIComponent() {
        this.add(nameLabel);
        this.add(nameField);

        this.add(emailLabel);
        this.add(emailField);

        this.add(phoneLabel);
        this.add(phoneField);

        this.add(genderLabel);
        this.genderPanel.add(this.maleRadio);
        this.genderPanel.add(this.femaleRadio);
        this.add(this.genderPanel);

        this.add(courseLabel);
        this.add(courseBox);

        this.add(termsCheckBox);
        this.add(new JLabel());

        this.add(submitButton);


    }

    private void initializeUIComponent() {

        this.setTitle("Student Registration Form");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(7,2, 5, 5));

        this.nameLabel = new JLabel("Name:");
        this.nameField = new JTextField();

        this.emailLabel = new JLabel("email:");
        this.emailField = new JTextField();

        this.phoneLabel = new JLabel("phone:");
        this.phoneField = new JTextField();


        this.genderLabel = new JLabel("Gender:");
        this.maleRadio = new JRadioButton("Male");
        this.femaleRadio = new JRadioButton("Female");

        this.genderGroup = new ButtonGroup();
        this.genderGroup.add(this.maleRadio);
        this.genderGroup.add(this.femaleRadio);

        this.courseLabel = new JLabel("Course:");
        String[] course = {"java", "python", "C++"};
        this.courseBox = new JComboBox<>(course);

        termsCheckBox = new JCheckBox("Accept Termas and Conditions");

        this.submitButton = new JButton("Submit");
        this.submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.submitButton){
            System.out.println("Clicked Submit Btn!!!!");
        }
    }
}