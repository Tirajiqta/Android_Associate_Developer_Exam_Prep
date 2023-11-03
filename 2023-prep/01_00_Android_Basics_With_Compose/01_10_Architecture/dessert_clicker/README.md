Dessert Clicker app
=====================

Code for Android Basics with Compose Codelab.

Introduction
------------

Dessert Clicker is a game about making desserts.

Press the button, make a dessert, earn the big bucks.

You use this app in the course to explore the Android lifecycle and log messages to
the Android console (Logcat).

Pre-requisites
--------------

You need to know:
- How to open, build, and run apps with Android Studio.
- What an activity is, and how to create one in your app.
- What the activity's onCreate() method does, and the kind of operations
  that are performed in that method.


Getting Started
---------------

1. Download and run the app.

NOTES
---------------
Android activities, begin with the onCreate() method. 
As the user starts your app, navigates between activities, navigates inside and outside of your app, the activity changes state.
An Android app can have multiple activities. However, it is recommended to have a single activity.
activity lifecycle
initialized(onCreate) -> Created(onStart, onRestart*) -> Started(onResume) -> Resumed(Activity has focus, onPause)
-> Started(Activity is visible, onStop) -> Created(onStop) -> Destroyed(onDestroy)