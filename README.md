# Raindrops

## About

The task I set out to achieve goes as follows:

Write a function that takes as its input a number (n) and converts it to a string, the contents of which depend on the numbers factors

- if the number has a factor of 3, output **'Pling'**
- if the number has a factor of 5, output **'Plang'**
- if the number has a factor of 7, output **'Plong'**
- if the number does not have any of the above as a factor simply return the numbers digits

### Examples

- _28's_ factors are 1, 2, 4, 7, 14 and 28: this would be a simple **'Plong'**
- _30's_ factors are 1, 2, 3, 5, 6, 10, 15, 30: this would be a **'PlingPlang'**
- _34_ has four factors: 1, 2, 17, and 34: this would be **'34'**

## Approach

I first began by setting up a maven project with the apppropriate dependencies, these being centred around testing, since I intended to implement TDD to execute the task. I created a test to pass, then proceeded to write code to pass that test, committing one change at a time.

Due to my lack of experience with mocking, I have yet to create any tests for the prompter at the time of typing this, but may revisit once I have exeprience in that realm.
