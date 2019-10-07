package base.services;

import base.repositories.ExpressionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ExpressionService {
    private ExpressionRepository expressionRepository;
    Random random = new Random();

    @Autowired
    public void setExpressionRepository(ExpressionRepository expressionRepository) {
        this.expressionRepository = expressionRepository;
    }

    // This method returns unique expression from the repository bean and removes this expression.
    public String getRandomUniqueExression() {
        int size = expressionRepository.getExpres().size();
        return firstLetterOfFirstSentenceToLowerCase(expressionRepository.getExpres().remove(random.nextInt(size)));
    }

    // This method returns n uniques (but not more than repository bean size) expressions from the repository bean
    public List<String> getListOfRandomUniqueExpressions(int n) {
        List<String> outputList = new ArrayList<>();
        List<String> sourceList=expressionRepository.getExpres();
        int size = sourceList.size();
        final int ints[] = random.ints(0, size).distinct().limit(n <= size ? n : size).toArray();
        for (int a : ints) {
            outputList.add(firstLetterOfFirstSentenceToLowerCase(sourceList.get(a)));
        }
        return outputList;
    }

    public List<String> getAllExpressions() {
        return expressionRepository.getExpres();
    }

    // RegEx example
    private static String firstLetterOfFirstSentenceToLowerCase(String s) {
        StringBuilder a = new StringBuilder();
        a = a.append(s.trim());

        Pattern pattern = Pattern.compile("\\b.+\\b");
        Matcher matcher = pattern.matcher(a);

        if (matcher.find()) {
            int start = matcher.start();
            char firstLetter = a.charAt(start);
            a.setCharAt(start, Character.toLowerCase(firstLetter));

            return a.toString();
        } else return a.toString();
    }
}
