# TP TodoList JAX-RS

## Gestion complète d’une TodoList avec BDD

todolistetp est une base de données pour la gestion d'une liste de tâches, avec des informations sur les urgences et les utilisateurs associés.

## Installation

Pour installer la base de données todolistetp, vous pouvez utiliser les requêtes SQL suivantes :

<pre><code>CREATE DATABASE todolistetp;
    USE todolistetp;
    CREATE TABLE utilisateur (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50)
);

CREATE TABLE urgence (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50)
);

CREATE TABLE todo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50),
    descriptionTodo VARCHAR(255),
    dateTodo date,
    id_urgence INT,
    FOREIGN KEY(id_urgence) REFERENCES urgence(id),
    id_utilisateur int,
    FOREIGN KEY(id_utilisateur) REFERENCES utilisateur(id)
);</code></pre>


Ces requêtes créent la base de données todolistetp avec trois tables : 
`utilisateur`, `urgence` et `todo`. 

La table `utilisateur` contient des informations sur les utilisateurs, 
la table `urgence` contient des informations sur les différentes urgences 
et la table `todo` contient les tâches à effectuer, 
avec des informations sur l'urgence et l'utilisateur associé.

## Utilisation

Une fois que vous avez installé la base de données todolistetp, vous pouvez ajouter des enregistrements à la table `utilisateur` en utilisant des requêtes INSERT. 

Par exemple :

`INSERT INTO utilisateur (nom, prenom) VALUES ('Osaki', 'Nana');`

Pour ce qui est des todo et des urgences, ils seront gérer par le Java ;)

## API CRUD JAVA-RS

... en cours

### ⭐ Langages et outils utilisés :

<img align="left" alt="My SQL" width="8%" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" style="padding-right:10px;" />
<img align="left" alt="IntelliJ" width="8%" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" style="padding-right:10px;" />
<img align="left" alt="JAVA" width="8%" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" />
<img align="left" alt="Git" width="8%" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" style="padding-right:10px;" />
<img align="left" alt="HTML5" width=8%" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" style="padding-right:10px;" />
<img align="left" alt="CSS3" width=8%" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" style="padding-right:10px;" />
