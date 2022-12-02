# GUIProject
By Craig Doyle & Ben Stobie


## Classes
- VideoRental (Main)
- LoginForm (Logging into App)
- MainApp
- AdminMan
- DBComms
- Manager

### Manager & DBComms
These classes are used for caching and communicating with the database. At the start of the function each of these is initialized and are then passed as arguments to each of the form classes. The Manager class stores information about the user and is in some cases used in between the application and the Database communication class