for (int index = 0 ; index < allGuesses.size() ; ++index) {
        if (allGuesses.get(index) == input) {
        System.out.println("You already used that character!");
        return allGuesses;
        }
        }
        allGuesses.add(input);
        return allGuesses;