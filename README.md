# Car-Race
Simple race simulation between cars, motorcycles and trucks. 
Depending on various factors like rain or accident each types of vehicle behave differently. 
The results are presented in terminal. This is an assignement from my school - Codecool.

Commit with all my work: created an abstract class for vehicles. 
Car, motorcycle and truck differ in speed and in implementation of abstract methods inherired from superclass. 
For example there is a method checkForSlowingModifier that checks different type of data for every type of vehicle. 
Motorcycle is vulernable for rain and truck can sometimes has an accident. 
Because of that Truck also implement interface breakable. 
I tried to keep the MVC architecture: superclass and subclasses are in the package model, Race class is the controller and there is also View class that holds static methods for printing different informations.
