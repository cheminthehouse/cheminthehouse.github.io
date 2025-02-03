# [Chem in the House](https://github.com/cheminthehouse/cheminthehouse.github.io)

## How to Run

1. Ensure you have the latest [Java JDK](https://www.oracle.com/java/technologies/downloads/) downloaded to your computer.
2. Download the code from this repository to your computer as a [ZIP file](https://github.com/cheminthehouse/cheminthehouse.github.io/archive/refs/heads/main.zip).
3. Unzip the file and open the folder in an IDE of your choice, such as [Visual Studio Code](https://code.visualstudio.com/download).
4. Compile and run the `ChemInTheHouse.java` file, where the `main` method is located.
5. The program should open as a new window on your screen. Enjoy the game!

## Implementation

The creation of the game required the use of Java and its Swing framework. The game window is organized by a combination of layout managers, including `GridLayout` and `GridBagLayout`. The custom classes `Txt` and `Btn` are utilized to facilitate the creation of new `JLabel` and `JButton` components. Instances of the custom class `Card` are used to dynamically create the cards in randomized orders and determine which cards are facing upwards. The built-in Swing `Timer` is used to manage the three-minute countdown and delay the turning of mismatched cards by 1.5 seconds.
