package sendgrid;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rg029761 on 9/11/16.
 */
public class UserService {

    private final String serviceName;
    Map<Integer, User> idToUserMap = new LinkedHashMap<Integer, User>();

    public UserService(String serviceName) {
    Preconditions.checkNotNull(serviceName, "serviceName cannot be null");
    this.serviceName = serviceName;
    }

    public void addUser(User user) {
        if(user == null || user.getName() == null || user.getId() < 0) {
            return;
        }
        idToUserMap.put(user.getId(), user);
    }

    public void deleteUser(User user) {
    if(idToUserMap.containsKey(user.getId())) {
        idToUserMap.remove(user.getId());
    }
    }

    public List<User> getUsers() {
        return new ArrayList<User>(idToUserMap.values());
    }

    public void registerListener(UserService userService) {
        userService = this;
    }

    public void deregisterListener(UserService userService) {

    }

    @Override
    public String toString() {
        return serviceName;
    }
}

