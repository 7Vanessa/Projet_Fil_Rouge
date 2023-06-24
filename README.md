# Projet Fil Rouge

The feature we decided to implement was the catalog.
##	The design pattern:
We decided to implement a course catalog management system using the DAO design pattern to map data access. Here is a summary of the classes we implemented as well as their relationships:
1.	The Catalog class represents a catalog and contains an ID, a name, and a list of fields.
2.	The Course class represents a course and contains an ID, a name, a price, a list of training sessions (TrainingSession), content, and a topic ID.
3.	The Field class contains an ID, a catalog ID, a name, and a list of themes.
4.	The Theme class represents a theme and contains an ID, a field ID, a name, and a list of topics.
5.	The Topic class represents a topic and contains an ID, a theme ID, a name, a boolean isSubTopic to indicate if it's a sub-topic or not, a list of sub-topics, a list of courses, and a parent topic ID in the case of a sub-topic.
6.	The TrainingSession class represents a training session and contains an ID, a date, a location, the number of participants, and a course ID.
7.	The abstract DAO class defines the basic CRUD operations (create, read, update, delete) for the data classes.
8.	The CatalogDAO class extends the DAO class and implements operations specific to catalogs, such as catalog search, creation, update, and deletion.
9.	The CourseDAO class extends the DAO class and implements operations specific to courses, such as course search, creation, update, and deletion.
10.	The FieldDAO class extends the DAO class and implements operations specific to fields, such as field search, creation, update, and deletion.
11.	The ThemeDAO class extends the DAO class and implements operations specific to themes, such as theme search, creation, update, and deletion.
12.	The TopicDAO class extends the DAO class and implements operations specific to topics, such as topic search, creation, update, and deletion.
13.	The TrainingSessionDAO class extends the DAO class and implements operations specific to training sessions, such as session search, creation, update, and deletion.

The DAO classes use the enumerations CatalogEnum, FieldEnum, TopicEnum, ThemeEnum, CourseEnum, and TrainingSessionEnum to initialize catalog data.
We chose to use the DAO design pattern because it provides abstraction between business logic and data management. In fact, this pattern makes the code easy to maintain and read.
The other advantages of the DAO’s use are as following:
-	Encapsulation: the DAO encapsulates the way data is managed (create, delete, update, find methods). This allows the rest of the application to manage this part independently of the technology used to store the data.
-	Code reusability: by encapsulating data access logic in DAOs, it's easier to reuse this logic elsewhere in the application. In this way, DAOs centralize and standardize the way data is accessed, eliminating the need to duplicate code.
-	Flexibility and maintainability: if the database type is changed (from relational database to a NoSQL database for example). We would only need to modify the DAO implementation.

## What about the SOLID principles?

Our implementation satisfies the SOLID principles.
Concerning the Single Responsibility Principle (SRP):
-	The Catalog, Course, Field, Theme, Topic, and TrainingSession classes adhere to the SRP because they have a single, clearly defined responsibility, which is the management of their respective attributes.
-	The use of the DAO (Data Access Object) design pattern allows for the separation of business logic (contained in other classes) from data access. DAO classes focus solely on managing data read/write operations, while other classes concentrate on specific business operations.

Concerning the Open/Closed Principle (OCP):
-	The Catalog, Course, Field, Theme, Topic, and TrainingSession classes are closed for modification as they provide access and modification methods for their internal properties without exposing their internal implementation.
-	The DAO classes (CatalogDAO, CourseDAO, FieldDAO, ThemeDAO, TopicDAO, and TrainingSessionDAO) also adhere to the OCP as they provide basic operations (create, read, update, delete) for the corresponding classes without requiring direct modification of these classes.

Concerning or the Liskov Substitution Principle (LSP):
-	The DAO classes adhere to the LSP. For example, since the TopicDAO, ThemeDAO, FieldDAO, CourseDAO, TrainingSessionDAO, and CatalogDAO classes extend the DAO<T> class, it is possible to replace the DAO<T> class with TopicDAO, which extends the DAO<Topic> class.

Concerning the Interface Segregation Principle (ISP):
-	The classes do not explicitly define interfaces, but the code structure avoids implementing unnecessary or unused methods in each class.

Concerning the Dependency Inversion Principle (DIP):
-	The DAO classes (CourseDAO, TopicDAO, etc.) adhere to the DIP by extending the abstract DAO<T> class. This facilitates the extension and replacement of DAO classes without affecting other parts of the code. As a result, the code is less coupled and easier to maintain.
