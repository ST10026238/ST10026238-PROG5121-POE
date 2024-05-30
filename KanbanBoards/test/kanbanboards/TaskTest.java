/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kanbanboards;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author lab_services_student
 */
public class TaskTest {
    //Sediela, 2024
    //Data fields
    private Task data1 = new Task();
    private Task data2 = new Task();
    
    //Farrell, 2019
    //Default Constructor
    public TaskTest(){
    //Farrell, 2019
    //IIE,2023
    //Setters for Data 1
    data1.setTaskName("Login Feature");
    data1.setTaskNum(1);
    data1.setTaskDesc("Create Login to authenticate users");
    data1.setDevFirstName("Robyn");
    data1.setDevLastName("Harrison");
    data1.setTaskDuration(8);
    data1.setTaskID(data1.createTaskID());
    data1.setTaskStatus("To do");
    
    //Farrell, 2019
    //IIE,2023
    //Setters for Data 2
    data2.setTaskName("Add Task Feature");
    data2.setTaskNum(2);
    data2.setTaskDesc("Create Add Task feature to add task users.");
    data2.setDevFirstName("Mike");
    data2.setDevLastName("Smith");
    data2.setTaskDuration(10);
    data2.setTaskID(data1.createTaskID());
    data2.setTaskStatus("Doing");
    }
    
    //Sediela, 2024
    //IIE,2023
    @Test
    public void testTaskDescription1() {
        //Act
        boolean actual = data1.checkTaskDescription();
        
        //Assert
        assertEquals(true, actual);
    }
    
    //Sediela, 2024
    //IIE,2023
    @Test
    public void testTaskDescription2() {
        //Act
        boolean actual = data2.checkTaskDescription();
        
        //Assert
        assertEquals(true, actual);
    }
    
    //Sediela, 2024
    //IIE,2023
    @Test
    public void testTaskID1() {
        //Act
        String actual = data1.createTaskID();
        
        //Assert
        assertEquals(data1.getTaskID(), actual);
    }
    
    //Sediela, 2024
    //IIE,2023
    @Test
    public void testTaskID2() {
        //Act
        String actual = data2.createTaskID();
        
        //Assert
        assertEquals(data2.getTaskID(), actual);
    }
    
    //Sediela, 2024
    //IIE,2023
    @Test
    public void testTotalHours1() {
        //Act
        int data1Hours = data1.returnTotalHours();
        int data2Hours = data2.returnTotalHours();
        int actual = data1Hours + data2Hours;
        
        //Assert
        assertEquals(18, actual);
    }
    
    //Sediela, 2024
    //IIE,2023
    @Test
    public void testTotalHours2() {
        //Act
        int actual = 10 + 12 + 55 + 11 + 1;
        
        //Assert
        assertEquals(89, actual);
    }
    
}
/*Reference List
Farrell, J. 2019. Java Programming. 9th Edition. 2019. Course Technology, Cengage Learning
Sediela, S. 2024. PersonTest.java . [Class Activity]. Pretoria: Unpublished.
The IIE. 2023. Portfolio Of Evidence [PROG5121 POE]. The Independent Institute of Education: Unpublished.*/
