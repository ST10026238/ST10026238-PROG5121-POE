/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kanbanboards;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */

 //Sediela, 2024
public class LoginTest {
    
    public LoginTest() {
    }
    //Sediela, 2024
    @Test
    public void testCheckUserName() {
        //Arrange
        String expected = "kyl_1";
        
        //Act
        Login object = new Login();
        object.setUsername(expected);
        boolean actual = object.checkUserName();
        
        //Assert
        assertEquals(true, actual);
    }
    //Sediela, 2024
    @Test
    public void testCheckUserName1() {
        //Arrange
        String expected = "kyle!!!!!!!";
        
        //Act
        Login object = new Login();
        object.setUsername(expected);
        boolean actual = object.checkUserName();
        
        //Assert
        assertEquals(false, actual);
    }
    //Sediela, 2024
    @Test
    public void testCheckPasswordComplexity() {
        //Arrange
        String expected = "Ch&&sec@ke99!";
        
        //Act
        Login object = new Login();
        object.setPassword(expected);
        boolean actual = object.checkPasswordComplexity();
        
        //Assert
        assertEquals(true, actual);
    }
    //Sediela, 2024
    @Test
    public void testCheckPasswordComplexity1() {
        //Arrange
        String expected = "password";
        
        //Act
        Login object = new Login();
        object.setPassword(expected);
        boolean actual = object.checkPasswordComplexity();
        
        //Assert
        assertEquals(false, actual);
    }
    //Sediela, 2024
    @Test
    public void testReturnLoginStatus() {
        //Arrange 
        String expectedUsername = "kyl_1";
        String expectedPassword = "Ch&&sec@ke99!";
        
        //Act
        Login object = new Login();
        object.setUsername(expectedUsername);
        object.setPassword(expectedPassword);
        object.checkUserName();
        object.checkPasswordComplexity();
        boolean actual = object.loginUser();
        
        //Assert
        assertTrue(actual);
    }
    //Sediela, 2024
    @Test
    public void testReturnLoginStatus1() {
        //Arrange 
        String expectedUsername = "kyle!!!!!!!";
        String expectedPassword = "password";
        
        //Act
        Login object = new Login();
        object.setUsername(expectedUsername);
        object.setPassword(expectedPassword);
        object.checkUserName();
        object.checkPasswordComplexity();
        boolean actual = object.loginUser();
        
        //Assert
        assertFalse(actual);
    }
    //Sediela, 2024
    @Test
    public void testUsernameStatus() {
        //Arrange
        String expected = "kyl_1";
        
        //Act
        Login object = new Login();
        object.setUsername(expected);
        boolean actual = object.checkUserName();
        
        //Assert
        assertTrue(actual);
    }
    //Sediela, 2024
    @Test
    public void testUsernameStatus1() {
        //Arrange
        String expected = "kyle!!!!!!!";
        
        //Act
        Login object = new Login();
        object.setUsername(expected);
        boolean actual = object.checkUserName();
        
        //Assert
        assertFalse(actual);
    }
    //Sediela, 2024
    @Test
    public void testPasswordStatus() {
        //Arrange
        String expected = "Ch&&sec@ke99!";
        
        //Act
        Login object = new Login();
        object.setPassword(expected);
        boolean actual = object.checkPasswordComplexity();
        
        //Assert
       assertTrue(actual);
    }
    //Sediela, 2024
    @Test
    public void testPasswordStatus1() {
        //Arrange
        String expected = "password";
        
        //Act
        Login object = new Login();
        object.setPassword(expected);
        boolean actual = object.checkPasswordComplexity();
        
        //Assert
       assertFalse(actual);
    }
}
/*Reference List
Farrell, J. 2019. Java Programming. 9th Edition. 2019. Course Technology, Cengage Learning
Sediela, S. 2024. PersonTest.java . [Class Activity]. Pretoria: Unpublished.
The IIE. 2023. Portfolio Of Evidence [PROG5121 POE]. The Independent Institute of Education: Unpublished.*/
