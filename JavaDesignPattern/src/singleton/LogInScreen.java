/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Arvin Situmorang
 */
public class LogInScreen {

    public LogInScreen() {
        User user = new User();
        NonSingletonManager.setLoggedInUser(user);

        System.out.println("");
    }
}
