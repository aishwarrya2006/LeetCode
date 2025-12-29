import java.util.*;
class Solution {
    public int romanToInt(String s) 
    {
        List<Character> str = new ArrayList<>();
        for(char c : s.toCharArray())
        {
            str.add(c);
        }
        int num = 0;
        int i;
        for(i = 0; i<str.size()-1; i++)
        {
            char curr = str.get(i+1);
            char prev = str.get(i);
            if(identify(prev) == identify(curr))
            {
                num = num+identify(prev);
            }
            else if(identify(prev) < identify(curr))
            {
                num = num-identify(prev);
            }
            else if(identify(prev) > identify(curr))
            {
                num = num+identify(prev);
            }
        }
        num = num+identify(str.get(i));
        return num;
    }

    public int identify(char ch)
    {
        switch(ch)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}