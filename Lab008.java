
package lab008;


public class Lab008 {

    public static void main(String[] args){
        User user01 = new User("Emmanuel", "Chicago");
       user01.tweet("Hello everyone! This is my first tweet!").display();
        
        
        User user02 = new User ("Joe");
        user02.tweet("Hi this is Joe").display();
        
        User user03 = new User ("Emily", "NYC");
        user03.tweet("Such a beautiful day in New York today").display();
        
        user02.tweet("I wish i could get some pizza right now").display();
       
        
    }
    
}
