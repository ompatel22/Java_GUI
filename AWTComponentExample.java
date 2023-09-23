import java.awt.*;
import java.awt.event.*;

public class AWTComponentExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Registration Form");

        // Components for Registration Form
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField(20);

        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField(20);

        Label genderLabel = new Label("Gender:");
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, true);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);

        Label addressLabel = new Label("Address:");
        TextArea addressTextArea = new TextArea(5, 20);

        Label hobbiesLabel = new Label("Hobbies:");
        Checkbox cricketCheckbox = new Checkbox("Cricket");
        Checkbox badmintonCheckbox = new Checkbox("Badminton");
        Checkbox readingCheckbox = new Checkbox("Reading");
        Checkbox singingCheckbox = new Checkbox("Singing");

        Label educationLabel = new Label("Education:");
        List educationList = new List();
        educationList.add("Engineering");
        educationList.add("Medical");
        educationList.add("Artist");

        Label benefitsLabel = new Label("Benefits of Education:");
       // Scrollbar benefitsScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
		Scrollbar benefitsScrollbar = new Scrollbar();

        Label countryLabel = new Label("Country:");
        Choice countryChoice = new Choice();
        countryChoice.add("Select");
        countryChoice.add("USA");
        countryChoice.add("Canada");
        countryChoice.add("UK");

        Button submitButton = new Button("Submit");

        // Using GridLayout for the registration form layout
        frame.setLayout(new GridLayout(11, 2, 10, 10)); // Rows, Columns, Horizontal Gap, Vertical Gap

        frame.add(nameLabel);
        frame.add(nameTextField);

        frame.add(emailLabel);
        frame.add(emailTextField);

        frame.add(genderLabel);
        Panel genderPanel = new Panel(); // Panel to hold checkboxes
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);
        frame.add(genderPanel);

        frame.add(addressLabel);
        frame.add(addressTextArea);

        frame.add(hobbiesLabel);
        Panel hobbiesPanel = new Panel(); // Panel to hold hobby checkboxes
        hobbiesPanel.add(cricketCheckbox);
        hobbiesPanel.add(badmintonCheckbox);
        frame.add(hobbiesPanel);

        frame.add(educationLabel);
        frame.add(educationList);

        frame.add(benefitsLabel);
        frame.add(benefitsScrollbar);

        frame.add(countryLabel);
        frame.add(countryChoice);

        // Adding CanvasDemo with blue background
        Label canvas1 = new Label("Canvas Demo");
		frame.add(canvas1);
		Canvas canvasDemo = new Canvas();
		canvasDemo.setBackground(Color.BLUE);
        frame.add(canvasDemo);

        frame.add(new Label("")); // Empty cell for spacing
        Panel buttonPanel = new Panel(); // Panel to hold submit button
        buttonPanel.add(submitButton);
        frame.add(buttonPanel);

        frame.setSize(400, 600);
        frame.setVisible(true);

        ///MOSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Adding a WindowListener to handle frame closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}