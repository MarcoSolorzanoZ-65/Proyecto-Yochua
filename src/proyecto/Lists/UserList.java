package proyecto.Lists;

import proyecto.sampleClasses.User;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 23:13:05
 * @date 26 nov. 2021
 */
public class UserList {

    private User[] userList;
    private int index = 0;

    public UserList() {
        this.userList = new User[10];
    }

    public UserList(User[] userVector) {
        if (userVector == null) {
            this.userList = new User[10];
        } else {
            this.userList = userVector;
        }
    }

    public void setUser(String username, String password) {
        userList[index] = new User(username, password);

        index++;
    }
    
    
}
