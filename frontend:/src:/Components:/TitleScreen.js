import React from 'react';

const TitleScreen = ({ onSelectCharacter }) => {
    const characters = [
        { name: "Alice", description: "A kind-hearted girl." },
        { name: "Bob", description: "A sporty guy." },
        { name: "Charlie", description: "An artistic soul." },
        { name: "Diana", description: "A mysterious figure." }
    ];

    return (
        <div className="title-screen">
            <h1>Dating Simulator</h1>
            {characters.map((character) => (
                <div key={character.name}>
                    <button onClick={() => onSelectCharacter(character)}>{character.name}</button>
                </div>
            ))}
        </div>
    );
};

export default TitleScreen;
