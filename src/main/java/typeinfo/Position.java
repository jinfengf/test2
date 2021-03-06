package typeinfo;

/**
 * Created by jiguang on 2018/5/31.
 */

public class Position {
    private String title;
    private Person person;
    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null)
            person = Person.Null;
    }
    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.Null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null)
            person = Person.Null;
    }

    public String toString() {
        return "Position: " + title + " " + person;
    }
}
