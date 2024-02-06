# Events and Listeners
In Java, events occurred in a widget are notified to listeners.
This project provides a simple example of events and listeners.
The example is a RGB color chooser.

# Packages
## colorChoice
- `ColorFrame.java`:  The main class of this application.
This class has a `JPanel` instance for displaying selected colors.
- `ColorPanel.java`:  This `JPanel` instance has three `JSlider` instances for selecting RGB components.
When one of the sliders changes,  this class notifies an event to the `ColorFrame` class.