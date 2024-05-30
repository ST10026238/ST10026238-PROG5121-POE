/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kanbanboards;
//Farrell, 2019
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
    //Farrell, 2019
    //Data fields
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    
    //Farrell, 2019
    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    //Farrell, 2019
    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
    //Farrell, 2019
    //Methods
    public boolean checkUserName(){
        //Declaration
        boolean usernameResult;
        
        //Sediela, 2024
        //If statements
        if(username.contains("_") && username.length() <= 5){
           usernameResult = true;
           
        }
        else{
           usernameResult = false;
        }
        
        //Return  variable
        return usernameResult;
    }
    
    //Sediela, 2024
    public boolean checkPasswordComplexity(){
        //Declaration 
        boolean passwordResult;
        String pattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*()_+`=\\{\\}\\[:;'|'\\\\<>,.?/]).*";
        
        if(password.length() > 8 && password.matches(pattern)){
            passwordResult = true;
        }
        else{
            passwordResult = false;
        }
          
        //Return variable
        return passwordResult;
    }
    
    //Farrell, 2019
    public String registerUser(){
        //Declaration
        String usernameMessage;
        String passwordMessage;
        String message = "error";
        
        //If statements
        if(checkUserName()){
            usernameMessage ="Username successfully captured."; 
        }
        else{
            usernameMessage ="Username is not correctly formatted, please ensure that the username:"
                             + "\n-contains an underscore" 
                             +"\n-no more than 5 characters in length";
        }
        //Farrell, 2019
        if(checkPasswordComplexity()){
            passwordMessage ="Password successfully captured."; 
        }
        else{
            passwordMessage ="Password is not correctly formatted, please ensure that the password contains:"
                             + "\n-at least 8 characters" 
                             +"\n-a capital letter"
                             +"\n-a number"
                             +"\n-a special character";
            
        }
        //Farrell, 2019
        //If statements 
        if(checkUserName() && checkPasswordComplexity()){
            message = usernameMessage + "\n" + passwordMessage;
        }
        else{
            message = usernameMessage + "\n" + passwordMessage;
        }
        
        //Return variable
        return message;
    }
    
    //Sediela, 2024
    public boolean loginUser(){
        //Declaration
        boolean verified;
        
        //If statements
        if(checkUserName() && checkPasswordComplexity()){
            verified = true;
        }
        else{
            verified = false;
        }
        
        //Return variable
        return verified;
    }
    
    //Farrell, 2019
    public String returnLoginStatus(){
        //Declarations
        String status;
        
        //If statements
        if(loginUser()){
            status = "Welcome " + firstName + " " + lastName + " ,it is great to see you again." ;
        }
        else{
            status = "Username or password incorrect, please try again.";
        }
        
        //Return variable
        return status;  
    }   
}
/*Reference List
Farrell, J. 2019. Java Programming. 9th Edition. 2019. Course Technology, Cengage Learning
Sediela, S. 2024. PersonTest.java . [Class Activity]. Pretoria: Unpublished.
The IIE. 2023. Portfolio Of Evidence [PROG5121 POE]. The Independent Institute of Education: Unpublished.*/
