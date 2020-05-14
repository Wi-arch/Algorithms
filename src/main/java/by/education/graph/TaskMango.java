package by.education.graph;

import java.util.*;

//Ch. 6
public class TaskMango {

    interface Person {
        List<Person> getAllFriends();

        boolean isMangoSeller();
    }

    public Person findMangoSeller(Person you) {
        if (you.isMangoSeller()) {
            return you;
        }
        Queue<Person> searchQueue = new LinkedList<>();
        Set<Person> checkedPersons = new HashSet<>();
        addAllFriendsToSearchingList(searchQueue, you);
        checkedPersons.add(you);
        Person currentPerson = null;
        while (!searchQueue.isEmpty()) {
            currentPerson = searchQueue.poll();
            if (!checkedPersons.contains(currentPerson)) {
                if (currentPerson.isMangoSeller()) {
                    return currentPerson;
                }
                addAllFriendsToSearchingList(searchQueue, currentPerson);
                checkedPersons.add(currentPerson);
            }
        }
        throw new RuntimeException("Cannot find mango seller");
    }

    private void addAllFriendsToSearchingList(Queue<Person> persons, Person person) {
        for (Person friend : person.getAllFriends()) {
            persons.add(friend);
        }
    }
}
