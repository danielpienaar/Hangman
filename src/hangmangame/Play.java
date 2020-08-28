/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

/**
 *
 * @author Daniel
 */
public class Play
{

    private String word = "";
    private String username = "";
    private String password = "";
    private int level = 0;
    private int guesses = 6;
    private int score = 0;

    Play(String w, String u, String p, int l, int g, int s)
    {
        word = w;
        username = u;
        password = p;
        level = l;
        guesses = g;
        score = s;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int s)
    {
        score = s;
    }

    public int getGuesses()
    {
        return guesses;
    }

    public void setGuesses(int g)
    {
        guesses = g;
    }

    public String calculateGuess(String letter, String word, String display)
    {
        //accepts the letter guessed, the correct word and what is currently displayed, and returns an updated display string
        int dispLength = display.length();
        String[] disp = new String[dispLength];
        boolean correct = false;

        for (int j = 0; j < dispLength; j++)
        {
            disp[j] = "" + display.charAt(j);
        }
        for (int i = 0; i < word.length(); i++)
        {
            String temp = "" + word.charAt(i);
            if (letter.toLowerCase().equals(temp))
            {
                disp[i] = temp;
                correct = true;
            }
        }
        display = "";
        for (int k = 0; k < dispLength; k++)
        {
            display += disp[k];
        }
        if (correct == false)
        {
            guesses--;
        } else if (correct == true)
        {
            score = score + guesses;
        }
        return display;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String w)
    {
        word = w;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String u)
    {
        username = u;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String p)
    {
        password = p;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int l)
    {
        level = l;
    }
}
