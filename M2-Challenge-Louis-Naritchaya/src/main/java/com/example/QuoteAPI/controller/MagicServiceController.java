package com.example.QuoteAPI.controller;

import com.example.QuoteAPI.model.DefinitionOfWords;
import com.example.QuoteAPI.model.MagicAnswers;
import com.example.QuoteAPI.model.QuoteofTheDay;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController

public class MagicServiceController<Private> {
     Random rand = new Random();

    private static List<QuoteofTheDay> quoteList = new ArrayList<>(Arrays.asList(
            new QuoteofTheDay(1, "Dalai Lama", "The purpose of our lives is to be happy."),
            new QuoteofTheDay(2, "Soren Kierkegaard", "Life is not a problem to be solved, but a reality to be experienced."),
            new QuoteofTheDay(3, "Oprah Winfrey", "Turn your wounds into wisdom."),
            new QuoteofTheDay(4, "Deepak Chopra", "The healthiest response to life is joy."),
            new QuoteofTheDay(5, "T.S. Eliot", "Every moment is a fresh beginning."),
            new QuoteofTheDay(6, "Jennifer Aniston", "There are no regrets in life, just lessons."),
            new QuoteofTheDay(7, "Jane Fonda", "It’s never too late – never too late to start over, never too late to be happy."),
            new QuoteofTheDay(8, "John Wayne", "Life’s tough, but it’s tougher when you’re stupid."),
            new QuoteofTheDay(9, "Jack Nicholson", "The minute that you’re not learning I believe you’re dead."),
            new QuoteofTheDay(10, "Buddha", "Be where you are; otherwise you will miss your life."),
            new QuoteofTheDay(11,"Napoleon Hill", "If you cannot do great things, do small things in a great way."),
            new QuoteofTheDay(12,"Steve Jobs","Your time is limited, so don't waste it living someone else's life."),
            new QuoteofTheDay(13,"Gary Vaynerchuk", "Without hustle, talent will only carry you so far."),
            new QuoteofTheDay(14, "Og Mandino",  "Always do your best. What you plant now, you will harvest later." ),
            new QuoteofTheDay(15, "Robert Kiyosaki","Don't let the fear of losing be greater than the excitement of winning.")
    ));

    private  static List<DefinitionOfWords> wordList = new ArrayList<>(Arrays.asList(
            new DefinitionOfWords(1, "Home", "The place where one lives permanently, especially as a member of a family or household."),
            new DefinitionOfWords(2, "Food", "Any nutritious substance that people or animals eat or drink or that plants absorb in order to maintain life and growth."),
            new DefinitionOfWords(3, "Car", "A four-wheeled road vehicle that is powered by an engine and is able to carry a small number of people."),
            new DefinitionOfWords(4, "Computer", "An electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program."),
            new DefinitionOfWords(5, "Laptop", "A computer that is portable and suitable for use while traveling."),
            new DefinitionOfWords(6, "TV", "A device that receives television signals and reproduces them on a screen."),
            new DefinitionOfWords(7, "Mouse", "A small handheld device that is dragged across a flat surface to move the cursor on a computer screen, typically having buttons that are pressed to control functions."),
            new DefinitionOfWords(8, "Keyboard", "A panel of keys that operate a computer or typewriter."),
            new DefinitionOfWords(9, "Tesla", "The SI unit of magnetic flux density."),
            new DefinitionOfWords(10, "Printer", "A machine for printing text or pictures onto paper, especially one linked to a computer.")
    ));

    static List<MagicAnswers> answerList = new ArrayList<>();
    int idCounter = 1;
    private  static List<String> answerString = new ArrayList<>(Arrays.asList(
            "Nope",
            "Maybe",
            "I doubt it",
            "Of course",
            "I don't think so",
            "No way!",
            "No!!!!",
            "I have no idea",
            "Definitely yes!",
            "Yes"

    ));

   @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public QuoteofTheDay getQuote(){
        int randomQuoteIndex = rand.nextInt(quoteList.size());
        QuoteofTheDay selectedQuote = quoteList.get(randomQuoteIndex);
        return selectedQuote;
   }

   @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
   public DefinitionOfWords getWord(){
        int randomWordIndex = rand.nextInt(wordList.size());
        DefinitionOfWords selectedWord = wordList.get(randomWordIndex);
        return selectedWord;
   }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MagicAnswers getAnswer(@RequestBody MagicAnswers answer){
        int randomChoice = rand.nextInt(answerString.size());
        String randomAnswer = answerString.get(randomChoice);
        answer.setId(idCounter++);
        answer.setAnswer(randomAnswer);
        return answer;
    }
}
