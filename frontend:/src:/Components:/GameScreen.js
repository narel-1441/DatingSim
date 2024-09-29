import React, { useState } from 'react';

const GameScreen = ({ character }) => {
    const [story, setStory] = useState("");

    const handleChoice = (choice) => {
        // Implement your choice logic here
        if (choice === "talk") {
            setStory("You talked to " + character.name + ".");
        }
    };

    return (
        <div>
            <h2>Story with {character.name}</h2>
            <p>{story}</p>
            <button onClick={() => handleChoice("talk")}>Talk</button>
            <button onClick={() => handleChoice("walk")}>Walk Away</button>
        </div>
    );
};

export default GameScreen;
