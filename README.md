# GUIProject
By Craig Doyle & Ben Stobie


## Classes
| Class Name  | Use for Class                                              |
| ----------- | ---------------------------------------------------------- |
| **VideoRental** | Main class / entry point for application                   |
| **LoginForm**   | The first window presented for users to login with         |
| **MainApp**     | This is the main application that users will interact with |
| **AdminMan**    | This is the application for the admin dashboard            |
| **Manager**     | Used as a man in the middle for database comms             |
| **DBComms**     | Class for communicating with the database                  | 

### Manager & DBComms
These classes are used for caching and communicating with the database. At the start of the function each of these is initialized and are then passed as arguments to each of the form classes. The Manager class stores information about the user and is in some cases used in between the application and the Database communication class, to lessen the amount of calls made to the database by caching userdata. This helps to prevent multiple calls to the user from the database.

## Use 
Upon launching the application the user will be presented with a form (LoginForm). This form will prompt the user to login using an email address & password. After entering their details the user may either press the sign in button or alternativly if they are focused on the password field they could also press enter to sign in. If the user is not yet registered they can sign up using the button at the bottom of  the form. They will then be prompted to enter their details after which they should be abe to login using these details.

Upon logging in the user will be presented the main page for the application. There are three tabs in this window. The landing tab will present the users account information & watch / rent history.
The first tab will present the user with a list of all currently available movies to rent, as well as their respective information. The third tab is the Shop here users may subscribe to the subscription service for set periods or permanently, or they can enter the name of a movie to rent just that singular movie for a set period of time.

If  the application detects that the user is an administrator it will present them with an extra option in the account information tab. When the user clicks on this button a new window will open alongside that is the admin dashboard. From here the admin can add / delete movies from the database. They can also delete users or promote them to administrators.

