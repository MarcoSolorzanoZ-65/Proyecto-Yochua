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
    
    public User[] aumentarVector() {
        User[] userList2 = new User[userList.length + 10];
        for (int i = 0; i < userList.length; i++) {
            userList2[i] = userList[i];
        }
        return userList2;
    }
    
    public void setUser(User user) {
        
        if (userList.length == 10) {
            userList = aumentarVector();
        }
        for (int i = userList.length - 1; i > 0; i--) {
            userList[i] = userList[i - 1];

            if (userList.length == 10) {
                userList = aumentarVector();
            }
        }
        userList[0] = user;
    }
    
    public int getTAMANO(){
      return userList.length;  
    }
    
    public User getElemento() {
        int elementoRandom = (int) (Math.random() * index);

        return userList[elementoRandom]; // falta validaciones (null, etc.. )
    }
    
}
