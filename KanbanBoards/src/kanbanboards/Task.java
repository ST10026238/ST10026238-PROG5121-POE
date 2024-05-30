/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kanbanboards;

/**
 *
 * @author lab_services_student
 */
public class Task {
    //Sediela, 2024
    //Data fields
    private String taskDesc;
    private String taskName;
    private int taskNum;
    private String devFirstName;
    private String devLastName;
    private String taskID;
    private String taskDetails;
    private String taskStatus;
    private int taskDuration;
    private int totalHours = 0;

    //Sediela, 2024
    //Getters
    public String getTaskDesc() {
        return taskDesc;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getTaskNum() {
        return taskNum;
    }
    public String getDevFirstName() {
        return devFirstName;
    }
    public String getTaskID() {
        return taskID;
    }
    public String getDevLastName() {
        return devLastName;
    }
    public String getTaskStatus() {
        return taskStatus;
    }
    public int getTaskDuration() {
        return taskDuration;
    }
    

    //Sediela, 2024
    //Setters
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }
    public void setDevFirstName(String devFirstName) {
        this.devFirstName = devFirstName;
    }
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }
    public void setDevLastName(String devLastName) {
        this.devLastName = devLastName;
    }
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }
    
    //IIE, 2023
    public boolean checkTaskDescription(){
        //Declaration
        boolean check;
        
        //If statements
        if(taskDesc.length() <= 50){
            check = true;
        }else{
            check = false;
        }
        
        //Return variable
        return check;
    }
    
    //IIE, 2023
    public String createTaskID(){
        //TaskID
        taskID =  taskName.toUpperCase().substring(0,2) + ":" + taskNum + ":" +  devFirstName.toUpperCase().substring(0,3);
        
        //Return variable
        return taskID;
    }
    
    //IIE, 2023
    public String printTaskDetails(){
        //Task Details 
        taskDetails = "Task Status: " + taskStatus
                      +"\nDeveloper details: " + devFirstName + " " + devLastName
                      +"\nTask Number: " + taskNum
                      +"\nTask Name: " + taskName
                      +"\nTask Description: " + taskDesc
                      +"\nTask ID: " + taskID
                      +"\nDuration: " + taskDuration;
        
        //Return variable
        return taskDetails;
    }
    
    //IIE, 2023
    public int returnTotalHours(){
        //Calculation
        totalHours = totalHours + taskDuration;
        
        //Return variable
        return totalHours;
    }
}
/*Reference List
Farrell, J. 2019. Java Programming. 9th Edition. 2019. Course Technology, Cengage Learning
Sediela, S. 2024. PersonTest.java . [Class Activity]. Pretoria: Unpublished.
The IIE. 2023. Portfolio Of Evidence [PROG5121 POE]. The Independent Institute of Education: Unpublished.*/


