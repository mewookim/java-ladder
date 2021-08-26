package ladder.model;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<User> users = new ArrayList<>();

    public Users(String[] userNames) {
        for (String name : userNames) {
            containsUser(name);
            this.users.add(new User(name));
        }
    }

    public int participantsSize() {
        return users.size();
    }

    public List<User> getParticipants() {
        return this.users;
    }

    public void containsUser(String name) {
        if (users.stream().anyMatch(user -> user.nameInfo().equals(name))) {
            throw new IllegalArgumentException();
        }
    }

}
