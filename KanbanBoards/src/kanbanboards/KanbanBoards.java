/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kanbanboards;
//Farrell, 2019
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class KanbanBoards {

    public static void main(String[] args) {
        
        //Farrell, 2019
        //Declarations
        String firstName;
        String lastName;
        String username;
        String password;
        String menu;
        String tasks;
        int menuNum;
        int taskNum;
        
        //Farrell, 2019
        //Class object
        Login object = new Login();
        
        //Farrell, 2019
        //Prompts
        firstName = JOptionPane.showInputDialog(null, "Please enter first name: ");
        lastName = JOptionPane.showInputDialog(null, "Please enter last name: ");
        username = JOptionPane.showInputDialog(null, "Please enter your username that meets the following requirements:"
                                                      + "\n-Must contain an underscore"
                                                      + "\n-No longer than 5 characters");
        password = JOptionPane.showInputDialog(null, "Please enter your password that meets the following requirements:"
                                                      + "\n-At least 8 characters long"
                                                      + "\n-Contains a capital letter"
                                                      + "\n-Contains a number"
                                                      + "\n-Contains a special character");
        
        //Farrell, 2019
        //Setters
        object.setFirstName(firstName);
        object.setLastName(lastName);
        object.setUsername(username);
        object.setPassword(password);
        
        //Farrell, 2019
        //Sediela, 2024
        //Method calls
        object.checkUserName();
        object.checkPasswordComplexity();
        JOptionPane.showMessageDialog(null,object.registerUser());
       
        //While loop
        while(object.checkUserName() != true || object.checkPasswordComplexity() != true){
            username = JOptionPane.showInputDialog(null, "Please enter your username that meets the following requirements:"
                                                      + "\n-Must contain an underscore"
                                                      + "\n-No longer than 5 characters");
            password = JOptionPane.showInputDialog(null, "Please enter your password that meets the following requirements:"
                                                      + "\n-At least 8 characters long"
                                                      + "\n-Contains a capital letter"
                                                      + "\n-Contains a number"
                                                      + "\n-Contains a special character");
            //Setters
            object.setUsername(username);
            object.setPassword(password);
            
            //Method calls
            object.checkUserName();
            object.checkPasswordComplexity();
            JOptionPane.showMessageDialog(null,object.registerUser());
        }
        
        //Sediela, 2024
        //Login Feature(Part 1 changes)
        if(object.checkUserName() == true && object.checkPasswordComplexity() == true){
           JOptionPane.showMessageDialog(null, "Your account has been succesfully created."
                                            + "\nPlease click the button below to login.");
           username = JOptionPane.showInputDialog(null, "Please enter your username:");
           password = JOptionPane.showInputDialog(null, "Please enter your password:");
        
           //Login Feature Setters(Part 1 changes)
           object.setUsername(username);
           object.setPassword(password);
        
           //While loop
           while(object.loginUser() != true){
                 JOptionPane.showMessageDialog(null,object.returnLoginStatus());
                 username = JOptionPane.showInputDialog(null, "Please enter your username:");
                 password = JOptionPane.showInputDialog(null, "Please enter your password:");
        
                 //Login Feature Setters(Part 1 changes)
                 object.setUsername(username);
                 object.setPassword(password);
           }
           JOptionPane.showMessageDialog(null,object.returnLoginStatus());
        }
        
        //IIE,2023
        //Welcome Message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        //IIE,2023   
        //Menu
        menu = JOptionPane.showInputDialog(null, "Please enter the number of the option you would like to explore: "
                                                  + "\n 1) Add tasks "
                                                  + "\n 2) Show report "
                                                  + "\n 3) Quit ");
        menuNum = Integer.parseInt(menu);
        
        //Menu options
        if(menuNum == 1){
           tasks = JOptionPane.showInputDialog(null, "Please enter the number of tasks you would like to create:" );
           taskNum = Integer.parseInt(tasks);
           getData(taskNum);
        }else if(menuNum == 2){
           JOptionPane.showMessageDialog(null, "Coming soon");
        }else if(menuNum == 3){
           JOptionPane.showMessageDialog(null, "Program has been exited.");
           System.exit(0);
        }
        
    }
    //Farrell, 2019
    //Get Data Method to fill in an empty object
    public static void getData(int taskNum){
        //Declarations
        String taskName;
        String taskDesc;
        String devFirstName;
        String devLastName;
        String taskID;
        int taskDuration;
        String taskStatus;
        int taskStatusNum;
        
        //Class object
        Task data = new Task();
        
        //Sediela, 2024
        //Tasks Loop
        int x = 0;
        while(x < taskNum){
             x++;
             taskName = JOptionPane.showInputDialog(null, "Please enter Task #" + x + " name:" );
             taskDesc = JOptionPane.showInputDialog(null, "Please enter Task #" + x + " description:"
                                                         + "\nPlease note the description should not exceed 50 characters." );
             data.setTaskDesc(taskDesc);
             
             //Task description check loop
             while(data.checkTaskDescription() != true){
                  JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                  taskDesc = JOptionPane.showInputDialog(null, "Please enter Task #" + x + " description:"
                                                         + "\nPlease note the description should not exceed 50 characters." );
                  data.setTaskDesc(taskDesc);
             }
             
             JOptionPane.showMessageDialog(null, "Task successfully captured.");
             devFirstName = JOptionPane.showInputDialog(null, "Please enter the developer's first name for Task #" + x + " :" );
             devLastName = JOptionPane.showInputDialog(null, "Please enter the developer's last name for Task #" + x + " :" );
             
             //TaskID
             data.setTaskName(taskName);
             data.setTaskNum(x);
             data.setDevFirstName(devFirstName);
             
             taskID = data.createTaskID();
             data.setTaskID(taskID);
             
             taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration in hours of Task #" + x + " :" ));
             data.returnTotalHours();  
             
             //Task Status
             taskStatus = JOptionPane.showInputDialog(null, "Please enter the number of the option which best describes the status of Task #" + x + " :"
                                                           + "\n 1) To do "
                                                           + "\n 2) Done "
                                                           + "\n 3) Doing ");
             taskStatusNum = Integer.parseInt(taskStatus);
             
             //Sediela, 2024
             if(taskStatusNum == 1){
                 taskStatus = "To do";
             }else if(taskStatusNum == 2){
                 taskStatus = "Done";
             }else if(taskStatusNum == 3){
                 taskStatus = "Doing";
             }
             
             //Print Task Details
             data.setTaskStatus(taskStatus);
             data.setDevLastName(devLastName);
             data.setTaskDuration(taskDuration);
             
             JOptionPane.showMessageDialog(null, data.printTaskDetails()); 
        }
          JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + data.returnTotalHours());
         
    }
    
}

/*Reference List
Farrell, J. 2019. Java Programming. 9th Edition. 2019. Course Technology, Cengage Learning
Sediela, S. 2024. PersonTest.java . [Class Activity]. Pretoria: Unpublished.
The IIE. 2023. Portfolio Of Evidence [PROG5121 POE]. The Independent Institute of Education: Unpublished.*/