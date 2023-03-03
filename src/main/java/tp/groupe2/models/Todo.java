package tp.groupe2.models;

import java.util.Date;

public class Todo {
// attributs
    private String titre, description;
    private Date date;
    private Urgence urgence;
    private User user;

    // getter and setter
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Urgence getUrgence() {
        return urgence;
    }

    public void setUrgence(Urgence urgence) {
        this.urgence = urgence;
    }
// constructeur
    public Todo(String titre, String description, Date date, User user, Urgence urgence) {
        this.urgence = urgence;
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.user = user;

    }


}
