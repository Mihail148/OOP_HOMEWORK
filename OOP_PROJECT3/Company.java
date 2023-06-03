package OOP_PROJECT3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User> {

    private User user;

    public Company(User user){
        this.user = user;
    }


    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>(){
        List<User> users = getTreeDeep(user);
        Iterator<User> iterator = users.iterator();
        @Override
        public boolean hasNext(){
            return users.iterator().hasNext();
        }

        @Override
        public User next(){
            return users.iterator().next();
        }
        
    }

    public List<User> getTreeDeep(User user){
        List<User> users = new ArrayList<>();
        users.add(user);
        if (user.getPersonal() == null){
            return users;
        }
        for(User vassal: user.getPersonal()){
            users.addAll(getTreeDeep(vassal));
        }
        return users;
    }


    
    }
}