# Chem in the House

## Introduction

- **Title**: Chem in the House

- **Overview**: The purpose of the game is to reinforce knowledge about chemicals commonly found in households by matching chemical formulas to their corresponding real-life applications. The game is played by clicking on cards to flip them in an attempt to find all of the eight matching pairs before the timer reaches three minutes and the cards are shuffled.

## Theme

- **Description**: The theme of the game is chemistry, focusing on the chemical formulas of common household items.

- **Visual Style**: The types of images on the card faces will support the theme of chemistry by displaying a chemical compound in one of two ways. Half of the card faces will have a picture of the chemical structure of a compound found in common household items and a caption stating the chemical formula of the compound in the picture. The other half of the card faces will have an image representing a popular real-life application of its corresponding compound and a caption describing the image.

## Gameplay Mechanics

- **Objective**: The objective of the game is to find all of the eight matching pairs of cards within a period of three minutes or less.

- **Rules**: The game initiates once the player clicks on one of the cards to flip it to the face of the card. The player proceeds to guess on the location of the matching card by clicking on a random card. If the cards match, the cards stay facing upwards, and if they don’t match, the cards flip back to their original position after three seconds of displaying the faces of both cards. The player continues flipping cards, attempting to memorize the locations of the mismatched cards, until all of the cards have been matched or the three minutes have passed, whichever occurs first. If the player locates all of the pairs before the time ends, the game ends. If the timer reaches three minutes before the player finds all of the pairs, theposition of the cards will cards will rearrange themselves into new, randomized positions, and the timer will restart. The shuffling of the cards and restarting of the timer will occur as many times as necessary until the player successfully finds all the pairs within the allotted time or the player quits the game.

- **Controls**: The game will use mouse input from the user to flip the cards and reveal their faces by detecting when the player clicks on the cards to flip them.

## Game Board Design

- **Layout**: The game board contains 16 square cards arranged into four rows and four columns aligned to the right of the window. To the left of the cards, the remaining amount of time is displayed at the top, and the number of matching pairs found is shown below the time. Two buttons are located at the bottom left corner of the screen: the “Restart” button and the “Quit” button. The “Restart” button resets the number of pairs found to 0, flips all of the cards face down, rearranges the cards into random positions, and restarts the three-minute timer. The “Quit” button stops the program and closes the window.

- **Card Design**: The back of all 16 cards shows a graphic of laboratory glassware to symbolize the chemistry theme. Eight of the card faces will have a picture of the chemical structure of a compound found in common household items and a caption stating the chemical formula of the compound in the picture. The other eight card faces will have an image representing a popular real-life application of its corresponding compound and a caption describing the image.

## Additional Features

- **Levels**: Increasing difficulty by decreasing the allotted time with the same amount of cards or increasing the amount of cards with the same allotted time, up to the player’s discretion.

- **Points**: Calculated on a limited scale based on the time taken to find all the pairs and the number of moves used.

- **Leaderboard**: Individual players can replay several times without restarting the program and compare their latest performance with previous attempts. Players can also take turns and compete against each other offline by comparing their points, creating a sense of multiplayer capabilities. The leaderboard would have to be reset each time the program is closed, but as long as the program is running, the leaderboard will continue to be saved.

- **Customization**: Predefined user options to change the default number of cards, time constraints, or card theme.

- **Explanations**: Enhance the educational component of the game by displaying a more detailed description of the compound depicted in each matching pair and its most popular uses once the pair is found by the player. The time spent with the explanation displayed on the player’s screen would not count toward the total time that the user spends on their attempt at matching the cards. A customizable option to enable and disable the explanations would be available.

- **Sound**: Auditory effects each time a card is flipped, a successful match is found, two mismatching cards are flipped, the timer ends, or the player wins.
User Interface (UI)

- **Design**: The home screen of the game will display three buttons: a “Play” button to start the game, an “Instructions” button to learn how the game works, and a “Quit” button to exit the game. Clicking the “Quit” button will cause the program to stop and the window to close. After clicking on the “Instructions” button, the player will be taken to a screen displaying the fundamental objective and rules of the memory matching game, and at the bottom of the screen, they will see two of the same buttons that were visible on the home screen: the “Play” button and the “Quit” button. Once the player clicks the “Play” button, they will be taken to a screen displaying the game board. The game board contains 16 square cards arranged into four rows and four columns aligned to the right of the window. To the left of the cards, the remaining amount of time is displayed at the top, and the number of matching pairs found is shown below the time. Two buttons are located at the bottom left corner of the screen: a “Restart” button, which functions similarly to the “Play” button on the home screen, and the “Quit” button.

- **User Experience (UX)**: The design will make the game easy and enjoyable to play by providing a button on the home screen that allows immediate access to the instructions, which contain a thorough but concise explanation of the fundamental objective and rules, giving the player all of the information required to fully understand the memory matching game concept. Additionally, the “Quit” button will appear on every screen of the game, permitting the user to close the game at any time they choose. All of the text on the buttons and captions of the cards will use large, bold fonts to make them easily readable, so the user will be able to solely focus on enjoying the game rather than attempting to understand what is written on the screen.

## Technical Requirements

- **Tools and Technologies**: The creation of the game will require the use of the programming language Java for the computational logic and its component-based framework Swing for the graphical user interface.

- **Resources Needed**: 16 images depicting a total of eight chemical compounds will be required for the card faces. Eight of the images will have a picture of the chemical structure of a compound found in common household items and a caption stating the chemical formula of the compound in the picture. The other eight will have an image representing a popular use of its corresponding compound and a caption describing the image.
